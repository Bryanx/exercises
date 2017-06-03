#include <stdio.h>
int som_kwadraten(int m, int n);

int main(int argc, char **argv) {
    printf("De som van de kwadraten van %d tot %d is %d.\n",
           5, 10, som_kwadraten(5, 10));
    return 0;
}

// Recursief (binair verdelen)
int som_kwadraten(int m, int n) {
    int midden;
    if (m == n) return midden;
    som_kwadraten(m+1, n);
    som_kwadraten(m+1, n);
}