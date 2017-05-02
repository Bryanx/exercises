#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <time.h>

typedef struct {
    char *soort;
    int waarde;
} KAART;

typedef struct {
    KAART *kaarten[52];
} BOEK;

KAART *toonKaart(KAART *kaart);
KAART *newKAART(char *soort, int waarde);
void toonBoek(BOEK* boek);
BOEK* newBook();
KAART* trekKaart(BOEK* boek);
BOEK* schud(BOEK* boek);

int main() {
    srand(time(NULL));
    BOEK* boek = newBook();
//    toonBoek(boek);
//    KAART* kaart = trekKaart(boek);
    schud(boek);
    toonBoek(boek);
    return 0;
}

BOEK* schud(BOEK* boek) {
    for (int i = 0; i < 500; ++i) {
        int randomi = rand() % 52;
        KAART* buffer = boek->kaarten[0];
        boek->kaarten[0] = boek->kaarten[randomi];
        boek->kaarten[randomi] = buffer;
    }
}

KAART* trekKaart(BOEK* boek) {
    int i = rand() % 52;
    return(boek->kaarten[i]);
}

void toonBoek(BOEK* boek) {
    for (int i = 0; i < 52; ++i) {
        toonKaart(boek->kaarten[i]);
    }
}

BOEK* newBook() {
    BOEK* boek = malloc(sizeof(BOEK));
    int k = 0;
    for (int i = 0; i < 13; ++i) {
        boek->kaarten[k++] = newKAART("ruiten", i+1);
        boek->kaarten[k++] = newKAART("klaveren", i+1);
        boek->kaarten[k++] = newKAART("schoppen", i+1);
        boek->kaarten[k++] = newKAART("harten", i+1);
    }
    return boek;
}

KAART *newKAART(char *soort, int waarde) {
    KAART *kaart = malloc(sizeof(KAART));
    kaart->soort = calloc(strlen(soort), sizeof(char));
    strcpy(kaart->soort, soort);
    kaart->waarde = waarde;
    return kaart;
}


KAART *toonKaart(KAART *kaart) {
    printf("%s ", kaart->soort);
    switch (kaart->waarde) {
        case 1:printf("aas\n");break;
        case 11:printf("boer\n");break;
        case 12:printf("dame\n");break;
        case 13:printf("heer\n");break;
        default:printf("%d\n", kaart->waarde);
    }
}
