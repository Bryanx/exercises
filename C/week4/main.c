#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define WOORD_AANTAL 20

typedef struct {
    char* moedertaal;
} TAAL;

typedef struct {
    char* naam;
    TAAL* taal;
} PERSOON;

int main(int argc, char **argv) {
    PERSOON* persoon = malloc(sizeof(PERSOON));
    persoon->taal = malloc(sizeof(TAAL));

    char buffer[WOORD_AANTAL] = "Nederlands";
    persoon->taal->moedertaal = calloc(strlen(buffer),sizeof(char));
    strcpy(persoon->taal->moedertaal, buffer);

    char buffer2[WOORD_AANTAL] = "Jos";
    persoon->naam = calloc(strlen(buffer2),sizeof(char));
    strcpy(persoon->naam, buffer2);

    printf("%s %s", persoon->naam, persoon->taal->moedertaal);
    return 0;
}