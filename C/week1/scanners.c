#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define AANTAL_GETALLEN 5

void berekenGemiddelde() {
    printf("\nGeef %d gehele getallen gescheiden door een ';'",AANTAL_GETALLEN);
    int som = 0;
    for (int i = 0; i < AANTAL_GETALLEN; ++i) {
        int getal;
        scanf("%d;",&getal);
        som +=getal;
    }
    printf("Gemiddelde: %.2f", som/5.0);
}

void berekenGemiddeldeRandom() {
    int getallen[AANTAL_GETALLEN];
    srand(time(NULL));
    int som = 0;
    for (int i = 0; i < AANTAL_GETALLEN; ++i) {
        getallen[i] = rand() % 1000;
        som += getallen[i];
    }
    printf("\n\nGemiddelde: %.2f", som / 5.0);
}

int berekenLeeftijd(int geboorteJaar) {
    return 2017-geboorteJaar;
}

double berekenBMI(double gewicht, double lengte) {
    return gewicht/(lengte/100*lengte/100);
}

void charScanMetFlush() {
    printf("\nGeef je geslacht (m/v)? ");
    char geslacht;
    fflush(stdin);
    scanf("%c", &geslacht);
    printf("\nJe bent geslachts: %c",geslacht);
}

void woordScan() {
    char woord[10];
    printf("Geef je naam: ");
    scanf("%s", woord);
    printf("%s", woord);
}

void zinScan() {
    char zin[50];
    printf("Geef een zin: ");
    gets(zin);
    printf("%s", zin);
}

void getalScan() {
    int getal;
    printf("Geef een getal: ");
    scanf("%d", &getal);
    printf("%d", getal);
}

int main() {
    printf("Wat is je geboortejaar, gewicht en lengte in cm?: ");
    int gebjaar;
    double gewicht;
    double lengte;
    scanf("%d %lf %lf",&gebjaar, &gewicht, &lengte);

    printf("Je bent %d jaar oud\n", berekenLeeftijd(gebjaar));
    printf("Je bent %.0f cm lang\n", lengte);
    printf("Je BMI is %.2lf\n", berekenBMI(gewicht,lengte));

    berekenGemiddeldeRandom();
}
