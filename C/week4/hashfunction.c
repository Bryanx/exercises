#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_BUCKET_SIZE 100

int hash(char *string) {
    int som = 0;
    for (int i = 0; i < strlen(string); ++i) {
        som += *(string + i);
    }
    return som % MAX_BUCKET_SIZE;
}

int main() {
    printf("Hashtest:\n");
    char namen[5][12] = {"Frank", "Jef", "Dirk", "Piet-Joris", "Jan"};
    int i;
    for (i = 0; i < 5; i++) {
        printf("hash(%s)=%d\n", namen[i], hash(namen[i]));
    }
    return 0;
}