#include <stdio.h>

void sayHello(int n);

int main() {
    sayHello(3);
    return 0;
}

void sayHello(int n) {
    if (n==0) return;
    sayHello(n-1);
    printf("Hello %d\n",n);
    sayHello(n-1);
}