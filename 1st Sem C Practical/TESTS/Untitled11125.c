#include <stdio.h>
#include <conio.h>
void main()
{
    int num, i, sum = 0; // declare local variables
    printf(" Enter number: ");
    scanf("%d", &num); // take any positive number
    // executes until the condition remains true.
    for (i = 0; i <= num; i++)
    {
        sum = sum + i; // at each iteration the value of i is added to the sum variable
    }
    // display the sum of natural number
    printf("\n sum of the first %d number is: %d", num, sum);
    return (0);
}
