#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct {
    char* naam;
    char geslacht;
} IEMAND;

void lees_in(IEMAND* iemand);
void toupper_string(IEMAND* iemand);
void druk_af(IEMAND iemand);

int main() {
    IEMAND persoon;
    lees_in(&persoon);
    toupper_string(&persoon);
    druk_af(persoon);
    free(persoon.naam);
    return 0;
}

void lees_in(IEMAND* iemand) {
    char buffer[20];
    printf("Geef een naam: ");
    gets(buffer);
    iemand->naam = calloc(strlen(buffer)+1, sizeof(char));
    strcpy(iemand->naam, buffer);


    printf("Geef het geslacht (m/v): ");
    scanf("%c", &iemand->geslacht);
}

void toupper_string(IEMAND* iemand) {
    for (int i = 0; i < strlen(iemand->naam); ++i) {
        if (*(iemand->naam + i) > 96 && *(iemand->naam + i) < 123) {
            *(iemand->naam+i) -= 32;
        }
    }
    iemand->geslacht -= 32;
}

void druk_af(IEMAND iemand) {
    printf("%s - %c", iemand.naam, iemand.geslacht);
}
