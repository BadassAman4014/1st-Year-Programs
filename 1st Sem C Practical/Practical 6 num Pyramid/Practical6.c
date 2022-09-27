#include<stdio.h>
#include<conio.h>
main()
{
    int rows=4,i,j,k;
    for(i=1;i<=rows;i++)
    {
        for(j=i;j<rows;j++)
        {
            printf(" ");
        }
        for(k=1;k<(i*2);k++)
        {
            printf("%d",k);
        }
        printf("\n");
    }

}
