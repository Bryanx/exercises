#include <stdio.h>
#include <float.h>

#define AANTAL_GETALLEN 6
//
// Created by Bryan de Ridder on 27-03-17.
//

void array1() {
    int getallen[11];
    for (int i = 1; i <= 10; ++i) {
        getallen[i] = i;
        printf("%d ", getallen[i]);
    }
    printf("\n");
    for (int i = 10; i >= 1; --i) {
        getallen[i] = i;
        printf("%d ", getallen[i]);
    }
}

void array2() {
    double tabel[AANTAL_GETALLEN];
    for (int i = 0; i < AANTAL_GETALLEN; ++i) {
        printf("Geef getal %d: ", i + 1);
        scanf("%lf", &tabel[i]);
    }


    printf("Inhoud: ");
    for (int j = 0; j < AANTAL_GETALLEN; ++j) {
        printf("%.2lf ", tabel[j]);
    }


    double som = 0;
    for (int k = 0; k < AANTAL_GETALLEN; ++k) {
        som += tabel[k];
    }
    printf("\nGemiddelde: %.2lf", som / AANTAL_GETALLEN);


    double kleinste = DBL_MAX;
    for (int l = 0; l < AANTAL_GETALLEN; ++l) {
        if (tabel[l] < kleinste) {
            kleinste = tabel[l];
        }
    }
    printf("\nKleinste: %.2lf", kleinste);


    double grootste = DBL_MIN;
    for (int l = 0; l < AANTAL_GETALLEN; ++l) {
        if (tabel[l] > grootste) {
            grootste = tabel[l];
        }
    }
    printf("\nGrootste: %.2lf", grootste);
}

void array3() {
    int tabel[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    int i;
    for (i = 0; i < 10; i++) {
        printf("%d ", *(tabel + i));
    }
    printf("\n");
}

void array4() {
    int tabel[] = {5, 6, 4, 1, 3, 2};
    int hulp = 0;

    for (int i = 0; i < 6; ++i) {
        for (int j = 0; j < 5; ++j) {
            if (tabel[j] > tabel[j + 1]) {
                hulp = tabel[j];
                tabel[j] = tabel[j + 1];
                tabel[j + 1] = hulp;
            }
        }
    }
    printf("Gesorteerd:");
    for (int k = 0; k < 6; ++k) {
        printf(" %d", tabel[k]);
    }

}

int main() {
    array1();
    printf("\n\n");
    array2();
    printf("\n\n");
    array3();
    printf("\n\n");
    array4();
    return 0;
}