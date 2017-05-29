#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define AANTAL 10

void shuffle(int *tabel);

double mean(int *tabel, int length);

int main(int argc, char **argv) {
    int tabel[AANTAL] = {7, 15, 16, 20, 23, 36, 47, 61, 77, 81};
    int i;
    int *p = tabel;
    srand(time(0));
    shuffle(tabel);
    double som = 0;
    for (int j = 0; j < AANTAL; ++j) {
        printf("%d ", *(tabel + j));
        som += *(tabel+j);
    }
    printf("\nGemiddelde: %.3lf", som/AANTAL);
}

void shuffle(int *tabel) {
    srand(time(NULL));
    int buffer[AANTAL];
    for (int i = 0; i < AANTAL; ++i) {
        int r = rand() % AANTAL;
        *(buffer+i) = *(tabel+i);
        *(tabel+i) = *(tabel+r);
        *(tabel+r) = *(buffer+i);
    }
}