#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/* Vul het nodige aan in de functie verwissel_strings.
* Strings van verschillende lengte en maximaal 29 tekens.
* Versie 1: Zoner stringfuncties!
*/
void verwissel_strings(char *, char *);
int stringlength(char*);

int main(void) {
    char string_een[30] = "Een";
    char string_twee[30] = "Twee";
    char string_lang[30] = "Lange string";
    verwissel_strings(string_een, string_twee);
    printf("Na verwisselen: '%s' '%s'\n",
           string_een, string_twee);
    verwissel_strings(string_een, string_lang);
    printf("Na verwisselen: '%s' '%s'\n",
           string_een, string_lang);
    return 0;
}

void verwissel_strings(char *p, char *q) {
    char* buffer = calloc(stringlength(p)+1,sizeof(char));
    char* buffer2 = calloc(stringlength(q)+1,sizeof(char));

    for (int i = 0; i < stringlength(p); ++i) {
        *(buffer + i) = *(p + i);
    }

    for (int j = 0; j < stringlength(q); ++j) {
        *(buffer2 + j) = *(q + j);
    }
    printf("\n%d %d\n", stringlength(buffer), stringlength(buffer2));

    for (int j = 0; j < stringlength(buffer2); ++j) {
        *(p + j) = *(buffer2 + j);
    }

    for (int k = 0; k < stringlength(buffer); ++k) {
        *(q + k) = *(buffer + k);
    }

    free(buffer);free(buffer2);
}

int stringlength(char* zin) {
    int i = 0;
    while (*(zin+i) != '\0') i++;
    return i;
}