#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,res,cho;
    do
    {
        printf("Enter 2 numbers to add:");
        scanf("%d%d",&a,&b);
        res=a+b;
        printf("result is : %d",res);
        printf("\npress 1 to repeat the prog or other no to exit");
        scanf("\n%d",&cho);

    }
    while(cho==1);
}
