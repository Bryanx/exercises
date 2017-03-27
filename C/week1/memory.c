#include <stdio.h>
//
// Created by Bryan de Ridder on 27-03-17.
//

int main() {
    printf("%-15s %s\n", "TYPE", "SIZE");
    printf("=====================\n");
    printf("%-15s %d\n", "char", (int) sizeof(char));
    printf("%-15s %d\n", "short", (int) sizeof(short));
    printf("%-15s %d\n", "int", (int) sizeof(int));
    printf("%-15s %d\n", "long", (int) sizeof(long));
    printf("%-15s %d\n", "float", (int) sizeof(float));
    printf("%-15s %d\n", "double", (int) sizeof(double));
    machten();
}

int machten() {
    printf("\n");
    printf("%s %10s %10s %10s \n", "a", "a^2", "a^3", "a^4");
    for (int i = 1; i <= 9; ++i) {
        printf("%d %10d %10d %10d \n", i, i * i, i * i * i, i * i * i * i);
    }
    printf("==================================\n");
    printf("%s %10s %10s %10s \n", "a", "1/a^2", "1/a^3", "1/a^4");
    for (double i = 1; i <= 9; ++i) {
        printf("%.0f %10.3f %10.3f %10.3f \n", i, 1 / i, 1 / i / i, 1 / i / i / i);
    }

}