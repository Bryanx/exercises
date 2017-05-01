#include <stdio.h>
#include <string.h>

char *camelcase(char *zin);

int main() {
    char naam1[] = "luke SKYWALKER";
    char naam2[] = "jos d'hooghe";
    char naam3[] = " lodewijk dE VEERTIENDE";
    printf("Na camelcase:\n");
    printf("%s\n", camelcase(naam1));
    printf("%s\n", camelcase(naam2));
    printf("%s\n", camelcase(naam3));
    return 0;
}

char *camelcase(char *zin) {
    /*
     * Als een char een hoofdletter is:
     * maak er een kleine letter van
     */
    for (int i = 0; i < strlen(zin); ++i) {
        if (*(zin + i) > 64 && *(zin + i) < 91) {
            *(zin + i) += 32;
        }
    }
    /*
     * Als een char een spatie dan:
     * Als de volgende char een kleine letter is
     * en de plaats van deze char niet groter is dan de lengte van de zin
     * Maak van de volgende char een hoofdletter
     */
    for (int j = 0; j < strlen(zin); ++j) {
        if (*(zin + j) == 32) {
            if (*(zin + j + 1) >= strlen(zin)) {
                if (*(zin + j + 1) > 96 && *(zin + j + 1) < 123) {
                    *(zin + j + 1) -= 32;
                }
            }
        }
    }
    /*
     * Als de eerste(nulde) char geen spatie is:
     * Maak er een hoofdletter van
     */
    if (*zin > 96 && *zin < 123)
        *zin -= 32;

    return zin;
}