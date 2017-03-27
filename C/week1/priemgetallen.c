#include <stdio.h>
//
// Created by Bryan de Ridder on 27-03-17.
//

int main() {
    int bool = 0;
    while (bool != 1) {
        printf("Tik een getal in van 1...1000 in <eindig met 0> : ");
        int getal;
        scanf("%d", &getal);

        if (getal == 0) bool = 1;
        if (getal > 1000 || getal < 0) printf("Foutieve invoer!!");

        int check = 0;
        for (int i = 2; i < 1000; ++i) {
            if (i != getal && getal % i == 0) {
                check++;
            }
        }
        if (check == 0 && getal > 1) {
            printf("%d is een priemgetal\n",getal);
        } else {
            printf("%d is GEEN priemgetal\n",getal);
        }
    }
    return 0;
}

