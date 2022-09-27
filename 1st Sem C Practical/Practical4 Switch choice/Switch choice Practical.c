#include<stdio.h>
#include<conio.h>
int main()
{
int n1, n2, n3, cho;
float amount,price,discount,num1,num2,result;
int i=1;
while (i==1)
{
printf("Enter '1' To display maximum number among inputted three number.\n") ;
printf("Enter '2' To display the final prize based on assumption\n") ;
printf("Enter '3' To Display percentage of 2nd number to 1st number\n");
printf("Enter '4' Exit.\n");
printf ("Enter your choice :   \n");
scanf("%d",&cho);
switch (cho)
{
    case 1 :
    printf("Enter three different numbers: ");
    scanf("%d%d%d", &n1, &n2, &n3);

    if (n1 >= n2 && n1 >= n3)

    {
        printf("%d is the largest number.", n1);
    }

    if (n2 >= n1 && n2 >= n3)

    {
        printf("%d is the largest number.", n2);
    }

if (n3 >= n1 && n3 >= n2)

    {
        printf("%d is the largest number.", n3);
    }

break;

    case 2:

            printf("Enter Price : ");
            scanf("%f",&price);

            if (price<2500)
            {
                discount=price*0.25;
                amount=price-discount;
            }
            else if (price>2500 && price<5000)
            {
                discount=price*0.3;
		        amount=price-discount;
            }
            else if (price>5000)
            {
                discount=price*0.4;
                amount=price-discount;
            }
            printf("Your net payable will be : %f",amount);

     break;

    case 3 :

    printf("Enter 2 numbers :");
    scanf("%f%f",&num1,&num2);
    result=num1/num2*100;
    printf("Percentage of following numbers is :%f\n",result);
    break;

    case 4 :
   {
       exit(0);
   }
     break;
    default :
    printf("Choice is wrong");
}
     printf("\nPress 1 to continue else any other number to exit\n");
     scanf("%d",&i);
    }
     return 0;


}

