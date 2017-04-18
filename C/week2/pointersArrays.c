#include <stdio.h>

#define AANTAL 10

int main() {
    double waardes[AANTAL] = {10, 123, 23, 4, 3, 5, 45, 23, 45, 34};
    double *pWaardes = waardes;

    printf("waardes[0] = %lf\n", waardes[0]);
    printf("waardes[1] = %lf\n", waardes[1]);
    printf("waardes[2] = %lf\n", waardes[2]);
    printf("waardes[3] = %lf\n", waardes[3]);
    printf("waardes[4] = %lf\n", waardes[4]);
    printf("waardes[5] = %lf\n\n", waardes[5]);

    printf("waardes[0] = %lf\n", *pWaardes);
    pWaardes++;
    printf("waardes[1] = %lf\n", *pWaardes);
    pWaardes++;
    printf("waardes[2] = %lf\n", *pWaardes);
    pWaardes++;
    printf("waardes[3] = %lf\n", *pWaardes);
    pWaardes++;
    printf("waardes[4] = %lf\n", *pWaardes);
    pWaardes++;
    printf("waardes[5] = %lf\n\n", *pWaardes);

    for (int i = 0; i < AANTAL; ++i) {
        printf("waardes[%d] = %lf\n", i, *(waardes + i));
    }

    return 0;
}