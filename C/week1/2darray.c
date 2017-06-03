#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void print2darray(int r, int k, int array[r][k]);

void verhoog2darray(int r, int k, int array[r][k]);

void main() {

    int aantal = 0;
    printf("Hoeveel namen wil je invoeren?");
    scanf("%d", &aantal);

    char** parray = calloc(aantal, sizeof(char*));
    char buffer[20];

    for (int i = 0; i < aantal; ++i) {
        printf("\nNaam %d: ", i+1);
        gets(buffer);
        *(parray+i) = calloc(strlen(buffer)+1, sizeof(char));
        strcpy(*(parray + i), buffer);
    }

    //printen
    for (int j = 0; j < aantal; ++j) {
        printf("%s\n", *(parray+j));
    }
}

void verhoog2darray(int r, int k, int array[r][k]) {
    for (int i = 0; i < r; ++i) {
        for (int j = 0; j < k; ++j) {
            (*(*(array + i) + j))++;
        }
    }
}

void print2darray(int r, int k, int array[r][k]) {
    for (int i = 0; i < r; ++i) {
        for (int j = 0; j < k; ++j) {
            printf("%d ", *(*(array + i) + j));
        }
        printf("\n");
    }
}
