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
 	int count=0;
  	for(int i=0;i<n;i++)
  	{
    	cin>>a[i];
    	if(a[i]==1)
    		count++;
  	}
  	cout<<"Count of 1's in given array is "<<count;
  	return 0;
}