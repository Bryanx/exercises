#include <stdio.h>
#define AANTAL 10

void verhoog(int** ppa) {
    (**ppa)++;
}

void printArray(int* pGetallen) {
    for (int i = 0; i < AANTAL; ++i) {
        printf("%d", pGetallen[i]);
    }
}

int main() {
    int a = 100;
    printf("Het adres van de int: %d\n", &a);
    int* pa = &a;
    printf("Het adres van de int: %d\n\n", pa);

    long b = 100;
    long* ba = &b;
    printf("Het adres van de long: %d\n\n", ba);

    char c = 100;
    char* ca = &c;
    printf("Het adres van de char: %d\n\n", ca);

    char d = 100;
    char* da = &d;
    printf("Het adres van de double: %d\n\n", da);


//    int getal = 17;
//    verhoog(&getal);
//    printf("Getal is: %d",getal);

    int getal = 10;
    int* pgetal = &getal;
    int** ppgetal = &pgetal;
    verhoog(ppgetal);
    printf("Verhoogt getal: %d\n\n",getal);

    int getallen[AANTAL] = {6,7,1,2,3,4,5,6,4,2};
    printf("Getallen array: %d\n",getallen);
    int* pGetallen = getallen;
    printf("pointer naar array: %d\n",pGetallen);
    printArray(pGetallen);
    printf("%d\n\n",*pGetallen);

    return 0;
}