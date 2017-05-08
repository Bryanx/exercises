#include <stdio.h>
#include <stdlib.h>

typedef char* ELEMENT;

typedef struct node_structure {
    ELEMENT element;
    struct node_structure* next;
} NODE;

typedef struct {
    NODE* startNode;
    int size;
} STACK;

//creatie
STACK *newStack() {
    STACK *pStack = malloc(sizeof(STACK));
    pStack->size = 0;
    pStack->startNode = NULL;
    return pStack;
}

NODE* newNode(ELEMENT element){
    NODE * pNode = malloc(sizeof(NODE));
    pNode->element = element;
    pNode->next = NULL;
    return pNode;
}

//Een nieuw element bovenaan op de stapel leggen:
void push(STACK* stack, ELEMENT element){
    NODE* newnode = newNode(element);
    newnode->next = stack->startNode;
    stack->startNode = newnode;

    stack->size++;
}

//Het laatste element van de stapel halen
ELEMENT pop(STACK* stack){
    if (stack->size == 0) return NULL;

    NODE* tmp = stack->startNode;
    ELEMENT tmpElement = tmp->element;
    stack->startNode = stack->startNode->next;

    stack->size--;
    free(tmp);
    return tmpElement;
}

//Opvragen van het laatst toegevoegde element
ELEMENT peek(STACK* stack){
    if (stack->size == 0) return NULL;
    return stack->startNode->element;
}

//Printen
void printStack(STACK* stack){
    NODE* tmp = stack->startNode;

    for (int i = 0; i < stack->size; ++i) {
        printf("%s ", tmp->element);
        tmp = tmp->next;
    }

    printf("\n");
}

void freeStack(STACK* stack){
    if(stack->startNode != NULL){
        NODE* currNode = stack->startNode;
        while(currNode != NULL){
            free(currNode);
            currNode = currNode->next;
        }
    }
    free(stack);
}

int main(){
    printf("Stack-> LinkedList\n");
    STACK* myStack = newStack();
    push(myStack,"Corneel");
    push(myStack,"Piet-Joris");
    push(myStack,"Jan");
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