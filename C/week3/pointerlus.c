#include <stdio.h>
#define AANTAL 10

int main() {
    int getallen[AANTAL] = {10, 20, 30, 40, 50, 60, 50, 40, 30, 10};

    /*
    * Lengte array bepalen:
    */
    int lengteArray = *(&getallen+1) - getallen;
    // of:
    int arrayLengte = sizeof(getallen)/sizeof(int);

    /*
     * Klassieke lus:
     */
    for (int i = 0; i < arrayLengte; ++i) {
        printf("%d ", getallen[i]);
    }

    printf("\n");
    /*
    * Eerste manier: Pointer lus:
    */
    for (int i = 0; i < arrayLengte; ++i) {
        printf("%d ", *(getallen + i));
    }


    printf("\n");
    /*
    * Tweede manier: Pointer lus:
    */
    for (int *p = getallen; p < getallen + arrayLengte; ++p) {
        printf("%d ", *p);
    }
}