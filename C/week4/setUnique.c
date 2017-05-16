#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef char *ELEMENT;

typedef struct node_structure {
    ELEMENT element;
    struct node_structure *left;
    struct node_structure *right;
} NODE;

typedef struct {
    NODE *rootNode;
    int size;
} SET;


SET *newSET() {
    SET *set = malloc(sizeof(SET));
    set->rootNode = NULL;
    set->size = 0;
    return set;
}

NODE *newNode(ELEMENT element) {
    NODE *setNode = malloc(sizeof(NODE));
    setNode->element = element;
    setNode->left = NULL;
    setNode->right = NULL;
    return setNode;
}

int compareElements(ELEMENT e1, ELEMENT e2) {
    return strcmp(e1, e2);
}

int addNode(NODE *parent, ELEMENT element) {
    NODE *newChildNode;
    int difference = compareElements(element, parent->element);
    if (difference == 0) return 0;
    if (difference <= 0) {
        if (parent->left == NULL) {
            newChildNode = newNode(element);
            parent->left = newChildNode;
        } else {
            return addNode(parent->left, element);
        }
    } else {
        if (parent->right == NULL) {
            newChildNode = newNode(element);
            parent->right = newChildNode;
        } else {
            return addNode(parent->right, element);
        }
    }
    return 1;
}

void addElement(SET *set, ELEMENT element) {
    int nodeAdded = 0;
    if (set->rootNode == NULL) {
        set->rootNode = newNode(element);
        nodeAdded = 1;
    } else {
        nodeAdded = addNode(set->rootNode, element);
    }
    if (nodeAdded == 1) set->size++;
}

void printNode(NODE *node) {
    if (node == NULL) return;
    printNode(node->left);
    printf("  %s\n", node->element);
    printNode(node->right);
}

void printSet(SET *set) {
    printf("Afdruk Set (size = %d):\n", set->size);
    printNode(set->rootNode);
}

int containsInNode(NODE *node, ELEMENT element) {
    if (node == NULL) return 0;
    int difference = compareElements(node->element, element);
    if (difference == 0) return 1;
    else if (difference > 0) return containsInNode(node->left, element);
    else return containsInNode(node->right, element);
}

int contains(SET *set, ELEMENT element) {
    return containsInNode(set->rootNode, element);
}

int counter = 0;


void addElementToArray(ELEMENT* deArray, NODE* node) {
    if (node == NULL) return;
    addElementToArray(deArray, node->left);
    deArray[counter++] = node->element;
    addElementToArray(deArray, node->right);
}

ELEMENT *toArray(SET *set) {
    ELEMENT* deArray = calloc(1,sizeof(ELEMENT));
    addElementToArray(deArray, set->rootNode);
    return deArray;
}


void freeNode(NODE *node) {
    if (node == NULL) return;
    freeNode(node->left);
    freeNode(node->right);
    free(node);
}

void freeMemory(SET *set) {
    freeNode(set->rootNode);
    free(set);
}

int main() {
    SET *set = newSET();
    printf("Set:\n");
    char *namen[] = {"Jan", "Piet-Joris", "Corneel", "Jan", "Winokio"};
    int i;
    for (i = 0; i < 5; i++) {
        addElement(set, namen[i]);
    }
    printSet(set);
    int result = contains(set, namen[1]);
    printf("%s is gevonden? %d\n", namen[1], result);
    printf("Array: ");
    ELEMENT *arrayke = toArray(set);

    for (i = 0; i < set->size; i++) {
        printf("%s ", *(arrayke + i));
    }
    freeMemory(set);
    return 0;
}