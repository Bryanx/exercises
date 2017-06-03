#include <stdio.h>
#include <stdlib.h>
#include <string.h>





int main(int argc, char **argv) {
    int** tabel = calloc(6, sizeof(int));

    for (int i = 0; i < 2; ++i) {
        for (int j = 0; j < 3; ++j) {
            *(*(tabel+i)+j) = j+i;
        }
    }

    for (int i = 0; i < 2; ++i) {
        for (int j = 0; j < 3; ++j) {
            printf("%d ",*(*(tabel+i)+j));
        }
        printf("\n");
    }


}