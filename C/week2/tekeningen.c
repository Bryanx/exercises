#include <stdio.h>

void opdracht1();
void opdracht2();
void opdracht3();
void opdracht4();
void opdracht5();

int main() {
    opdracht1();
    opdracht2();
    opdracht3();
    return 0;
}

void opdracht1() {
    printf("Opdracht1:\n");
    int a = 100;
    int* p = &a;

    printf("a = %d\n", a);
    printf("*p = %d\n\n", *p);

    printf("p = %p\n", p);
    printf("&a = %p\n", &a);
    printf("&p = %p\n\n", &p);
}

//2
void opdracht2() {
    printf("Opdracht2:\n");
    int a = 100;
    int b = 200;
    int c = 300;
    int* r = &a;
    int* q = &b;
    int* p = &c;

    printf("a = %d  *r = %d\n", a, *r);
    printf("b = %d  *q = %d\n", b, *q);
    printf("c = %d  *p = %d\n\n", c, *p);

    printf("p = %p\n",p);
    printf("q = %p\n",q);
    printf("r = %p\n\n",r);

    printf("&a = %p\n",&a);
    printf("&b = %p\n",&b);
    printf("&c = %p\n",&c);
    printf("&p = %p\n",&p);
    printf("&q = %p\n",&q);
    printf("&r = %p\n",&r);
}

void opdracht3() {
    double a = 3.14;
}

