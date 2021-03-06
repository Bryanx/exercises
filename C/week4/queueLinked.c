#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef char* ELEMENT;

typedef struct node_structure {
    ELEMENT element;
    struct node_structure* next;
} NODE;

typedef struct {
    NODE* startNode;
    int size;
} QUEUE;

QUEUE* newQueue();
void offer(QUEUE*, ELEMENT);
ELEMENT poll(QUEUE*);
ELEMENT peek(QUEUE*);
void printQueue(QUEUE*);
void expand(QUEUE*);
void freeQueue(QUEUE*);

int main(){
    printf("Queue-> LinkedList\n");
    QUEUE* myQueue = newQueue();
    offer(myQueue, "Jan");
    offer(myQueue, "Piet");
    offer(myQueue, "Joris");
    printQueue(myQueue);
    printf("Poll: %s\n", poll(myQueue));
    printQueue(myQueue);
    printf("Poll: %s\n", poll(myQueue));
    printf("Offering 'Corneel'\n");
    offer(myQueue, "Corneel");
    printQueue(myQueue);
    freeQueue(myQueue);
    return 0;
}


QUEUE* newQueue(){
    QUEUE* q = malloc(sizeof(QUEUE));
    q->size = 0;
    q->startNode = NULL;
    return q;
}


NODE* newNode(ELEMENT e){
    NODE* n = malloc(sizeof(NODE));
    n->element = e;
    return n;
}

void freeQueue(QUEUE* queue){
    int i;
    NODE* nextNode = queue->startNode;
    for(i = 0; i < queue->size; i++) {
        NODE* currentNode = nextNode;
        nextNode = currentNode->next;
        free(currentNode);
    }
    free(queue);
}

void offer(QUEUE* queue, ELEMENT element){
    if (queue->size == 0) {
        queue->startNode = newNode(element);
    } else {
        NODE *indexNode = queue->startNode;
        for (int i = 1; i < queue->size; ++i) {
            indexNode = indexNode->next;
        }
        indexNode->next = newNode(element);
    }
    queue->size++;
}

ELEMENT poll(QUEUE* queue){
    if (queue->size == 0) return NULL;
    NODE* tmpNode = queue->startNode;
    ELEMENT tmpElement = tmpNode->element;
    queue->startNode = queue->startNode->next;
    free(tmpNode);
    queue->size--;
    return tmpElement;
}

ELEMENT peek(QUEUE* queue){
    if (queue->size == 0) return NULL;
    return queue->startNode->element;
}



void printQueue(QUEUE* queue){
    NODE* indexNode = queue->startNode;

    for (int i = 0; i < queue->size; ++i) {
        printf("%s ", indexNode->element);
        indexNode = indexNode->next;
    }

    printf("\n");
}
