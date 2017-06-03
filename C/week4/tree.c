#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef char* ELEMENT;

typedef struct node_structure {
    ELEMENT element;
    struct node_structure* left;
    struct node_structure* right;
} NODE;

typedef struct {
    NODE* rootNode;
    int size;
} TREE;


TREE* newTREE() {
    TREE* tree = malloc(sizeof(TREE));
    tree->rootNode = NULL;
    tree->size = 0;
    return tree;
}

NODE* newNode(ELEMENT element){
    NODE* treeNode = malloc(sizeof(NODE));
    treeNode->element = element;
    treeNode->left = NULL;
    treeNode->right = NULL;
    return treeNode;
}

int compareElements(ELEMENT e1, ELEMENT e2){
    return strcmp(e1, e2);
}

void addNode(NODE* parent, ELEMENT element) {
    int difference = compareElements(element,parent->element);
    if (difference <= 0) {
        if (parent->left == NULL) {
            parent->left = newNode(element);
        } else {
            return addNode(parent->left, element);
        }
    }else {
        if (parent->right == NULL) {
            parent->right = newNode(element);
        } else {
            return addNode(parent->right, element);
        }
    }
}

void addElement(TREE* tree, ELEMENT element){
    if(tree->rootNode == NULL){
        tree->rootNode = newNode(element);
    }else{
        addNode(tree->rootNode, element);
    }
    tree->size++;
}

void printNode(NODE* node){
    if (node == NULL) return;
    printNode(node->left);
    printf("%s ", node->element);
    printNode(node->right);
}

void printTree(TREE* tree){
    printNode(tree->rootNode);
    printf("\n");
}

void freeNode(NODE* node){
    if(node == NULL) return;
    freeNode(node->left);
    freeNode(node->right);
    free(node);
}

void freeMemory(TREE* tree) {
    freeNode(tree->rootNode);
    free(tree);
}

int containsInNode(NODE* node, ELEMENT element){
    if (node==NULL) return 0;
    int difference = compareElements(element, node->element);
    if (difference == 0) return 1;
    if (difference < 0) {
        return containsInNode(node->left, element);
    } else {
        return containsInNode(node->right, element);
    }
}

int contains(TREE* tree, ELEMENT element){
    return containsInNode(tree->rootNode, element);
}


int main() {
    TREE* tree = newTREE();
    printf("Tree:\n");
    char* naam1 = "Jan";
    char* naam2 = "Piet-Joris";
    char* naam3 = "Corneel";
    char* naam4 = "Winokio";
    char* naam5 = "Kirk";
    addElement(tree, naam1);
    addElement(tree, naam2);
    addElement(tree, naam3);
    addElement(tree, naam4);
    addElement(tree, naam5);
    printTree(tree);
    int result = contains(tree, naam2);
    printf("%s is gevonden? %d\n", naam2, result);
    result = contains(tree, "Jos");
    printf("%s is gevonden? %d\n", "Jos", result);
    freeMemory(tree);
    return 0;
}
