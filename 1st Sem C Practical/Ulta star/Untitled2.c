#include<stdio.h>
#include<conio.h>
int main()
{
    int a=5,b=5,j,k;
   for(int i=1;i<=a;i++)
   {
       for(j=1;j<i;j++)
       {
           printf(" ");
       }
       for(k=1;k<=b;k++)
       {
           printf("*");
       }
       b--;
      printf("\n");
    }
}
