#include <stdio.h>
#include <stdlib.h>

void gebruikCalloc();

int main() {
    /*
     * malloc haalt een array uit de heap.
     * soort heap array.
     */
    int* p = malloc(100);
    *p = 37;            // p[0] = 37;
    *(p + 1) = 17;      // p[1] = 17;
    *(p + 2) = 45;      // p[2] = 45;
    printf("%d ",*p);
    printf("%d ",*(p+1));
    printf("%d ",*(p+2));

    free(p);   //verwijder memory uit de heap

    gebruikCalloc();
    return 0;
}

void gebruikCalloc() {
    int* heapGetallen = calloc(25, sizeof(int));  //25 ints
    *heapGetallen = 37;            // p[0] = 37;
    *(heapGetallen + 1) = 17;      // p[1] = 17;
    *(heapGetallen + 2) = 45;      // p[2] = 45;
    printf("%d ",*heapGetallen);
    printf("%d ",*(heapGetallen+1));
    printf("%d ",*(heapGetallen+2));

    free(heapGetallen);   //verwijder memory uit de heap
}
