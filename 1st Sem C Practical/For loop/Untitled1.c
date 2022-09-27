#include<stdio.h>
#include<conio.h>
main()
{
   int i, num;
   printf("Enter number : ");
   scanf("%d",&num);
   for(i=1; i<11; i++)
    {
      printf("%d*%d=%d\n",num,i,(num*i));
    }
}
