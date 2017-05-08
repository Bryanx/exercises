#include <stdio.h>
#include <string.h>

void printOmgekeerd(char *woord);

int main(int argc, char **argv) {
    char woord[] = "appel";
    printOmgekeerd(woord);
    return 0;
}

void printOmgekeerd(char *woord){
    if (strlen(woord) == 0) return;
    printf("%c", woord[strlen(woord)-1]);
    woord[strlen(woord)-1] = '\0';
    printOmgekeerd(woord);
}