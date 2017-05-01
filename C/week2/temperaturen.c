#include <stdio.h>
#define AANTAL 7

int main(int argc, char **argv) {
    char* dagen = "mdwdvzz";
    int temperaturen[AANTAL]; // Vervang dit door int* temperaturen;
    // en voeg int* p; toe!
    int* p;
    for (int i = 0; i < AANTAL; i++) {
        printf("Geef temperatuur %d: ", (i + 1));
        scanf("%d", temperaturen + i);
    }
    for (int j = 0; j < AANTAL; j++) {
        printf("%c: ", *(dagen + j));
        int sterren = *(temperaturen + j);
        for (j = 0; j < sterren; j++) {
            printf("%c", '*');
        }
        printf("\n");
    }
    return 0;
}