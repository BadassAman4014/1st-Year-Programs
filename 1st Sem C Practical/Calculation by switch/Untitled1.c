#include<stdio.h>
int main()
{
  int x,y;
  char a,b,c,d;
  printf("Enter two numbers : ");

  scanf("%%d%d",&x,&y);

  printf("\nEnter a to add");
  printf("\nEnter b to subract");
  printf("\nEnter c to multiply");
  printf("\nEnter d to divide");

  scanf("%c",c);

  switch (op) {
    case '+':
      printf("%.1lf + %.1lf = %.1lf", first, second, first + second);
      break;
    case '-':
      printf("%.1lf - %.1lf = %.1lf", first, second, first - second);
      break;
    case '*':
      printf("%.1lf * %.1lf = %.1lf", first, second, first * second);
      break;
    case '/':
      printf("%.1lf / %.1lf = %.1lf", first, second, first / second);
      break;
    // operator doesn't match any case constant
    default:
      printf("Error! operator is not correct");
  }

  return 0;
}
