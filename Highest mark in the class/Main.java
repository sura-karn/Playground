#include<iostream>
using namespace std;
int main()
{
  int stu,mark[10],i,max=0;
  cin>>stu;
  for(i=0;i<stu;i++)
    cin>>mark[i];
 for(i=0;i<stu;i++)
 {
   if(mark[i]>max)
     max=mark[i];
 }
  cout<<max;
}