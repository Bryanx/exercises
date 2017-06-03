#include <stdio.h>
#include <time.h>
#include <stdlib.h>

#define MAX_NUMBER 100

int compareCounter = 0;
int splitCounter = 0;

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
    printf("Content (compared %d times, splitted %d times): ", compareCounter, splitCounter);
    int i;
    for(i = 0; i < size; i++){
        printf("%2d ", list[i]);
    }
    printf("\n");
}

int* merge(int* list1, int* list2, int size1, int size2){
    int sizeMergedList = size1 + size2;
    int* mergedList = calloc(sizeMergedList, sizeof(int));
    int ixList1 = 0, ixList2 = 0;

    for (int i = 0; i < sizeMergedList; i++) {
        if(ixList1 == size1){
            mergedList[i] = list2[ixList2];
            ixList2++;
        }else if (ixList2 == size2){
            mergedList[i] = list1[ixList1];
            ixList1++;
        }else{
            int compareResult = compare(list1[ixList1], list2[ixList2]);
            if(compareResult < 0){
                mergedList[i] = list1[ixList1];
                ixList1++;
            }else{
                mergedList[i] = list2[ixList2];
                ixList2++;
            }
        }

    }
    return mergedList;
}

void mergeSort(int* list, int size){
    //Als de size 1 element is, hoeven we deze lijst niet meer op te delen
    // (stopconditie recursieve functie)
    if (size <= 1) return;
    //Aantal splits verhogen
    splitCounter++;
    //Bereken de size van de 'linkse' en 'rechtse' deel van de lijst
    int sizeList1 = size / 2;
    int sizeList2 = size - sizeList1;
    //Maak pointers naar de eerste elementen uit de 'linkse' en 'rechtse' array
    int* list1 = list;
    int* list2 = list + sizeList1;

    //Roep nu terug 'mergeSort' op zodanig dat de links lijst verder opgesplitst en gesorteerd wordt
    // (tot deze uiteindelijk maar uit ÈÈn element bestaat)
    mergeSort(list1, sizeList1);
    //Roep nu terug 'mergeSort' op zodanig dat de rechtse lijst verder opgesplitst en gesorteerd wordt
    mergeSort(list2, sizeList2);

    //Voeg beide individueel gesorteerde lijsten terug samen in ÈÈn nieuwe lijst
    int* mergedList = merge(list1, list2, sizeList1, sizeList2);
    for (int i=0; i < size; i++) {
        list[i] = mergedList[i];
    }
    free(mergedList);
}

void doTest(int nbrOfElements){
    compareCounter = 0;
    splitCounter = 0;
    printf("=> Nbr. of elements = %d\n", nbrOfElements);
    int* list = generateRandomList(nbrOfElements);
    printf("Before sorting: ");
    printList(list, nbrOfElements);
    mergeSort(list, nbrOfElements);
    printf("After sorting: ");
    printList(list, nbrOfElements);

    free(list);
}

int main() {
    srand(time(NULL));
    doTest(100);
    return 0;
}