#include<stdio.h>
#include<conio.h>
int add(int s, int no );
int main()
{
    int no,sum,s=0;
    printf("Enter the number:");
    scanf("%d",&no);
    sum=add(s,no);
    printf("sum of first %d numbers = %d",no,sum);
    return 0;

}
int add(int s , int no)
{
    int ans;
    if (s==no)
    {
        return s;
    }
    else
    {
        return s + add(s+1,no);
    }

}
