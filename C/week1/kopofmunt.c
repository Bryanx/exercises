#include <stdio.h>
#include <stdlib.h>
#include <time.h> // voor srand(time(NULL)) en rand()


int main(int argc, char **argv) {
    int tabel[1000];
    int eenen = 0;
    int nullen = 0;
    int langstereeks = 0;
    int reeksnullen = 0;
    int reekseenen = 0;
    srand(time(NULL));

    for (int i = 0; i < 1000; ++i) {
        int r = rand() % 2;
        tabel[i] = r;
        if (tabel[i] == 0) {
            nullen++;
            if (tabel[i-1] == 0) {
                reeksnullen++;
                if (reeksnullen > langstereeks) langstereeks = reeksnullen;
            }
        } else {
            reeksnullen = 0;
        }
        if (tabel[i] == 1) {
            eenen++;
            if (tabel[i-1] == 1) {
                reekseenen++;
                if (reekseenen > langstereeks) langstereeks = reekseenen;
            }
        } else {
            reekseenen = 0;
        }
    }
    printf("%s","kop: ");
    printf("%.2f\n",(double) eenen/10);
    printf("%s","nul: ");
    printf("%.2f\n",(double) nullen/10);

    printf("%s", "langste reeksnullen: ");
    printf("%d", langstereeks);
    return 0;
}