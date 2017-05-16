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

//telkens een element vgl met het volgende
// indien het eerste groter is, switchen
// zo komt telkens het grootste achteraan
void bubbleSort(int *list, int size) {
    compareCounter = 0;
    swapCounter = 0;
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size - i; ++j) {
            if (compare(list[j], list[j + 1]) > 0) {
                int buffer = *(list + j + 1);
                *(list + j + 1) = *(list + j);
                *(list + j) = buffer;
                swapCounter++;
            }
        }
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
    bubbleSort(list, nbrOfElements);
    printf("After sorting: ");
    printList(list, nbrOfElements);
    free(list);
}

int main() {
    srand(time(NULL));
    printf("BubbleSort demo\n\n");
    doTest(10);
    doTest(100);
    //doTest(1000);
    //doTest(10000);
    //doTest(100000);
    return 0;
}