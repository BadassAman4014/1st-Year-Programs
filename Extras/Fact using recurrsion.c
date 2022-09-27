#include<stdio.h>
#include<conio.h>
long int multiplication(int n);
int main()
{
    int n;
    printf("Enter a positive integer: ");
    scanf("%d",&n);
    printf("Factorial of %d = %ld", n, multiplication(n));
    return 0;
}
long int multiplication(int n)
{
    if (n>=1)
    return n*multiplication(n-1);
    else
    return 1;
}
