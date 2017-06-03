#include <stdio.h>
#include <stdlib.h>

#define INIT_CAPACITY 4

typedef char* ELEMENT;

typedef struct {
    ELEMENT* elements;
    int size;
    int capacity;
}ARRAYLIST;

ARRAYLIST* newArraylist() {
    ARRAYLIST* list = calloc(1, sizeof(ARRAYLIST));
    list->elements = calloc(INIT_CAPACITY, sizeof(ELEMENT));
    list->size = 0;
    list->capacity = INIT_CAPACITY;
    return list;
}

void expand(ARRAYLIST* list) {
    list->capacity = list->capacity*2;
    ELEMENT* newElements = calloc(list->capacity, sizeof(ELEMENT));
    for (int i = 0; i < list->size; ++i) {
        newElements[i] = list->elements[i];
    }
    free(list->elements);
    list->elements = newElements;
}

void addElement(ARRAYLIST* list, ELEMENT element, int index) {
    if (list->size == list->capacity) expand(list);

    for (int i = list->size; i > index; --i) {
        list->elements[i] = list->elements[i-1];
    }
    list->elements[index] = element;
    list->size++;
}

void removeElement(ARRAYLIST* list, int index) {
    if (list->size == 0 || index > list->size) return;

    for (int i = index; i < list->size; ++i) {
        list[i] = list[i+1];
    }
    list->size--;
}

ELEMENT get(ARRAYLIST* list, int index) {
    if (list->size == 0 || index > list->size) return NULL;
    return list->elements[index];
}

void printList(ARRAYLIST* list) {
    printf("Arraylist capacity: %d, size: %d\n", list->capacity, list->size);
    for (int i = 0; i < list->size; ++i) {
        printf("%s ", list->elements[i]);
    }
    printf("\n");
}

int main() {
    ARRAYLIST* list = newArraylist();
    addElement(list, "Bryan",0);
    addElement(list, "Jarne",1);
    addElement(list, "Henk",2);
    addElement(list, "Kees",3);
    addElement(list, "Boudewijn",4);
    printList(list);
    removeElement(list, 0);
    printList(list);
    return 0;
}