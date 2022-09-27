#include <stdio.h>

void main()
{  int num;

    int i,  knum, found = 0;

    printf("Enter number of elements ");
    scanf("%d", &num);
    int array[num];
    printf("Enter elements of array\n");
    for (i = 0; i < num; i++)
    {
        scanf("%d", &array[i]);
    }

    printf("Enter the element to be searched ");
    scanf("%d", &knum);
    /*  Linear search begins */
    for (i = 0; i < num ; i++)
    {
        if (knum == array[i] )
        {
            found = 1;
            break;
        }
    }
    if (found == 1)
        printf("Element is present in the array at position %d",i+1);
    else
        printf("Element is not present\n");
}
