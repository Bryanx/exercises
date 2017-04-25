#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int main(int argc, char **argv) {
    char *drivers[] = {"Magnussen", "Ericsson", "Kvyat", "Vettel",
                       "Alonso", "Raikkonen", "Hamilton", "Verstappen"};
    double speeds[] = {277.6, 303.3, 294.2, 306.8, 307.6, 300.8, 307.5, 303.3};
    char *fastest_driver; // pointer naar string (= tabel van char met '\0')
    double topspeed;
    int index;
    int number_of_drivers = sizeof(speeds) / sizeof(*speeds);

    for (int i = 0; i < number_of_drivers; ++i) {
        printf("%-12s %.1lf \n", *(drivers+i), *(speeds+i));
    }

    topspeed = *speeds;
    for (int j = 0; j < number_of_drivers; ++j) {
        if (*(speeds+j) > topspeed) {
            topspeed = *(speeds+j);
            strcpy(fastest_driver,*(drivers+j));
        }
    }

    printf("\nFastest driver: %s %.1lf",fastest_driver, topspeed);
}