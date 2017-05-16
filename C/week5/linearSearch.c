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

int linearSearch(int* list, int size, int value){
    compareCounter = 0;

    for (int i = 0; i < size; ++i) {
        if (compare(list[i], value) == 0) {
            return i;
        }
    }

    return -1;
}

int main() {
    srand(time(NULL));
    int sizeLijst = 10;

    int* lijst = generateRandomList(sizeLijst);
    printf("Lijst ongesorteerd: ");
    printList(lijst, sizeLijst);

    int teZoekenGetal;
    do{
        printf("Geef een getal (-1 = exit):");
        scanf("%d*c",&teZoekenGetal);
        if(teZoekenGetal != -1){
            int indexGetal = linearSearch(lijst, sizeLijst, teZoekenGetal);
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
