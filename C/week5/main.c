#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char naam[20];
    strcpy(naam,"Jos Boskabouter");
    strcpy(naam[7], "ntseds");
    printf("%s ",naam);


}