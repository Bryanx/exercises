#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define NBR_OF_BUCKETS 100

typedef char* ELEMENT;

typedef struct {
    ELEMENT key;
    ELEMENT value;
} PAIR;

typedef struct node_structure {
    PAIR pair;
    struct node_structure* next;
} NODE;

typedef struct {
    NODE* startNode;
    int size;
} LINKEDLIST;

typedef struct {
    LINKEDLIST** buckets; //array van pointers naar gelinkte lijsten!
    int size;
} HASHMAP;


HASHMAP* newMap() {
    HASHMAP* map = malloc(sizeof(HASHMAP));
    map->buckets = calloc(sizeof(LINKEDLIST*), NBR_OF_BUCKETS);
    map->size = 0;
    return map;
}

LINKEDLIST* newLinkedList() {
    LINKEDLIST* pLinkedList = malloc(sizeof(LINKEDLIST));
    pLinkedList->size = 0;
    pLinkedList->startNode = NULL;
    return pLinkedList;
}

NODE* newNode(ELEMENT key, ELEMENT value) {
    NODE* node = malloc(sizeof(NODE));
    node->pair.key = key;
    node->pair.value = value;
    node->next = NULL;
    return node;
}

int hash(char* string){
    int sum = 0;
    int i;
    for(i = 0; i <strlen(string); i++){
        sum += (int)string[i];
    }
    return sum%NBR_OF_BUCKETS;
}

void put(HASHMAP* map,ELEMENT key, ELEMENT value){
    int i = hash(key);
    LINKEDLIST* list;
    if (map->buckets[i] == NULL) {
        list = newLinkedList();
        list->startNode = newNode(key,value);
        map->buckets[i] = list;
    } else {
        list = map->buckets[i];
        NODE* tmp = list->startNode;
        list->startNode = newNode(key,value);
        list->startNode->next = tmp;
    }
    map->size++;
    list->size++;
}

ELEMENT get(HASHMAP* map,ELEMENT key){
    int i = hash(key);
    if (map->buckets[i]==NULL) return NULL;

    LINKEDLIST* list = map->buckets[i];
    NODE* indexNode = list->startNode;
    for (int j = 0; j < list->size; ++j) {
        if (strcmp(indexNode->pair.key,key)==0) {
            return indexNode->pair.value;
        }
        indexNode = indexNode->next;
    }
    return NULL;
}

void removePair(HASHMAP* map, ELEMENT key){
    int index = hash(key);
    LINKEDLIST* listOfKey = map->buckets[index];
    if (listOfKey == NULL) return; //Niets gevonden, dus we verlaten deze functie

    NODE* previousNode = NULL;
    NODE* nodeToRemove = listOfKey->startNode;
    while(nodeToRemove != NULL && nodeToRemove->pair.key != key){
        previousNode = nodeToRemove;
        nodeToRemove = nodeToRemove->next;
    }
    if(nodeToRemove != NULL){ //MATCH is gevonden
        if(previousNode == NULL) {
            //Match was de eerste node uit de lijst, verander dus de startnode
            listOfKey->startNode = nodeToRemove->next;
        }else {
            previousNode->next = nodeToRemove->next;
        }
        free(nodeToRemove);
        listOfKey->size--;
        map->size--;
    } //Geen match? Dan kan je niets verwijderen...
}


void printMap(HASHMAP* map){
    int i;
    printf("Afdruk Hashmap (size = %d):\n", map->size);
    for (i=0;i< NBR_OF_BUCKETS;i++) {
        if (map->buckets[i] != NULL){
            NODE* n = map->buckets[i]->startNode;
            while(n != NULL){
                printf("  %d) %s (hash=%d) - %s\n", i, n->pair.key, hash(n->pair.key), n->pair.value);
                n = n->next;
            }
        }
    }
}

void freeMemory(HASHMAP* map) {
    int i;
    for (i=0;i< NBR_OF_BUCKETS;i++) {
        if (map->buckets[i] != NULL){
            NODE* n = map->buckets[i]->startNode;
            while(n != NULL){
                NODE* next = n->next;
                free(n);
                n = next;
            }
            free(map->buckets[i]);
        }
    }
    free(map->buckets);
    free(map);
}

int main() {
    HASHMAP* map = newMap();
    printf("Map -> Hashmap:\n");
    char* naam1 = "Jan";
    char* naam2 = "Piet-Joris";
    char* naam3 = "Corneel";
    char* naam4 = "Anja";
    char* naam5 = "Jana";
    put(map, naam1, "0486/11.33.23");
    put(map, naam2, "0486/10.20.30");
    put(map, naam3, "0475/11.39.12");
    put(map, naam4, "0495/12.34.56");
    put(map, naam5, "0496/98.76.54");
    printMap(map);
    removePair(map, naam4);
    removePair(map, naam3);
    printMap(map);
    freeMemory(map);
    return 0;
}