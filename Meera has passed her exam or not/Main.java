#include<iostream>
using namespace std;
int main()
{
  int n,mark[50],i,m,f;
    cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>mark[i];
  }
  cin>>f;
  for(i=0;i<n;i++)
  {
    if(mark[i]==f)
    {
      cout<<"She passed her exam";
      return 0;
    }
  }
    if(mark[i]!=f)
    {
      cout<<"She failed";
      
    }
  }