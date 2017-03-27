#include <stdio.h>
//
// Created by Bryan de Ridder on 27-03-17.
//

/*
 * de & verwijst naar de plaats in het geheugen waar het getal wordt opgeslagen
*/

int main(int argc, char **argv) {
    int getal1 = 9;
    int getal2 = 5;
    double double1 = 15.2;
    double double2 = 4.2;
    char char1 = 'a';
    char char2 = 'b';
    long long1 = 9;
    long long2 = 5;

    printf("long = %d, adres: %d\n", getal1, &getal1);
    printf("getal = %d, adres: %d\n", getal2, &getal2);
    printf("char = %c, adres: %d\n", char1, &char1);
    printf("char = %c, adres: %d\n", char2, &char2);

    printf("Grootte van een int: %d bytes\n", (int) &getal1 - (int) &getal2);
    printf("Grootte van een char: %d bytes\n", (int) &char1 - (int) &char2);
    printf("Grootte van een double: %d bytes\n", (int) &double1 - (int) &double2);
    printf("Grootte van een long: %d bytes\n", (int) &long1 - (int) &long2);
    return 0;
}