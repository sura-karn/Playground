#include<iostream>
using namespace std;
int main()
{
  int z,x=1,y=0;
  cin>>z;
  int a[z];
  for(int i=0;i<z;i++)
    cin>>a[i];
  cout<<x;
  for(int i=1;i<z;i++)
  {
    if(a[i]<a[i-1])
      cout<<"\n"<<x;
    else
    {
      y+=2;
      cout<<"\n"<<y;
    }
  }
}