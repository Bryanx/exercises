#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define AANTAL 3

typedef struct {
    char naam[21];
    char geslacht;
} IEMAND;

IEMAND lees_in(void);
void toupper_string(IEMAND* iemand); // zet alles in hoofdletters
void druk_af(IEMAND iemand);

void struct2();
void struct3();
void struct4();
void structdynamisch();
void structnietdynamisch();

int main() {
    structnietdynamisch();
}

void struct2() {
//    PERSOON persoon;
//    char buffer[20];
//    printf("Geef je naam: ");
//    gets(buffer);
//    persoon.naam = calloc(strlen(buffer), sizeof(char));
//    strcpy(persoon.naam, buffer);
//    getchar();
//    printf("Geef je leeftijd: ");
//    scanf("%d", &persoon.leeftijd);
//
//    printf("\nInhoud:\n");
//    printf("%s %d", persoon.naam, persoon.leeftijd);
}

void struct3()  {
//    PERSOON wij[AANTAL];
//    char buffer[20];
//    for (int i = 0; i < AANTAL; ++i) {
//        if (i>0) getchar();
//        printf("Geef je naam: ");
//        gets(buffer);
//        wij[i].naam = calloc(strlen(buffer), sizeof(char));
//        strcpy(wij[i].naam, buffer);
//        getchar();
//        printf("Geef je leeftijd: ");
//        scanf("%d", &wij[i].leeftijd);
//    }
//
//    printf("\nInhoud:\n");
//    for (int j = 0; j < AANTAL; ++j) {
//        printf("%s %d\n", wij[j].naam, wij[j].leeftijd);
//    }
}

void struct4() {
//    typedef struct {
//        char straat[21];
//        int postnummer;
//        char gemeente[21];
//    } ADRES;
//
//    typedef struct {
//        char* naam;
//        ADRES adres;
//    } PERSOON;

//    PERSOON wij[AANTAL];
//    char buffer[20];
//    for (int i = 0; i < AANTAL; ++i) {
//
//        printf("Geef naam %d: ", i+1);
//        gets(buffer);
//        wij[i].naam = calloc(strlen(buffer), sizeof(char));
//        strcpy(wij[i].naam, buffer);
//
//        printf("Geef straat %d: ", i+1);
//        gets(wij[i].adres.straat);
//
//        printf("Geef postnummer %d: ", i+1);
//        scanf("%d", &wij[i].adres.postnummer);
//        getchar();
//
//        printf("Geef gemeente %d: ", i+1);
//        gets(wij[i].adres.gemeente);
//    }
//
//    printf("\nInhoud:\n");
//    for (int j = 0; j < AANTAL; ++j) {
//        printf("%s: %s, %d %s\n", wij[j].naam, wij[j].adres.straat, wij[j].adres.postnummer, wij[j].adres.gemeente);
//    }
}

void structdynamisch() {
//    typedef struct {
//        char* naam;
//        int leeftijd;
//    } PERSOON;

//    PERSOON* wij[AANTAL];
//    char buffer[21];
//    for (int i = 0; i < AANTAL; ++i) {
//        wij[i] = malloc(sizeof(PERSOON));
//        printf("Geef naam %d: ",i+1);
//        gets(buffer);
//        wij[i]->naam = calloc(strlen(buffer)+1, sizeof(char));
//        strcpy(wij[i]->naam, buffer);
//
//        printf("Geef leeftijd %d: " ,i+1);
//        scanf("%d", &wij[i]->leeftijd);
//        getchar();
//    }
//
//    printf("\nInhoud: \n");
//    for (int j = 0; j < AANTAL; ++j) {
//        printf("%-15s %d\n", wij[j]->naam, wij[j]->leeftijd);
//
//    }
}

void structnietdynamisch() {
//    typedef struct {
//        char naam[21];
//        char geslacht;
//    } IEMAND;
//
//    IEMAND lees_in(void);
//    void toupper_string(IEMAND* iemand); // zet alles in hoofdletters
//    void druk_af(IEMAND iemand);
    IEMAND persoon = lees_in();
    toupper_string(&persoon);
    druk_af(persoon);
}

IEMAND lees_in(void) {
    IEMAND iemand;
    printf("Geef een naam: ");
    gets(iemand.naam);
    printf("Geef het geslacht (m/v): ");
    scanf("%c", &iemand.geslacht);

    return iemand;
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
