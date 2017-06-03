#include <stdio.h>
#include <string.h>

void printVerticaal(int getal);

void printVerticaalMetLus(int getal);

int main() {
    int getal = 12345678;
    printVerticaal(getal);
    printf("\n");
    printVerticaalMetLus(getal);

    return 0;
}

void printVerticaalMetLus(int getal) {
    char string[20];
    int j = 0;
    for (int i = 1; i < getal; i*=10) {
        string[j++] = getal/i%10 + '0';
    }
    for (int k = strlen(string)-1; k >= 0; --k) {
        printf("%c\n", string[k]);

    }
}

void printVerticaal(int getal) {
    if (getal - 1 < 0) return;
    printVerticaal(getal/10);
    printf("%d\n", getal%10);
}