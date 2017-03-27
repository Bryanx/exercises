#include <stdio.h>
#include <limits.h>
//
// Created by Bryan de Ridder on 27-03-17.
//

int main() {
    int codes = 1;
    printf("code | char | code | char | code | char | code | char |\n");
    printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    for (int i = 32; i < INT_MAX; ++i) {
        printf("%4d | %4c | ", i, (char) i);
        if (codes % 4 == 0) printf("\n");
        if (codes % 80 == 0) {
            printf("Druk op een ENTER voor het vervolg...");
            getchar();
        }
        codes++;
    }
}
