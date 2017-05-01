#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define AANTAL 3

typedef struct {
    char naam[20];
    int gewicht;
    double lengte;
} PERSOON;

double bmi(int, double);
char* conclusie(double);

int main(int argc, char **argv) {
    PERSOON personen[AANTAL] =  {
            { "Sara", 60, 1.81 },
            { "Louis", 80, 1.85 },
            { "Louise", 68, 1.64 }
    };
    printf("%-15s %s  %-5s  %-5s  %s\n\n","Naam","Gewicht","Lengte","BMI","Conclusie");

    for (int i = 0; i < AANTAL; ++i) {
        printf("%-18s %-6d %-5.2lf %-7.2lf %s\n",
               personen[i].naam,
               personen[i].gewicht,
               personen[i].lengte,
               bmi(personen[i].gewicht, personen[i].lengte),
               conclusie(bmi(personen[i].gewicht, personen[i].lengte)));
    }
    return 0;
}

double bmi(int gewicht, double lengte) {
    return gewicht/(lengte*lengte);
}

char* conclusie(double bmi) {
    if (bmi < 18.5) return "ondergewicht";
    if (bmi > 25.0) return "overgewicht";
    return "normaal gewicht";
}