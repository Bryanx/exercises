#include <stdio.h>


int main() {
    char input[50];
    printf("Tik de richting in (NOZW) of M als je de Minotaurus gedood hebt:");
    for (int i = 0; i < 50; ++i) {
        scanf("%c", &input[i]);
        if (input[i] == 'M') {
            printf("De Minotaurus is dood. Dit is de weg terug:\n");
            for (int j = i-1; j > 0; --j) {
                switch (input[j]) {
                    case 'N' : printf("Z");break;
                    case 'Z' : printf("N");break;
                    case 'O' : printf("W");break;
                    case 'W' : printf("O");break;
                    default : printf("?");
                }
            }
        }
    }
    printf("De Minotaurus werd niet gedood.\n");
}