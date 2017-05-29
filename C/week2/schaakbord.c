#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define HOOGTE 8
#define BREEDTE 8
#define ZWART 0
#define WIT 1

typedef struct {
    char *naam;
} SCHAAKSTUK;

typedef struct {
    int kleur;
    SCHAAKSTUK *schaakstuk;
} SCHAAKBORD;

typedef struct {
    SCHAAKBORD *schaakbord[8][8];
} VELD;

VELD *newSchaakBord();

void printSchaakBord(VELD *veld);

int main() {
    VELD *veld = newSchaakBord();
    printSchaakBord(veld);
    return 0;
}

void printSchaakBord(VELD *veld) {
    for (int i = 0; i < HOOGTE; ++i) {
        for (int j = 0; j < BREEDTE; ++j) {
            printf("%d ", veld->schaakbord[i][j]->kleur);
        }
        printf("\n");
    }
}

VELD *newSchaakBord() {
    VELD *veld = calloc(1, sizeof(VELD));
    int index = 0;
    for (int i = 0; i < HOOGTE; ++i) {
        for (int j = 0; j < BREEDTE; ++j) {
            veld->schaakbord[i][j] = malloc(sizeof(SCHAAKBORD));
            if ((j % 2 == 0 && index % 2 == 0) || j % 2 != 0 && index % 2 != 0) {
                veld->schaakbord[i][j]->kleur = WIT;
            } else {
                veld->schaakbord[i][j]->kleur = ZWART;
            }
        }
        index++;
    }
    return veld;
}