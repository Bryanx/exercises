#include <stdio.h>
#define AANTAL 7

int main(int argc, char **argv) {
    char* dagen = "mdwdvzz";
    int temperaturen[AANTAL]; // Vervang dit door int* temperaturen;
    // en voeg int* p; toe!
    int i, j;
    for (i = 0; i < AANTAL; i++) {
        printf("Geef temperatuur %d: ", (i + 1));
        scanf("%d", temperaturen + i);
    }
    for (i = 0; i < AANTAL; i++) {
        printf("%c: ", *(dagen + i));
        int sterren = *(temperaturen + i);
        for (j = 0; j < sterren; j++) {
            printf("%c", '*');
        }
        printf("\n");
    }
    return 0;
}