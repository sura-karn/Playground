#include <stdio.h>
int main()
{
  int size,k,j;
  scanf("%d",&size);
  int a[3][3];
  for(k=0;k<size;k++)
    for(j=0;j<size;j++)
      scanf("%d",&a[k][j]);
  int row,column=0;
  int sum,sum1,sum2;
  int flag=0;
  for(row=0;row<size;row++)
  {
    for(column=0;column<size;column++)
      scanf("%d",&a[row][column]);
  }
  sum=0;
  for(row=0;row<size;row++)
  {
    for(column=0;column<size;column++)
    {
      if(row==column)
        sum=sum+a[row][column];
    }
  }
  for(column=0;column<size;column++)
  {
    sum1=0;
    for(column=0;column<size;column++)
    {
      sum1=sum1+a[row][column];
    }
    if(sum==sum1)
      flag=1;
    else
    {
      flag=0;
      break;
    }
  }
  for(row=0;row<size;row++)
  {
    sum2=0;
    for(column=0;column<size;column++)
    {
      sum2=sum2+a[column][row];
    }
    if(sum==sum2)
      flag=1;
    else
    {
      flag=0;
      break;
    }
  }
  if(flag==1)
    printf("Yes");
  else
    printf("No");
  return 0;
}