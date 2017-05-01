#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct {
    int kleur; /* 0 .. 3 */
    int waarde; /* 0 .. 12 */
} KAART;

void toonKaart(KAART);

int main(void) {
    KAART hartenAas = {0, 0};
    printf("Test kaart:\n");
    toonKaart(hartenAas);
    printf("\nDrie willekeurige kaarten:\n");
    srand(time(NULL));
    for (int i = 0; i < 3; i++) {
        int randGetal1 = rand() % 4;
        int randGetal2 = rand() % 13;
        KAART willekeurig = {randGetal1, randGetal2};
        toonKaart(willekeurig);
    }
    return 0;
}

void toonKaart(KAART kaart) {
    switch(kaart.kleur) {
        case 0: printf("harten");break;
        case 1: printf("ruiten");break;
        case 2: printf("schoppen");break;
        case 3: printf("klaveren");break;
        default: printf("?");
    }
    printf(" ");
    switch(kaart.waarde) {
        case 0: printf("aas");break;
        case 1: printf("een");break;
        case 2: printf("twee");break;
        case 3: printf("drie");break;
        case 4: printf("vier");break;
        case 5: printf("vijf");break;
        case 6: printf("zes");break;
        case 7: printf("zeven");break;
        case 8: printf("acht");break;
        case 9: printf("negen");break;
        case 10: printf("boer");break;
        case 11: printf("dame");break;
        case 12: printf("heer");break;
        default: printf("?");
    }
    printf("\n");
}