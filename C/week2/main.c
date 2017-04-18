#include <stdio.h>
#include <string.h>
#define AANTAL 50

void toonEersteEnLaatsteLetter(char woord[]);

int main() {
    char naam[AANTAL];
    printf("Geef uw naam: \n");
    gets(naam);
    toonEersteEnLaatsteLetter(naam);
    return 0;
}

void toonEersteEnLaatsteLetter(char woord[]) {
    printf("%c %c",woord[0] ,strlen(woord)-1);
}