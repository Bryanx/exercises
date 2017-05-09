#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_MAP_SIZE 500

typedef char *ELEMENT;

typedef struct {
    ELEMENT *keys;
    ELEMENT *values;
    int size;
} MAP;

MAP *newMap();

void put(MAP *map, ELEMENT key, ELEMENT value);

ELEMENT get(MAP *map, ELEMENT key);

void removePair(MAP *map, ELEMENT key);

void printMap(MAP *map);

void freeMemory(MAP *map);

MAP *newMap() {
    //Vul aan.... (Gebruik constante MAX_MAP_SIZE om het aantal mogelijke keys en values vast te leggen)
    MAP *map = calloc(1, sizeof(MAP));
    map->keys = calloc(MAX_MAP_SIZE, sizeof(ELEMENT));
    map->values = calloc(MAX_MAP_SIZE, sizeof(ELEMENT));
    map->size = 0;
    return map;
}

void put(MAP *map, ELEMENT key, ELEMENT value) {
    if (map->size == MAX_MAP_SIZE) return;
    map->keys[map->size] = key;
    map->values[map->size] = value;
    map->size++;
}

ELEMENT get(MAP *map, ELEMENT key) {
    //Vul aan (TIP: gebruik de functie getKeyIndex)....
    for (int i = 0; i < map->size; ++i) {
        if (strcmp(map->keys[i], key) == 0) {
            return map->values[i];
        }
    }
    return NULL;
}

void removePair(MAP *map, ELEMENT key) {
    //Vul aan (TIP: gebruik de functie getKeyIndex)....
    int i = getKeyIndex(map, key);

    if (i != -1) {
        for (int j = i; j < map->size-1; ++j) {
            map->keys[j] = map->keys[j + 1];
            map->values[j] = map->values[j + 1];
        }
        map->size--;
    }
}

int getKeyIndex(MAP *map, ELEMENT key) {
    int i;
    for (i = 0; i < map->size; i++) {
        if (strcmp(map->keys[i], key) == 0) {
            return i;
        }
    }
    return -1;
}

void printMap(MAP *map) {
    int i;
    printf("Afdruk Map:\n");
    for (i = 0; i < map->size; i++) {
        printf("  %d) %s - %s\n", i, map->keys[i], map->values[i]);
    }
}

void freeMemory(MAP *map) {
    free(map->keys);
    free(map->values);
    free(map);
}

int main() {
    MAP *map = newMap();
    printf("Map -> 2 Arrays:\n");
    char *naam1 = "Jan";
    char *naam2 = "Piet-Joris";
    char *naam3 = "Corneel";
    put(map, naam1, "0486/11.33.23");
    put(map, naam2, "0486/10.20.30");
    put(map, naam3, "0475/11.39.12");
    printMap(map);
    printf("Nummer van Jan: %s\n", get(map, naam1));
    printf("Piet-Joris verwijderen...\n");
    removePair(map, naam2);
    removePair(map, "bla");
    printMap(map);
    freeMemory(map);
    return 0;
}