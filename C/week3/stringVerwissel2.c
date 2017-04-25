#include <stdio.h>
#include <string.h>

/* Vul het nodige aan in de functie verwissel_strings.
* Strings van verschillende lengte en maximaal 29 tekens.
* Versie 1: Zoner stringfuncties!
*/
void verwissel_strings(char *, char *);

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
    char buffer[30];

    //strcpy(buffer,p);
    for (int i = 0; i < strlen(p); ++i) {
        *(buffer + i) = *(p + i);
    }

    //strcpy(p,q);
    for (int j = 0; j < strlen(q); ++j) {
        *(p + j) = *(q + j);
    }

    //strcpy(q,buffer);
    for (int k = 0; k < strlen(buffer); ++k) {
        *(q + k) = *(buffer + k);
    }
}