#include <stdio.h>
#define MAX 6

int power(int x, int n);

int main(int argc, char **argv) {
    int getal;
    int i;
    for (getal = 2 ; getal < MAX; getal++) {
        for (i = 2; i < MAX; i++) {
            printf("%d tot de macht %d = %4d\n", getal, i,
                   power(getal, i));
        }
        printf("\n");
    }
    return 0;
}

int power(int x, int n) {
    if (n == 0) return 1;
    return power(x, n-1)*x;
}