#include <stdio.h>
#include <time.h>
#include <stdlib.h>

#define MAX_NUMBER 100

int compareCounter = 0;
int swapCounter = 0;

int compare(int a, int b) {
    compareCounter++;
    return a - b;
}

int* generateRandomList(int nbrOfElements) {
    int* list = calloc(nbrOfElements, sizeof(int));
    int i;
    for (i=0; i < nbrOfElements; i++) {
        list[i] = rand() % MAX_NUMBER;
    }
    return list;
}

void printList(int* list, int size){
    printf("Content (compared %d times, swapped %d times): ", compareCounter, swapCounter);
    int i;
    for(i = 0; i < size; i++){
        printf("%2d ", list[i]);
    }
    printf("\n");
}

void quickSort(int* list, int left, int right) {
    int i = left;
    int j = right;
    int pivot = list[(left+right)/2];

    do {
        while(compare(list[i], pivot) < 0  && (i < right)){
            i++;
        }
        while(compare(pivot, list[j]) < 0 && (j > left)) {
            j--;
        }
        if(i <= j) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            swapCounter++;
            i++; j--;
        }
    } while(i <= j);

    if(i < right)  quickSort(list, i, right);
    if(left < j) quickSort(list, left, j);
}

void quickSortMain(int* listToSort, int size) {
    compareCounter = 0;
    swapCounter = 0;
    quickSort(listToSort, 0, size-1);
}

void doTest(int nbrOfElements){
    compareCounter = 0;
    swapCounter = 0;
    printf("=> Nbr. of elements = %d\n", nbrOfElements);
    int* list = generateRandomList(nbrOfElements);
    printf("Before sorting: ");
    printList(list, nbrOfElements);
    quickSortMain(list, nbrOfElements);
    printf("After sorting: ");
    printList(list, nbrOfElements);
    free(list);
}

int main() {
    srand(time(NULL));
    doTest(100);

    return 0;
}