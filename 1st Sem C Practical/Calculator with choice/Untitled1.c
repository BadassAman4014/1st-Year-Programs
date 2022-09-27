#include<stdio.h>
#include<conio.h>

int main(){

int a, b , c ;
char cho ;


printf("Enter '1' To display maximum number among inputted three number.\n") ;
printf("Enter '2' To display the final prize based on assumption\n") ;
printf("Enter '3' To Display percentage of 2nd number to 1st number\n");
printf("Enter '4' Exit.\n");

    printf ("enter your choice :   \n");
    scanf("%s" , &cho);



  printf("Enter two numbers :   \n");
    scanf("%d %d", &a , &b);


    switch (cho){

 case 1 :
    c = a+b ;
printf("addition of those numbers is : %d", c) ;

break;
    case 2:
    c = a-b ;
printf("substraction of those numbers is : %d", c) ;
break;

    case 3 :
    c = a/b ;
printf("division of those numbers is : %d", c) ;
break;

    case 4 :
    c = a*b ;
printf("multiplication of those numbers is : %d", c) ;
break;


default :
   printf("entered choice is wrong");

    }


    return 0;
}
