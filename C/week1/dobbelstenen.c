#include <stdio.h>
//
// Created by Bryan de Ridder on 27-03-17.
//

int main() {
    int een=0, twee=0, drie=0, vier=0, vijf=0, zes=0;
    printf("Geef de worpen van een dobbelsteen gescheiden door een spatie. Stop met 0 :\n");
    int bool = 1;
    do {
        int getal;
        scanf("%d",&getal);
        if (getal == 0) bool = 0;
        switch (getal) {
            case 1 : een+= 1;break;
            case 2 : twee+= 1;break;
            case 3 : drie+= 1;break;
            case 4 : vier+= 1;break;
            case 5 : vijf+= 1;break;
            case 6 : zes+= 1;break;
        }
    } while (bool != 0);
    printf("Aantallen:\n"
                   "1: %d\n"
                   "2: %d\n"
                   "3: %d\n"
                   "4: %d\n"
                   "5: %d\n"
                   "6: %d\n", een, twee, drie, vier, vijf, zes);
    return 0;
}