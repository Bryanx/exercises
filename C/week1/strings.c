#include <stdio.h>
#include <string.h>
#include <limits.h>
//
// Created by Bryan de Ridder on 27-03-17.
//

/*
 * Het einde van een string heeft altijd als karakter \0
 */
int stringLengte(char letters[]) {
    int i = 0;
    while (letters[i] != '\0') i++;
    return i;
}

/*
 * Geeft de som van de ascii waardes van een string.
 */
void count_asc() {
    printf("Tik een woord: ");
    char woord[50];
    gets(woord);
    int som = 0;
    for (int i = 0; i < strlen(woord); ++i) {
        som += (int) woord[i];
    }
    printf("De som van de ascii waarden is %d", som);
}

/*
 * Checkt of de string numeriek is
 */
void is_numeriek() {
    int bool = 0;
    printf("Tik een getal in: ");
    char input[100];
    scanf("%s", input);
    for (int i = 0; i < strlen(input); ++i) {
        switch ((int) input[i]) {
            case 48 : ; case 49 : ; case 50 : ;
            case 51 : ; case 52 : ; case 53 : ;
            case 54 : ; case 55 : ; case 56 : ;
            case 57 : bool = 0; break;
            default : bool = 1;
        }
    }
    if (bool == 0) {
        printf("%s is numeriek", input);
    } else {
        printf("%s is niet numeriek", input);
    }
}

/*
 * Checkt het grootste woord in een array
 */
void grootsteWoordInArray() {
    char grootsteWoord[50] = "";
    for (int i = 0; i < 5; ++i) {
        printf("Geef een woord: ");
        char woord[50];
        scanf("%s", woord);

        if (strlen(woord) > strlen(grootsteWoord)) {
            strcpy(grootsteWoord, woord);
        }
    }
    printf("grootste woord: %s", grootsteWoord);
}

/*
 * Checkt of de string een palindroom is
 * strcmp vergelijkt een string en returnt 0 als ie gelijk is
 */
void is_palindroom() {
    char woord[50];
    char woordReverse[50];
    printf("Geef een woord: ");
    scanf("%s", woord);
    for (int i = strlen(woord)-1; i >= 0; --i) {
        woordReverse[strlen(woord)-i-1] = woord[i];
    }
    if (strcmp(woord, woordReverse) == 0) {
        printf("%s is een palindroom", woord);
    } else {
        printf("%s is geen palindroom", woord);
    }
}

int main() {
//    count_asc();
//    is_numeriek();
//    is_palindroom();
//    grootsteWoordInArray();
    return 0;
}