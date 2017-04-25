#include <stdio.h>
#include <string.h>

#define KEY "urbi et orbi"

void encrypt(char *zin);
void decrypt(char *zin);

int main() {
    char zin[] = "The ART of programming";
    printf("Voor encryptie : %s\n", zin);
    encrypt(zin);
    printf("Na encryptie : %s\n", zin);
    decrypt(zin);
    printf("Na decryptie : %s\n", zin);
    return 0;
}

void encrypt(char *zin) {
    int counter = 0;
    for (int i = 0; i < strlen(zin); ++i) {
        if (i == strlen(KEY)) counter = 0;
        *(zin + i) = *(zin + i) + *(KEY + counter);
        counter++;
    }
}

void decrypt(char *zin) {
    int counter = 0;
    for (int i = 0; i < strlen(zin); ++i) {
        if (i == strlen(KEY)) counter = 0;
        *(zin + i) = *(zin + i) - *(KEY + counter);
        counter++;
    }
}