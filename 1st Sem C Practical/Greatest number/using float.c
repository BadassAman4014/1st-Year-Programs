#include<stdio.h>
#include<conio.h>
main()
{
    float a,b,c;
    printf("Enter 3 values \n");
    scanf("%f%f%f",&a,&b,&c);
    printf("\nLargest number is ");
    if (a>b)
    {
        if(a>c)
            printf("%f",a);
        else
            printf("%f",c);
    }
    else
    {
        if(c>b)
            printf("%f",c);
        else
            printf("%f",b);
    }
}
