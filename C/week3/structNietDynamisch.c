#include <stdio.h>
#include <string.h>

typedef struct {
    char naam[21];
    char geslacht;
} IEMAND;

IEMAND lees_in(void);
void toupper_string(IEMAND* iemand); // zet alles in hoofdletters
void druk_af(IEMAND iemand);

int main() {
    IEMAND persoon = lees_in();
    toupper_string(&persoon);
    druk_af(persoon);
    return 0;
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
