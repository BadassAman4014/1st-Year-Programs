#include<stdio.h>
#include<conio.h>
int main()
{
int num;
printf("Enter any number");
scanf("%d", &num);
printf("\nValue of num = %d", num);
printf("\nAddress of num = %u", &num);
getch();
return 0;
}
