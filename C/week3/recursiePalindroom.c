#include <stdio.h>
#include <string.h>
int isPalindroom(char *woord);

int main(int argc, char **argv) {
    char woord[100];
    printf("Geef een woord:" );
    scanf("%s", woord);
    if (isPalindroom(woord) == 0) {
        printf("Palindroom!");
    } else {
        printf("Geen palindroom!");
    }
    return 0;
}

int isPalindroom(char *woord){
    if (woord[0] == woord[strlen(woord)-1]) {
        woord[strlen(woord)-1] = '\0';
        isPalindroom(woord+1);
    }
    if (strlen(woord+1) <= 1) return 0;
    return 1;
}