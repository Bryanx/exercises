#include <stdio.h>
#include <string.h>
//
// Created by Bryan de Ridder on 27-03-17.
//

int main() {
    char woord[] = "appelsientje";
    printf("%s\n\n",woord);
    for (int i = 0; i < strlen(woord); ++i) {
        printf("%s\n", &woord[i]);
    }

    char naam[10];
    printf("Geef je naam: ");
    scanf("%s", &naam);
    printf("%s", naam);
    return 0;
}

int stringLengte(char letters[]) {
    int i = 0;
    while (letters[i] != '\0') i++;
    return i;
}