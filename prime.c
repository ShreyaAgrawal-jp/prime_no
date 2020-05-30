#include<stdio.h>
int Prime(int n, int i)
{
    if(i == 1)
        return 1;
    else
    {
        if(n%i == 0)
            return 0;
        else
            Prime(n, i-1);
    }
}
int main()
{
    int n,prime;
    printf("n: ");
    scanf("%d", &n);
    prime =Prime(n,n/2);
    if(prime==1)
    {
        printf("it is a prime number");
    }
    else
    {
        printf("it is a Composite number");
    }
    return 0;
}
