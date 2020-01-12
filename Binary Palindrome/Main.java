#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,n1=0;
	cin>>n;
	int temp=n;
	while(n>0)
	{
		n1=n1<<1;
		n1=n1|(n&1);
		n=n>>1;
	}
	if(temp==n1)
		cout<<"yes";
	else
		cout<<"no";
}