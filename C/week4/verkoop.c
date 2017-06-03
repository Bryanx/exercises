#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int getal = 0;
    printf("Verkoop van 28 april 2010\n");
    printf("Geef het aantal bonnetjes: ");
    scanf("%d", &getal);
    double tmp = 0;
    double som = 0;
    for (int i = 0; i < getal; ++i) {
        printf("Geef het bedrag van bon %d: ", i+1);
        scanf("%lf",&tmp);
        som+=tmp;
    }
    printf("\nDe totale omzet voor vandaag is %.2lf", som);
}