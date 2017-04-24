#include <stdio.h>
void wissel(int* a, int* b);

int main() {
    int a, b, c;
    printf("Geef 3 getallen : ");
    scanf("%d %d %d", &a, &b, &c);
    printf("Origineel : %d %d %d\n", a, b, c);
    wissel(&a, &b);
// verwissel a en b
    wissel(&b, &c);
//verwissel b en c
    printf("Gewisseld : %d %d %d\n", a, b, c);
    return 0;
}

void wissel(int* a, int* b) {
    int x = *a;
    *a = *b;
    *b = x;
}