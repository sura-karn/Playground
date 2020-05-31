#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str1[50];
    
    gets(str1);
   cout<<"The number of letters in the name is "<<strlen(str1);
    return 0;
}