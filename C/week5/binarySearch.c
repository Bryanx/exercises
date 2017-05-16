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

void printList(int* list, int size) {
    int i;
    for (i = 0; i < size; i++) {
        printf("%2d ",list[i]);
    }
    printf("\n");
}

int* merge(int* list1, int* list2, int size1, int size2){
    int sizeMergedList = size1 + size2;
    int* mergedList = calloc(sizeMergedList, sizeof(int));
    int ixList1 = 0, ixList2 = 0, ixMergedList = 0;

    for (ixMergedList = 0; ixMergedList < sizeMergedList; ixMergedList++) {
        if(ixList1 == size1){
            mergedList[ixMergedList] = list2[ixList2];
            ixList2++;
        }else if (ixList2 == size2){
            mergedList[ixMergedList] = list1[ixList1];
            ixList1++;
        }else{
            int compareResult = compare(list1[ixList1], list2[ixList2]);
            if(compareResult < 0){
                mergedList[ixMergedList] = list1[ixList1];
                ixList1++;
            }else{
                mergedList[ixMergedList] = list2[ixList2];
                ixList2++;
            }
        }
    }
    return mergedList;
}

void mergeSort(int* list, int size){
    if (size <= 1) return;

    int sizeList1 = size / 2;
    int sizeList2 = size - sizeList1;

    int* list1 = list;
    int* list2 = list + sizeList1;

    mergeSort(list1, sizeList1);
    mergeSort(list2, sizeList2);

    int* mergedList = merge(list1, list2, sizeList1, sizeList2);

    int i;
    for (i=0; i < size; i++) {
        list[i] = mergedList[i];
    }

    free(mergedList);
}

int bSearch(int* list, int value, int lowerIndex, int upperIndex) {
    if (upperIndex < lowerIndex) return -1;

    int middleIndex = (lowerIndex + upperIndex) / 2;
    int difference = compare(value, list[middleIndex]);
    if (difference > 0) {
        return bSearch(list, value, middleIndex + 1, upperIndex);
    } else if (difference < 0) {
        return bSearch(list, value, lowerIndex, middleIndex - 1);
    } else {
        return middleIndex;
    }
}

int binarySearch(int* list, int size, int value){
    compareCounter = 0;
    return bSearch(list,value,0,size);
}

int main() {
    srand(time(NULL));
    int sizeLijst = 10;

    int* lijst = generateRandomList(sizeLijst);
    mergeSort(lijst, sizeLijst);
    printf("Lijst gesorteerd: ");
    printList(lijst, sizeLijst);

    int teZoekenGetal;
    do{
        printf("Geef een getal (-1 = exit):");
        scanf("%d*c",&teZoekenGetal);
        if(teZoekenGetal != -1){
            int indexGetal = binarySearch(lijst, sizeLijst, teZoekenGetal);
            if (indexGetal==-1) {
                printf("'%d' is niet gevonden in de lijst! ", teZoekenGetal);
            } else {
                printf("'%d' staat op positie %d in de lijst! ", teZoekenGetal, indexGetal);
            }
            printf("(#compares = %d)\n",compareCounter);
        }
    }while(teZoekenGetal != -1);

    free(lijst);

    return 0;
}