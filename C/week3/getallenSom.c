#include <stdio.h>

int somcijfers(int getal, int som) {
    if (getal < 1) return som;
    som+=getal%10;
    return somcijfers(getal/10, som);
}

int main() {
    int getal = 123;

    printf("%d",somcijfers(getal, 0));

    return 0;
}