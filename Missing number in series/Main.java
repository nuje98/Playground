#include<iostream>
using namespace std;

int main()
{
	int n,m,i;
	cin>>n;
	int a[n];
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(i=0;i<n-1;i++)
	{
		if((a[i]+2)!=a[i+1])
		{
			m=a[i]+2;
			break;
		}
	}
	cout<<m;
	return 0;
}