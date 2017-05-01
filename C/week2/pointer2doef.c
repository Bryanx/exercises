#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int main() {
    char* namen[4];
    char buffer[100];

    for (int i = 0; i < 4; ++i) {
        printf("Geef de naam van een personage: ");
        gets(buffer);

        int lengteBuffer = strlen(buffer);
        namen[i] = calloc(lengteBuffer + 1, sizeof(char));

        /*
         * de buffer in de heaparray wordt gekopieerd naar de stackarray.
         */
        strcpy(namen[i], buffer);
    }

    for (int j = 0; j < 4; ++j) {
        printf("Personage %d: %s\n", j, *(namen + j));
    }

    //geheugen wordt gecleared.
    for (int k = 0; k < 4; ++k) {
        free(namen[k]);
    }
}
