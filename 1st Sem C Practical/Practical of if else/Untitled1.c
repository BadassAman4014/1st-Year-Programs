#include<stdio.h>
#include<conio.h>
int main()
{
    int x;
    float y;
    printf("Enter value of x :");
    scanf("%d",&x);

    if(x<=2)
    {
        y = 2.4*x + 3;
    }
    else
    {
        y = 3*x + 5;
    }
    printf("The value of y is :%f",y);
}
