#include <stdio.h>
#include <stdlib.h>

typedef char ELEMENT; //de elementen in de lijst zullen eenvoudige characters zijn

typedef struct node_structure {
    ELEMENT element;
    struct node_structure *next;
} NODE;

typedef struct {
    NODE *startNode;
    int size;
} LINKEDLIST;

//creatie
LINKEDLIST *newLinkedList() {
    LINKEDLIST *pLinkedList = malloc(sizeof(LINKEDLIST));
    pLinkedList->size = 0;
    pLinkedList->startNode = NULL;
    return pLinkedList;
}

NODE *newNode(ELEMENT element) {
    NODE *pNode = malloc(sizeof(NODE));
    pNode->element = element;
    pNode->next = NULL;
    return pNode;
}

//Toevoegen
void addElement(LINKEDLIST *list, ELEMENT element, int index) {
    //printf("Adding element %c at position %d\n", element, index);
    NODE *nodeNew = newNode(element);
    //index==0 is een speciaal geval: de nieuwe node komt helemaal vooraan de keten
    if (index == 0) {
        if (list->startNode != NULL) {
            nodeNew->next = list->startNode;
        }
        list->startNode = nodeNew;
    } else {
        //index>1:
        //we zoeken nu de twee nodes waartussen deze node moet komen: nodePrev en nodeNext
        NODE *nodePrev = list->startNode;
        for (int i = 1; i < index; i++) {
            nodePrev = nodePrev->next;
        }
        //index keer naar de volgende node springen
        NODE *nodeNext = nodePrev->next;
        //nodeNew tussen nodePrev en nodeNext plaatsen
        nodePrev->next = nodeNew;
        nodeNew->next = nodeNext;
    }
    list->size++;
}

//Verwijderen
void removeElementAt(LINKEDLIST *list, int index) {
    //printf("Removing element at position %d\n", index);
    //een element verwijderen wil zeggen: element zoeken en dan de vorige naar de volgende laten wijzen en den huidge free-en
    //als er geen vorige is, dat wil zeggen: index 0, dan moet startNode naar de volgende wijzen
    if (index == 0) {
        NODE *temp = list->startNode;
        list->startNode = list->startNode->next;
        free(temp);
    } else {
        NODE *nodePrev = list->startNode;
        for (int i = 1; i < index; i++) {
            nodePrev = nodePrev->next;
        }
        NODE *temp = nodePrev->next;
        nodePrev->next = nodePrev->next->next;
        free(temp);
    }
    list->size--;
}

//Opvragen
ELEMENT getElement(LINKEDLIST *list, int index) {
    NODE *indexNode = list->startNode;
    for (int i = 0; i < index; i++) {
        indexNode = indexNode->next;
    }
    return indexNode->element;
}

//Printen
void printList(LINKEDLIST *list) {
    NODE *indexNode = list->startNode;

    for (int i = 0; i < list->size; i++) {
        printf("list[%d] = '%c'\n", i, indexNode->element);
        indexNode = indexNode->next;
    }
}

/* Zoekt de plaats waar een bepaald element in de ArrayList staat.
 * Return -1 indien niet gevonden.
 */
int indexOf(LINKEDLIST *list, ELEMENT element) {
    NODE *indexNode = list->startNode;

    for (int i = 0; i < list->size; i++) {
        if (indexNode->element == element) return i;
        indexNode = indexNode->next;
    }
    return -1;
}

//Geheugen vrijgeven
void freeMemory(LINKEDLIST *list) {
    NODE *nextNode = list->startNode;
    for (int i = 0; i < list->size; i++) {
        NODE *currentNode = nextNode;
        nextNode = currentNode->next;
        free(currentNode);
    }
    free(list);
};

int main() {
    LINKEDLIST *list = newLinkedList();
    for (int i = 0; i < 10; i++) {
        addElement(list, (char) (i + 65), 0);
    }
    printList(list);
    printf("Index of 'D':%d\n", indexOf(list, 'D'));
    printf("Index of 'Q':%d\n", indexOf(list, 'Q'));
    printf("Element of index 1:'%c' \n", getElement(list, 0));
    freeMemory(list);
    return 0;
}