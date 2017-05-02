#include <stdio.h>
void matroesjka(int grootte);
int main(int argc, char **argv)
{
    printf("Matroesjka's\n");
    matroesjka(8);
    return 0;
}
void matroesjka(int grootte) {
    if (grootte==0) {
        return;
    } else {
        printf("Popje van %d\n", grootte);
        matroesjka(grootte-1);
    }
}