#include <stdlib.h>
#include <stdio.h>
#include <time.h>

#define MAX_RANDOM_NUMBER 100;

int compareCounter = 0;
int swapCounter = 0;

int compare(int a, int b) {
    compareCounter++;
    return a - b;
}

int *generateRandomList(int nbrOfElements) {
    int *list = calloc(nbrOfElements, sizeof(int));
    int i;
    for (i = 0; i < nbrOfElements; i++) {
        list[i] = rand() % MAX_RANDOM_NUMBER;
    }
    return list;
}

//kleinste zoeken en telkens vooraan steken
int *selectionSort(int *list, int size) {
    int smallest, tmp;
    swapCounter = 0;
    compareCounter = 0;
    for (int i = 0; i < size; ++i) {
        smallest = i;
        for (int j = i + 1; j < size; ++j) {
            if (compare(list[j], list[smallest]) < 0) {
                smallest = j;
            }
        }
        tmp = list[i];
        list[i] = list[smallest];
        list[smallest] = tmp;
        swapCounter++;
    }
}

void printList(int *list, int size) {
    printf("Content (compared %d times, swapped %d times): ", compareCounter, swapCounter);
    int i;
    for (i = 0; i < size; i++) {
        printf("%2d ", list[i]);
    }
    printf("\n");
}

void doTest(int nbrOfElements) {
    compareCounter = 0;
    swapCounter = 0;
    printf("=> Nbr. of elements = %d\n", nbrOfElements);
    int *list = generateRandomList(nbrOfElements);
    printf("Before sorting: ");
    printList(list, nbrOfElements);
    selectionSort(list, nbrOfElements);
    printf("After sorting: ");
    printList(list, nbrOfElements);
    free(list);
}


int main() {
    srand(time(NULL));
    printf("SelectionSort demo\n\n");
    doTest(50);
    doTest(100);
    return 0;
}