#include <stdio.h>
#include <stdlib.h>

#define INITIAL_CAPACITY 4

typedef char ELEMENT; //de elementen in de lijst zullen eenvoudige characters zijn

typedef struct {
    ELEMENT* elements; //dit is de array van elementen
    int capacity;
    int size;
} ARRAYLIST;

//hulpfunctie: expand
void expand(ARRAYLIST* list) {
    //printf("Doubling the capacity to %d!\n",2*list->capacity);
    list->capacity = list->capacity*2;
    ELEMENT* newElements = malloc(sizeof(ELEMENT)*list->capacity);
    int i;
    for (i=0;i<list->size;i++) {
        newElements[i] = list->elements[i];
    }
    free(list->elements); //vergeet niet het geheugen van de oude array terug vrij te geven!
    list->elements = newElements;
}

//creatie
ARRAYLIST *newArrayList() {
    ARRAYLIST *pArrayList = malloc(sizeof(ARRAYLIST));
    pArrayList->elements = malloc(sizeof(ELEMENT)*INITIAL_CAPACITY);
    pArrayList->capacity = INITIAL_CAPACITY;
    pArrayList->size = 0;
    return pArrayList;
}

//Toevoegen
void addElement(ARRAYLIST* list, ELEMENT element, int index){
    if (list->size==list->capacity) {
        expand(list);
    }
    int i;
    for (i=list->size;i>index;i--) {
        list->elements[i] = list->elements[i - 1];
    }
    list->elements[index] = element;
    list->size++;
    //printf("added: %c on index %d\n", element, index);
}

//Verwijderen
void removeElement(ARRAYLIST* list, int index){
    int i;
    for (i=index;i<list->size;i++) {
        list->elements[i] = list->elements[i + 1];
    }
    list->size--;
}

//Opvragen
ELEMENT getElement(ARRAYLIST* list, int index){
    return list->elements[index];
}

//Geheugen vrijgeven
void freeList(ARRAYLIST* list){
    free(list->elements);
    free(list);
}

//Printen
void printList(ARRAYLIST* list){
    for (int i = 0; i < list->size; ++i) {
        printf("list[%d]='%c'\n",i, *(list->elements+i));
    }
}

/*Zoekt in de ArrayList op welke plaats een bepaald element voorkomt.
 * Indien niet gevonden: return -1
 */
int indexOf(ARRAYLIST* list, ELEMENT element) {    
    //Vul aan...
    for (int i = 0; i < list->size; ++i) {
        if (*(list->elements+i) == element) {
            return i;
        }
    }
    return -1;
}

int main() {
    ARRAYLIST* list = newArrayList();
    int i = 0;
    for (i=0;i<10;i++) {
        addElement(list,i + 65,0);
    }
    printList(list);
    printf("Index of 'D':%d\n",indexOf(list,'D'));
    printf("Index of 'Q':%d\n",indexOf(list,'Q'));
    freeList(list);
    return 0;
}
