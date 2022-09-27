#include<stdio.h>
#include<conio.h>
int main()
{
   int x, y, *p, *q, sum;
   printf("Enter two integers to add\n");
   scanf("%d%d", &x, &y);
  //Defining variables to pointers
   p = &x;
   q = &y;
  //Addition
   sum = *p + *q;
  //Printing result
   printf("Sum of the numbers = %d\n", sum);

   return 0;
}
