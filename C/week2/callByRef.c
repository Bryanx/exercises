#include <stdio.h>

/*
 * Call by ref:
 */
void verdubbel(int* waarde) {
    *waarde *= 2;
}
int main() {
    int getal = 10;
    verdubbel(&getal);
    printf("getal = %d", getal);
    return 0;
}


/*
 * Call by val:
 */
void verhoog(int waarde) {
    waarde++;
    printf("getal = %d", waarde);
}
int main2() {
    int getal = 10;
    verhoog(getal);
    return 0;
}