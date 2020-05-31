#include<iostream>
using namespace std;
int main()
{
  int a[10][10],i,j,b[10][10],d[10][10],r,c;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      cin>>a[i][j];
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      cin>>b[i][j];
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
  d[i][j]=a[i][j]+b[i][j];
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      cout<<d[i][j]<<" ";
     cout<<"\n";
   }
}