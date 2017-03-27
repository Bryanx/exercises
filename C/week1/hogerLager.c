#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//
// Created by Bryan de Ridder on 27-03-17.
//

int main() {
    srand(time(NULL));
    int teRadenGetal = rand() % 100;
    int i = 0;
    int boolGeraden = 0;
    printf("Hoger/Lager?\n");
    printf("Raad het getal van 1..100 in maximaal 10 beurten!\n");
    while (i < 10 || boolGeraden != 1) {
        int guess = 0;
        scanf("%d", &guess);
        printf("Uw invoer (beurt %d): %d\n", i, guess);
        if (guess > 100) {
            printf("Ongeldige invoer!!!");
        } else if (guess == teRadenGetal) {
            boolGeraden = 1;
            printf("\nProficiat u hebt het getal geraden in %d beurten",i);
        } else if (guess < teRadenGetal) {
            printf("HOGER!");
        } else {
            printf("LAGER!");
        }
        i++;
    }

    return 0;
}