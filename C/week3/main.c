#include <stdio.h>

void verhoog(int getal[]);

int main() {
    int tabel[3] = {2,2,2};
    verhoog(tabel);

    for (int i = 0; i < 3; i++) {
        printf("%d ", tabel[i]);
    }
    return 0;
}

void verhoog(int getal[]) {
//    for (int i = 0; i < 3; i++) {
//        getal[i]++;
//    }
}