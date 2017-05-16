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

int* generateRandomList(int nbrOfElements) {
    int* list = calloc(nbrOfElements, sizeof(int));
    int i;
    for (i = 0; i < nbrOfElements; i++) {
        list[i] = rand() % MAX_RANDOM_NUMBER;
    }
    return list;
}

// telkens een element vgl met het volgende
// indien het eerste groter is, switchen
// zo komt telkens het grootste achteraan
void bubbleSort(int* list, int size) {
    compareCounter = 0;
    swapCounter = 0;
    //Pas de implementatie aan waar nodig
    int swappingExecuted;
    for (int i = size-1; i > 0; i--) {
        swappingExecuted = 0;
        for (int j = 0; j < i; j++) {
            if (compare(list[j], list[j+1]) > 0) {
                int tmp = list[j+1];
                list[j+1] = list[j];
                list[j] = tmp;
                swapCounter++;
                swappingExecuted = 1;
            }
        }
        if(swappingExecuted == 0) return;
    }
}

void printList(int* list, int size){
    printf("Content (compared %d times, swapped %d times): ", compareCounter, swapCounter);
    int i;
    for(i = 0; i < size; i++){
        printf("%2d ", list[i]);
    }
    printf("\n");
}

void doTest(int nbrOfElements){
    compareCounter = 0;
    swapCounter = 0;
//    printf("=> Nbr. of elements = %d\n", nbrOfElements);
    int* list = generateRandomList(nbrOfElements);
//    printf("Before sorting: ");
//    printList(list, nbrOfElements);
    bubbleSort(list, nbrOfElements);
//    printf("After sorting: ");
//    printList(list, nbrOfElements);
    free(list);
}

int main(){
    srand(time(NULL));
    float totaal = 0;
    for (int i = 0; i < 1000; ++i) {
        doTest(10);
        totaal += compareCounter;
    }
    printf("BubbleSort demo\n\n");
    printf("Gemiddeld aantal vergelijkingen: %lf\n\n", totaal/1000);
    doTest(10);
    doTest(100);
//    doTest(1000);
//    doTest(10000);
//    doTest(100000);
    return 0;
}