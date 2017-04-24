#include <stdio.h>
#include <string.h>

#define AANTAL 10

void verhoogGetallen(int *a, int aantal);
void berekenGemiddelde(int *a, int aantal);
void hoofdletters(char *text, int aantal);

int main() {
    int getallen[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

    for (int i = 0; i < AANTAL; ++i) {
        printf("%d ", *(getallen + i));
    }
    printf("\n");

    verhoogGetallen(getallen, sizeof(getallen)/sizeof(int));

    for (int i = 0; i < AANTAL; ++i) {
        printf("%d ", *(getallen + i));
    }

    printf("\n");

    berekenGemiddelde(getallen, sizeof(getallen)/sizeof(int));
    char *text = "C rules";
    hoofdletters(&text, strlen(text));

    return 0;
}

void hoofdletters(char* text, int aantal) {
    for (int i = 0; i < aantal; ++i) {
        
    }
}

void berekenGemiddelde(int *a, int aantal) {
    int som;
    for (int i = 0; i < aantal; ++i) {
        som += *(a + i);
    }

    printf("Gemiddelde is: %d", som / AANTAL);
}

void verhoogGetallen(int *a, int aantal) {
    for (int i = 0; i < aantal; ++i) {
        *(a + i) = *(a + i) + 1;
    }
}

