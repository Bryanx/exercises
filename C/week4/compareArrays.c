#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define INITIAL_CAPACITY 4
#define TEST_SIZE 50000

typedef int ELEMENT; //de elementen in de lijst zullen gehele getallen zijn

typedef struct {
    ELEMENT* elements; //dit is de array van elementen
    int capacity;
    int size;
} ARRAYLIST;

typedef struct node_structure {
    ELEMENT element;
    struct node_structure* next;
} NODE;

typedef struct {
    NODE* startNode;
    int size;
} LINKEDLIST;

//hulpfunctie: expand
void expand(ARRAYLIST* list) {
    ELEMENT* newElements = malloc(sizeof(ELEMENT)*(list->capacity)*2);
    int i;
    for (i=0;i<list->capacity;i++) {
        newElements[i] = list->elements[i];
    }
    free(list->elements); //vergeet niet het geheugen van de oude array terug vrij te geven!
    list->elements = newElements;
    list->capacity = (list->capacity)*2;
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
void addElementAL(ARRAYLIST* list, ELEMENT element, int index){
    if (list->size==list->capacity) {
        expand(list);
    }
    int i;
    for (i=list->size;i>index;i--) {
        list->elements[i] = list->elements[i - 1];
    }
    list->elements[index] = element;
    list->size++;
}

//Verwijderen
void removeElementAtAL(ARRAYLIST* list, int index){
    int i;
    for (i=index;i<list->size;i++) {
        list->elements[i] = list->elements[i + 1];
    }
    list->size--;
}

//Opvragen
ELEMENT getElementAL(ARRAYLIST* list, int index){
    return list->elements[index];
}

//Printen
void printListAL(ARRAYLIST* list){
    printf("Capacity:%d\nSize:%d\n",list->capacity,list->size);
    printf("Elements:\n");
    int i;
    for (i = 0;i<list->size;i++) {
        printf("lijst(%d)=%d\n",i,getElementAL(list,i));
    }
}

//creatie
LINKEDLIST *newLinkedList() {
    LINKEDLIST *pLinkedList = malloc(sizeof(LINKEDLIST));
    pLinkedList->size = 0;
    pLinkedList->startNode = NULL;
    return pLinkedList;
}

//OPMERKING: TODO: controle op indexen!

NODE* newNode(ELEMENT element){
    NODE * pNode = malloc(sizeof(NODE));
    pNode->element = element;
    return pNode;
}

//Toevoegen
void addElementLL(LINKEDLIST* list, ELEMENT element, int index){
    //printf("Adding element %c at position %d\n", element, index);
    NODE *nodeNew = newNode(element);
    int i;
    //index==0 is een speciaal geval: de nieuwe node komt helemaal vooraan de keten
    if (index==0) {
        if (list->startNode!=NULL) {
            nodeNew->next = list->startNode;
        }
        list->startNode = nodeNew;
    } else {
        //index>1:
        //we zoeken nu de twee nodes waartussen deze node moet komen: nodePrev en nodeNext
        NODE *nodePrev = list->startNode;
        for (i=1;i<index;i++) nodePrev = nodePrev->next; //index keer naar de volgende node springen
        NODE *nodeNext = nodePrev->next;
        //nodeNew tussen nodePrev en nodeNext plaatsen
        nodePrev->next = nodeNew;
        nodeNew->next = nodeNext;
    }
    list->size++;
}

//Verwijderen
void removeElementAtLL(LINKEDLIST* list, int index){
    //printf("Removing element at position %d\n", index);
    //een element verwijderen wil zeggen: element zoeken en dan de vorige naar de volgende laten wijzen en den huidge free-en
    //als er geen vorige is, dat wil zeggen: index 0, dan moet startNode naar de volgende wijzen
    if (index==0) {
        NODE *temp = list->startNode;
        list->startNode = list->startNode->next;
        free(temp);
    } else {
        NODE *nodePrev = list->startNode;
        int i;
        for (i = 1;i<index;i++) {
            nodePrev = nodePrev->next;
        }
        NODE *temp = nodePrev->next;
        nodePrev->next = nodePrev->next->next;
        free(temp);
    }
    list->size--;
}

//Opvragen
ELEMENT getElementLL(LINKEDLIST* list, int index){
    NODE *indexNode = list->startNode;
    int i;
    for (i = 0;i<index;i++) {
        indexNode = indexNode->next;
    }
    return indexNode->element;
}

//Printen
void printListLL(LINKEDLIST* list){
    NODE *indexNode = list->startNode;
    int i;
    for (i = 0;i<list->size;i++) {
        printf("list(%d)=%d\n",i,indexNode->element);
        indexNode = indexNode->next;
    }
}

void testInsertAtZeroAL(ARRAYLIST* list){

    ELEMENT element = 'a';
    for (int i = 0; i < 50000; ++i) {
        addElementAL(list, element,0);
    }
}

void testInsertAtZeroLL(LINKEDLIST* list){
    ELEMENT element = 'a';
    for (int i = 0; i < 50000; ++i) {
        addElementLL(list, element,0);
    }
}

void testLookUpAL(ARRAYLIST* list){
    //Vul aan... (haal elk element eens op, op basis van zijn index)
    for (int i = 0; i < list->size; ++i) {
        getElementAL(list,i);
    }
}

void testLookUpLL(LINKEDLIST* list){
    //Vul aan... (haal elk element eens op, op basis van zijn index)
    for (int i = 0; i < list->size; ++i) {
        getElementLL(list,i);
    }
}

int main() {
    ARRAYLIST* testArray = newArrayList();
    LINKEDLIST* testLinked = newLinkedList();
    printf("Testing\n");
    //De huidige tijd opvragen (aantal sec sinds middernacht):

    clock_t start = clock(), diff;
    testInsertAtZeroAL(testArray);
    diff = clock() - start;
    double msec = clock() - start * 1000 / CLOCKS_PER_SEC;
    printf("ArrayList insert: %lfs\n", msec/1000);

    start = clock(), diff;
    testInsertAtZeroLL(testLinked);
    diff = clock() - start;
    msec = diff * 1000 / CLOCKS_PER_SEC;
    printf("LinkedList insert: %lfs\n", msec/1000);

    start = clock(), diff;
    testLookUpAL(testArray);
    diff = clock() - start;
    msec = diff * 1000 / CLOCKS_PER_SEC;
    printf("ArrayList lookup: %lfs\n", msec/1000);

    start = clock(), diff;
    testLookUpLL(testLinked);
    diff = clock() - start;
    msec = diff * 1000 / CLOCKS_PER_SEC;
    printf("LinkedList lookup: %lfs\n", msec/1000);
    return 0;
}
