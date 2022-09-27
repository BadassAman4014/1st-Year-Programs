#include<stdio.h>
#include<conio.h>
void swap(int, int);
int main()
{
    int a, b;
    printf("Enter values for a and b\n");
    scanf("%d%d", &a, &b); //Scanning values of a and b
    printf("\n\nBefore swapping: a = %d and b = %d\n", a, b);
    swap(a, b); //Swapping
    return 0;
}
void swap(int x, int y)
{
    int temp;
    temp = x;
    x=y;
    y=temp;
    printf("\nAfter swapping: a = %d and b = %d\n", x, y);
}
