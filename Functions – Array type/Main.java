#include<stdio.h>
int main()
{
    //fill the code;
    int n;
  printf("Enter the number of elements in the array\n");
    scanf("%d",&n);
    int arr[n];
    int i;
    int odd = 0, even = 0;
  printf("Enter the elements in the array\n");
    for(i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i = 0; i < n; i++)
    {
        if(arr[i] % 2 == 1)
            odd++;
        if(arr[i] % 2 == 0)
            even++;
    }
    if(odd == n)
        printf("The array is Odd");
    else if(even == n)
        printf("The array is Even");
    else
        printf("The array is Mixed");
    return 0;
}