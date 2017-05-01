#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define AANTAL 52
#define AANTAL_KLEUREN 4
#define AANTAL_WAARDES 13

typedef struct {
    int kleur; /* 0 .. 3 */
    int waarde; /* 0 .. 12 */
} KAART;

typedef struct {
    KAART kaart;
    int getrokken; /* 0 = nee, 1 = ja */
} SPEELKAART;

void vulKaartSpel(SPEELKAART[]);
void toonKaarten(SPEELKAART[]);
KAART trekWillekeurigeKaart(SPEELKAART[]);
void toonKaart(KAART, int i);

int main(void) {
    SPEELKAART kaartspel[AANTAL];
    KAART kaart;
    srand(time(NULL));
    vulKaartSpel(kaartspel);

    printf("Beginsituatie (= nieuw kaartspel):\n");
    toonKaarten(kaartspel);
    printf("\nTrek 52 maal een willekeurige kaart uit het kaartspel:\n");
    for (int i = 0; i < 52; i++) {
        kaart = trekWillekeurigeKaart(kaartspel);
        toonKaart(kaart,i);
    }
    return 0;
}

KAART trekWillekeurigeKaart(SPEELKAART speelkaart[]) {
    int index = 0;
    int gevonden[AANTAL];
    for (int j = 0; j < AANTAL; ++j) {
        if (speelkaart[j].getrokken == 0) {
            gevonden[index] = j;
            index++;
        }
    }
    int i = rand() % index;
    speelkaart[gevonden[i]].getrokken = 1;
    return speelkaart[gevonden[i]].kaart;
}

void toonKaart(KAART kaart,int i) {
    char* kleur;
    switch(kaart.kleur) {
        case 0: kleur = "harten ";break;
        case 1: kleur = "ruiten ";break;
        case 2: kleur = "schoppen ";break;
        case 3: kleur = "klaveren ";break;
        default: kleur = "? ";
    }
    char* waarde;
    switch(kaart.waarde) {
        case 0: waarde = "aas";break;
        case 1: waarde = "twee";break;
        case 2: waarde = "drie";break;
        case 3: waarde = "vier";break;
        case 4: waarde = "vijf";break;
        case 5: waarde = "zes";break;
        case 6: waarde = "zeven";break;
        case 7: waarde = "acht";break;
        case 8: waarde = "negen";break;
        case 9: waarde = "tien";break;
        case 10: waarde = "boer";break;
        case 11: waarde = "dame";break;
        case 12: waarde = "heer";break;
        default: waarde = "?";
    }
    printf("%-9s%-20s", kleur, waarde);
    if ((i+1)%5==0) printf("\n");
}

void vulKaartSpel(SPEELKAART speelkaart[]) {
    int k = 0;
    for (int i = 0; i < AANTAL_KLEUREN; ++i) {
        for (int j = 0; j < AANTAL_WAARDES; ++j) {
            speelkaart[k].kaart.kleur = i;
            speelkaart[k].kaart.waarde = j;
            speelkaart[k].getrokken = 0;
            k++;
        }
    }
}

void toonKaarten(SPEELKAART speelkaart[]) {
    for (int i = 0; i < AANTAL; ++i) {
        toonKaart(speelkaart[i].kaart, i);
    }
}