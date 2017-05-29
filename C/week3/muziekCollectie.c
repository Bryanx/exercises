#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char* artiest;
    char* titel;
    int jaartal;
    double duur;
} SONG;

typedef struct {
    char* eigenaar;
    SONG** album;
} COLLECTIE;

int leesGegevens(COLLECTIE *ptr);

void toonCollectie(COLLECTIE* collectie, int aantal);

void freeMemory(COLLECTIE* collectie, int aantal);

int main(int argc, char **argv)
{
    int aantal;
    COLLECTIE* collectie = calloc(1,sizeof(COLLECTIE));
    aantal = leesGegevens(collectie);
    toonCollectie(collectie, aantal);
    freeMemory(collectie, aantal);
    return 0;
}

int leesGegevens(COLLECTIE *ptr) {
    char buffer[30];
    printf("\nGeef de naam van de eigenaar: " );
    gets(buffer);
    ptr->eigenaar = calloc(strlen(buffer), sizeof(char));
    strcpy(ptr->eigenaar, buffer);

    int aantalSongs = 0;
    printf("\nHoeveel songs wil je invoeren?" );
    scanf("%d", &aantalSongs);


    for (int i = 0; i < aantalSongs; ++i) {
        printf("\nSong %d:", i+1);

        printf("\n\tArtiest: ");
        gets(buffer);
        ptr->album[i]->artiest = calloc(strlen(buffer), sizeof(char));
        strcpy(ptr->album[i]->artiest, buffer);

        printf("\n\tTitel: ");
        gets(buffer);
        ptr->album[i]->titel = calloc(strlen(buffer), sizeof(char));
        strcpy(ptr->album[i]->titel, buffer);

        printf("\n\tJaartal: ");
        scanf("%d", &(ptr->album[i]->jaartal));

        printf("\n\tDuur: ");
        scanf("%lf", &(ptr->album[i]->duur));
    }

    return aantalSongs;
}

void freeMemory(COLLECTIE* collectie, int aantal) {

}

void toonCollectie(COLLECTIE* collectie, int aantal) {

}