#include <stdio.h>
#include <stdlib.h>

typedef char* ELEMENT;

typedef struct {
    ELEMENT* elements;
    int size;
    int capacity;
} STACK;

#define INIT_CAPACITY 5

void expand(STACK* stack) {
    stack->capacity = stack->capacity*2;

    ELEMENT* newElements = calloc(stack->capacity, sizeof(ELEMENT));

    for (int i = 0; i < stack->size; ++i) {
        newElements[i] = stack->elements[i];
    }
    free(stack->elements);
    stack->elements = newElements;
}

STACK* newStack() {
    STACK* stack = calloc(1, sizeof(STACK));
    stack->elements = calloc(INIT_CAPACITY, sizeof(ELEMENT));
    stack->size = 0;
    stack->capacity = INIT_CAPACITY;
    return stack;
}

void push(STACK* stack, ELEMENT element){
    if (stack->size == stack->capacity) expand(stack);
    stack->elements[stack->size] = element;
    stack->size++;
}
ELEMENT pop(STACK* stack) {
    if(stack->size < 0) return NULL;
    stack->size--;
    return stack->elements[stack->size];
}
ELEMENT peek(STACK* stack) {
    if(stack->size < 0) return NULL;
    return stack->elements[stack->size-1];
}

void printStack(STACK* stack) {
    printf("Stack size is %d, stack capacity is: %d\n", stack->size, stack->capacity);
    for (int i = 0; i < stack->size; ++i) {
        printf("%s ", stack->elements[i]);
    }
    printf("\n");
}


int main() {
    STACK* stack = newStack();
    push(stack,"Bryan");
    push(stack,"Jarne");
    push(stack,"Henk");
    printStack(stack);
    pop(stack);
    push(stack,"Henk");
    push(stack,"Henk");
    push(stack,"Henk");
    printStack(stack);
    push(stack,"Henk");
    printStack(stack);
    return 0;
}