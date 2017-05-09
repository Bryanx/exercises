#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_HASHMAP_SIZE 100

typedef char* ELEMENT;

typedef struct {
    ELEMENT key;
    ELEMENT value;
} BUCKET;

typedef struct {
    BUCKET* buckets;
    int size;
} HASHMAP;

HASHMAP* newMap() {
    HASHMAP* map = calloc(1,sizeof(HASHMAP));
    map->buckets = calloc(MAX_HASHMAP_SIZE, sizeof(BUCKET));
    map->buckets->key = calloc(1, sizeof(ELEMENT));
    map->buckets->value = calloc(1, sizeof(ELEMENT));
    map->size = 0;
    return map;
}

int hash(char* string){
    int sum = 0;
    int i;
    for(i = 0; i <strlen(string); i++){
        sum += (int)string[i];
    }
    return sum%MAX_HASHMAP_SIZE;
}


void put(HASHMAP* map,ELEMENT key, ELEMENT value){
    int i = hash(key);
    map->buckets[i].key = key;
    map->buckets[i].value = value;
}

ELEMENT get(HASHMAP* map,ELEMENT key){
    int i = hash(key);
    return map->buckets[i].value;
}

void removePair(HASHMAP* map, ELEMENT key){
    int index = hash(key);
    map->buckets[index].key = NULL;
    map->buckets[index].value = NULL;
    map->size--;
}

void printMap(HASHMAP* map){
    int i;
    printf("Afdruk Hashmap:\n");
    for (i=0;i<MAX_HASHMAP_SIZE;i++) {
        if (map->buckets[i].key != NULL){
            printf("  %d) %s (hash=%d) - %s\n", i, map->buckets[i].key, hash(map->buckets[i].key), map->buckets[i].value);
        }
    }
}

void freeMemory(HASHMAP* map) {
    free(map->buckets);
    free(map);
}

int main() {
    HASHMAP* map = newMap();
    printf("Map -> Hashmap:\n");
    char* naam1 = "Jan";
    char* naam2 = "Piet-Joris";
    char* naam3 = "Corneel";
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