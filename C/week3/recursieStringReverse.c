#include <stdio.h>
#include <string.h>

void printOmgekeerd(char *woord);

int main(int argc, char **argv) {
    char woord[] = "appel";
    printOmgekeerd(woord);
    return 0;
}

void printOmgekeerd(char *woord){
    if (*woord == '\0') return;
    printOmgekeerd(woord + 1);
    printf("%c", *woord);
}