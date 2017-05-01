#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef char* STRING;
typedef int METERS;
typedef float VECTOR[10];

typedef struct {
    char* straat;
    int huisnummer;
    char* stad;
} ADRES;

typedef struct {
    char* name;
    int backnumber;
    char* position;
    ADRES* adres;
} VOETBALLER;

void printVoetballer(VOETBALLER* s);
VOETBALLER* newVoetballer(char *naam, char *position, int rugnummer, ADRES* adres);
ADRES* newAdres(char* straat, int huisnummer, char* stad);

/*
 * Structures moeten altijd op de HEAP worden gezet
 */
int main() {
    METERS lengte = 100;
    printf("Het voetbalveld is %d meter lang", lengte);

    ADRES* adresMessi = newAdres("La Ramblas", 10, "Barcelona");
    VOETBALLER *messi = newVoetballer("Messi", "Middenvelder", 234, adresMessi);

    ADRES* adresRonaldo = newAdres("Madrid", 234, "Madrid");
    VOETBALLER *ronaldo = newVoetballer("Ronaldo", "Verdediger", 34, adresRonaldo);


    printVoetballer(messi);
    printf("\n");
    printVoetballer(ronaldo);

    return 0;
}

ADRES* newAdres(char* straat, int huisnummer, char* stad) {
    ADRES* this = calloc(1,sizeof(ADRES));
    this->straat = calloc(strlen(straat)+1, sizeof(char));
    this->stad = calloc(strlen(stad)+1, sizeof(char));

    strcpy(this->straat, straat);
    this->huisnummer = huisnummer;
    strcpy(this->stad, stad);
    return this;
}

VOETBALLER* newVoetballer(char *naam, char *position, int rugnummer, ADRES* adres) {
    VOETBALLER* this = calloc(1,sizeof(VOETBALLER));
    this->name = calloc(strlen(naam)+1, sizeof(char));
    this->position = calloc(strlen(position)+1, sizeof(char));

    strcpy(this->name, naam);
    strcpy(this->position, position);
    this->backnumber = rugnummer;
    this->adres = adres;
    return this;
}

//BY REFERENCE WERKEN!
void printVoetballer(VOETBALLER* s) {
    printf("\n%s %d %s", s->name, s->backnumber, s->position);
    printf("\n%s woont in %s, %s %d",s->name,s->adres->stad, s->adres->straat, s->adres->huisnummer);
    printf("\nDe grootte van de structure VOETBALLER is: %d bytes",sizeof(s));
}