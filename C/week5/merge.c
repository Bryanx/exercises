#include <stdio.h>
#include <time.h>
#include <stdlib.h>


#define MAX_NUMBER 100

int compareCounter = 0;

int compare(int a, int b) {
    compareCounter++;
    return a - b;
}

int *generateRandomList(int nbrOfElements) {
    int *list = calloc(nbrOfElements, sizeof(int));
    int i;
    for (i = 0; i < nbrOfElements; i++) {
        list[i] = rand() % MAX_NUMBER;
    }
    return list;
}

void bubbleSort(int *list, int size) {
    compareCounter = 0;
    int i, j, swappingExecuted;
    for (i = size - 1; i > 0; i--) {
        swappingExecuted = 0;
        for (j = 0; j < i; j++) {
            if (compare(list[j], list[j + 1]) > 0) {
                int tmp = list[j + 1];
                list[j + 1] = list[j];
                list[j] = tmp;
                swappingExecuted = 1;
            }
        }
        if (swappingExecuted == 0) return;
    }
}

int *generateOrderedList(int nbrOfElements) {
    int *list = calloc(nbrOfElements, sizeof(int));
    int i;
    for (i = 0; i < nbrOfElements; i++) {
        list[i] = rand() % MAX_NUMBER;
    }
    bubbleSort(list, nbrOfElements);
    return list;
}

void printList(int *list, int size) {
    int i;
    for (i = 0; i < size; i++) {
        printf("%2d ", list[i]);
    }
    printf("\n");
}

int *merge(int *list1, int *list2, int size1, int size2) {
    compareCounter = 0;
    int sizeMergedList = size1 + size2;
    int *mergedList = calloc(sizeMergedList, sizeof(int));
    int index1 = 0;
    int index2 = 0;
    int ixMergedList = 0;

    for (ixMergedList = 0; ixMergedList < sizeMergedList; ixMergedList++) {
        if (index1 == size1) {
            *(mergedList + ixMergedList) = *(list2 + index2);
            index2++;
        } else if (index2 == size2) {
            *(mergedList + ixMergedList) = *(list1 + index1);
            index1++;
        } else {
            if (compare(list1[index1], list2[index2] > 0)) {
                *(mergedList + ixMergedList) = *(list2 + index2);
                index2++;
            } else {
                *(mergedList + ixMergedList) = *(list1 + index1);
                index1++;
            }
        }
    }
    return mergedList;
}

int main() {
    srand(time(NULL));
    int sizeLijst1 = 5;
    int sizeLijst2 = 7;

    int *lijst1 = generateOrderedList(sizeLijst1);
    printf("Lijst 1: ");
    printList(lijst1, sizeLijst1);

    int *lijst2 = generateOrderedList(sizeLijst2);
    printf("Lijst 2: ");
    printList(lijst2, sizeLijst2);

    int *mergedLijst = merge(lijst1, lijst2, sizeLijst1, sizeLijst2);
    printf("Merged (compares: %d):  ", compareCounter);
    printList(mergedLijst, sizeLijst1 + sizeLijst2);

    double totaal = 0;
    for (int i = 0; i < 100; ++i) {
        merge(lijst2, lijst1, sizeLijst2, sizeLijst1);
        totaal += compareCounter;
    }
    printf("Gemiddeld aantal compares: %.0lf", totaal/100);

    free(lijst1);
    free(lijst2);
    free(mergedLijst);

    return 0;
}
