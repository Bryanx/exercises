#include <stdio.h>
#include <stdlib.h>

typedef char *ELEMENT;

typedef struct {
    ELEMENT *elements;
    int capacity;
    int size;
} QUEUE;

QUEUE *newQueue(int);

void offer(QUEUE *, ELEMENT);

ELEMENT poll(QUEUE *);

ELEMENT peek(QUEUE *);

void printQueue(QUEUE *);

void expand(QUEUE *);

void freeQueue(QUEUE *);


int main() {
    printf("Queue-> Array\n");
    QUEUE *myQueue = newQueue(2);
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

QUEUE *newQueue(int capacity) {
    QUEUE *q = malloc(sizeof(QUEUE));
    q->elements = malloc(sizeof(ELEMENT) * capacity);
    q->capacity = capacity;
    q->size = 0;
    return q;
}

void expand(QUEUE *queue) {
    //Capacity van de queue verdubbelen
    queue->capacity = queue->capacity * 2;
    //Een nieuwe array van elementen aanmaken, met voldoende plaats in de array
    // om voldoende elementen (= capacity) te kunnen in bewaren
    ELEMENT *newElements = calloc(queue->capacity, sizeof(ELEMENT));
    int i;
    //Een voor ÈÈn de inhoud van de 'oude' tabel verhuizen naar de nieuwe array
    for (i = 0; i < queue->size; i++) {
        newElements[i] = queue->elements[i];
    }
    //Geheugen van de oude array vrijgeven (niet vergeten!)
    free(queue->elements);
    //De pointer naar de elementen verleggen naar de nieuwe array
    queue->elements = newElements;
}

void freeQueue(QUEUE *queue) {
    free(queue->elements);
    free(queue);
}

void offer(QUEUE *queue, ELEMENT element) {
    if (queue->size >= queue->capacity) expand(queue);
    queue->elements[queue->size] = element;
    queue->size++;
}

ELEMENT poll(QUEUE *queue) {
    if (queue->size == 0) return NULL;
    ELEMENT tmp = queue->elements[0];

    for (int i = 0; i < queue->size; i++) {
        queue->elements[i] = queue->elements[i + 1];
    }

    queue->size--;
    return tmp;
}

ELEMENT peek(QUEUE *queue) {
    if (queue->size == 0) return NULL;
    return queue->elements[0];
}

void printQueue(QUEUE *queue) {
    //Vul aan...
    for (int i = 0; i < queue->size; ++i) {
        printf("%s ", queue->elements[i]);
    }

    printf("\n");
}
