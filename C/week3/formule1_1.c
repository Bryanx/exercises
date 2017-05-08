#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define AANTAL_TEAMS 2
#define AANTAL_PILOTEN 2
/*
Team 1: Mercedes - Hamiliton 44 – Bottas 77
Team 2: Ferrari - Vettel 5 - Raikkonen 7
Team 3: Williams - Massa 19 – Stroll 18
Team 4: Red Bull - Ricciardo 3 – Verstappen 33
*/

typedef struct {
    char* naam;
    int nummer;
} PILOOT;

typedef struct {
    char* team_naam;
    PILOOT* piloten[AANTAL_PILOTEN];
} TEAM;

void lees_teams(TEAM* teams);
void lees_piloot(TEAM* teams, int i);
void toon_teams(TEAM* teams);

int main(int argc, char **argv) {

    TEAM* teams[AANTAL_TEAMS];
    for (int i = 0; i < AANTAL_TEAMS; ++i) {
        teams[i] = malloc(sizeof(TEAM));
        lees_teams(teams[i]);
    }
    printf("\nTeams\n");
    for (int j = 0; j < AANTAL_TEAMS; ++j) {
        printf("Team %d: ", j+1);
        toon_teams(teams[j]);
    }
    return 0;
}

void toon_teams(TEAM* teams) {
    printf("%s - %s %d - %s %d\n", teams->team_naam,
           teams->piloten[0]->naam, teams->piloten[0]->nummer,
           teams->piloten[1]->naam, teams->piloten[1]->nummer);
}

void lees_piloot(TEAM* teams, int i) {
    char buffer[21];
    printf("\nGeef de naam van piloot %d:",i+1);
    gets(buffer);
    teams->piloten[i] = malloc(sizeof(teams->piloten));
    teams->piloten[i]->naam = calloc(strlen(buffer), sizeof(char));
    strcpy(teams->piloten[i]->naam,buffer);

    printf("\nGeef het nummer van piloot %d: ",i+1);
    scanf("%d", &teams->piloten[i]->nummer);
    getchar();
}

void lees_teams(TEAM* teams) {
    char buffer[21];
    printf("\nGeef de naam van het team: ");
    gets(buffer);
    teams->team_naam = calloc(strlen(buffer), sizeof(char));
    strcpy(teams->team_naam,buffer);

    for (int i = 0; i < 2; ++i) {
        lees_piloot(teams, i);
    }
}