#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100
#define LENGTH 10

void dynamischeEen();
void dynamischeTwee();
void dynamischeDrie();
void dynamischeVier();
void dynamischeVijf();
void dynamischeZes();

int main() {
    dynamischeZes();
}

void dynamischeEen() {
    printf("\nDynamische Een:\n");
    int a = 100;
    int *p;
    // reserveer met malloc voldoende ruimte voor een int
    p = malloc(sizeof(int));

    printf("*p = %d\n", *p);
    printf("p = %d\n", p);
    printf("Uitvoeren *p = a\n\n");
    *p = a;
    printf("*p = %d\n", *p);
    printf("p = %d\n\n", p);
    printf("&a = %p\n", &a);
    printf("&p = %p\n", &p);
    free(p);
}

void dynamischeTwee() {
    printf("\nDynamische Twee:\n");

    double a = 100.12345;
    double *p = calloc(1, sizeof(double));
    // reserveer met calloc voldoende ruimte voor een double

    printf("*p = %lf\n", *p);
    printf("p = %p\n", p);
    printf("\nNa uitvoeren *p = a\n");
    *p = a;
    printf("*p = %lf\n", *p);
    printf("p = %p\n\n", p);
    printf("&a = %p\n", &a);
    printf("&p = %p\n", &p);
    free(p);
}

void dynamischeDrie() {
    printf("\nDynamische Drie:\n");
    int a[] = {100, 101, 102};
    // reserveer met calloc voldoende ruimte voor 3 int’s
    int *p = calloc(3, sizeof(int));
    // en vul het in met de waarden uit de tabel a.
    for (int i = 0; i < 3; ++i) {
        *(p + i) = *(a + i);
    }
    // toon de inhoud van de dynamische tabel, gebruik de pointer p.
    printf("Inhoud van a (dynamisch) = %d %d %d", *p, *(p + 1), *(p + 2));
    // Laat nu eerst pointer terug naar begin van de dynamische tabel verwijzen

    // Doe dan de volgende afdrukken
    printf("\n\np = %p\n", p);
    printf("p[0] = %d\n", p[0]);
    printf("p = %d\n", *p);
    printf("p = %p\n", &a);
    printf("p = %p\n", &p);

    free(p);
}

void dynamischeVier() {
    printf("\nDynamische Vier:\n");

    char s[] = "Hello world!";
    char *p = calloc(strlen(s) + 1, sizeof(char));

    // Reserveer juist voldoende dynamisch geheugen voor de string s.
    printf("\n*p = %d\n", *p);
    printf("p = %p\n", p);
    printf("\nNa uitvoeren van strcpy(p, s)");
    strcpy(p, s);
    printf("\n*p = ");
    for (int i = 0; i < 12; ++i) {
        printf("%c", *(p + i));
    }
    printf("\np = %p\n", p);
    printf("\n&s = %d\n", &s);
    printf("&p = %d\n", &p);


    free(p);
}

void dynamischeVijf() {
    printf("\nDynamische Vijf:\n");

    int aantal;
    int *tabel;

    // Vraag eerst hoeveel getallen de gebruiker wenst in te geven.
    printf("Hoeveel getallen wil je meegeven");
    scanf("%d", &aantal);
    getchar();

    // Voorzie juist voldoende dynamische geheugenruimte en ken ze toe
    // aan tabel
    tabel = calloc(aantal, sizeof(int));

    // Lees de getallen rechtstreeks in de dynamische tabel in.
    for (int j = 0; j < aantal; ++j) {
        printf("\nGeef getal %d:", j+1);
        scanf("%d", tabel+j);
        getchar();
    }

    // Toon de inhoud van de dynamische tabel
    printf("De inhoud van de dynamische tabel is: ");
    for (int k = 0; k < aantal; ++k) {
        printf("%d ", *(tabel + k));
    }
    free(tabel);
}

void dynamischeZes() {
    printf("\nDynamische Zes:\n");

    printf("Hoeveel woorden wens je in te geven?");
    int aantal;
    char buffer[100];
    scanf("%d", &aantal);
    getchar();
    char** p = calloc(aantal, sizeof(char*));

    for (int i = 0; i < aantal; i++) {
        printf("Geef een woord:");
        gets(buffer);
        *(p+i) = calloc(strlen(buffer)+1, sizeof(char));
        strcpy(*(p+i),buffer);
    }

    for (int j = 0; j < aantal; ++j) {
        printf("%s\n", *(p+j));
    }

}
