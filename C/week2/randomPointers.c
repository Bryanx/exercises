#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main() {
    srand(time(NULL));

    double getal1, getal2, som;
    double* pGetal1 = &getal1;
    double* pGetal2 = &getal2;
    double* pSom = &som;

    *pGetal1 = rand() % 100;
    *pGetal2 = rand() % 100;
    *pSom = *pGetal1 + *pGetal2;

    printf("random getal 1: %lf\nrandom getal 2: %lf\n", *pGetal1, *pGetal2);
    printf("som: %lf\n", *pSom);


    printf("Geheugen adres som: %d\n", pSom);
    pSom++;
    printf("Geheugen adres som: %d\n", pSom);
    return 0;
}