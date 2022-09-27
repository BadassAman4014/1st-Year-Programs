#include <stdio.h>
int main()
{
	int num,sum=0;
	printf("Enter your number: ");
	scanf("%d",&num);
	for(int i=num;i>0;--i)
	   sum=sum+i;
	printf("Sum is: %d",sum);
}
