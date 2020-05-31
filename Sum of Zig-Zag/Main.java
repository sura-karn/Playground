
// Using pointers
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int **a,i,j,r,c;
    scanf("%d",&r);
    scanf("%d",&c);

    a=(int**)malloc(r*sizeof(int*));
    for(i=0;i<r;i++)
        *(a+i)=(int*)malloc(c*sizeof(int));

    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",*(a+i)+j);
        }
    }

    i=0;int sum1=0;
    for(j=0;j<c-1;j++)
        sum1=sum1+*(*(a+i)+j);

    i=r-1;int sum3=0;
    for(j=1;j<c;j++)
        sum3=sum3+*(*(a+i)+j);

    i=0;j=c-1;int sum2=0;
    while(i<r&&j>=0)
    {
        sum2=sum2+*(*(a+i)+j);
        i++;
        j--;
    }
    printf("Sum of Zig-Zag pattern is %d",sum1+sum2+sum3);
    return 0;
}