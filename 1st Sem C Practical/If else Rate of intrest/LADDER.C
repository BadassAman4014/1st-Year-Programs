#include<stdio.h>
#include<conio.h>
main()
{
    int amt, duration,roi,intrest;
    printf("Enter the amount :");
    scanf("%d",&amt);
    printf("Enter the duration :");
    scanf("%d",&duration);

    if (duration = 1)
    {
        roi =3;
    }
    else if (duration==2)
    {
        roi = 4;
    }
    else
    {
        roi = 5;
    }
        intrest=amt*duration*roi;
    printf("Intrest is %d",intrest);
}
