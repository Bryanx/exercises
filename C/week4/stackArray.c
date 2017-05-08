#include <stdio.h>
#include <stdlib.h>

#define INITIAL_CAPACITY 4

typedef char *ELEMENT;

typedef struct {
    ELEMENT *elements; //dit is de array van elementen
    int capacity;
    int size;
} STACK;

//hulpfunctie: expand
void expand(STACK *stack) {
    //printf("Doubling the capacity to %d!\n",2*list->capacity);
    stack->capacity = stack->capacity * 2;
    ELEMENT *newElements = malloc(sizeof(ELEMENT) * stack->capacity);
    int i;
    for (i = 0; i < stack->size; i++) {
        newElements[i] = stack->elements[i];
    }
    free(stack->elements); //vergeet niet het geheugen van de oude array terug vrij te geven!
    stack->elements = newElements;
}

//creatie
STACK *newStack() {
    STACK *pStack = malloc(sizeof(STACK));
    pStack->elements = malloc(sizeof(ELEMENT) * INITIAL_CAPACITY);
    pStack->capacity = INITIAL_CAPACITY;
    pStack->size = 0;
    return pStack;
}

// Nieuw element toevoegen bovenaan de stapel
void push(STACK *stack, ELEMENT element) {
    if (stack->size == stack->capacity) expand(stack);
    stack->elements[stack->size] = element;
    stack->size++;
}

// Het laatste element van de stack halen
ELEMENT pop(STACK *stack) {
    if (stack->size == 0) return NULL;
    stack->size--;
    return stack->elements[stack->size];
}

//Het bovenste element retourneren zonder het te verwijderen
ELEMENT peek(STACK *stack) {
    if (stack->size != 0) return NULL;
    return stack->elements[stack->size];
}

void printStack(STACK *stack) {
    printf("Stack (size %d, capacity %d): ", stack->size, stack->capacity);
    for (int i = 0; i < stack->size; ++i) {
        printf("%s ", stack->elements[i]);
    }

    printf("\n");
}

void freeStack(STACK *stack) {
    free(stack->elements);
    free(stack);
}

int main() {
    printf("Stack-> Array\n");
    STACK *myStack = newStack();
    push(myStack, "Corneel");
    push(myStack, "Piet-Joris");
    push(myStack, "Jan");
    printStack(myStack);
    printf("Popping %s\n", pop(myStack));
    printStack(myStack);
    printf("Popping %s\n", pop(myStack));
    printStack(myStack);
    printf("Popping %s\n", pop(myStack));
    printStack(myStack);
    freeStack(myStack);
    return 0;
}