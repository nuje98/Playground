#include<iostream>
using namespace std;

void swap(int & a, int & b)
{
    int temp = a;
    a = b;
    b = temp;
}

int main()
{
  int n;
  cin>>n;
  int a[n];
 
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
      int i, j;  
    for (i = 0; i < n-1; i++)      
    for (j = 0; j < n-i-1; j++)  
        if ((a[j]== 1) && (a[j+1]==0))  
            swap(a[j],a[j+1]);
 
  for(int i=0;i<n;i++)
  {
    cout<<a[i];
cout<<" ";
  }
  return 0;
}