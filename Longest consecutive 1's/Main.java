#include<bits/stdc++.h>
using namespace std;
int ones(int x)
{
	int count=0;
	while(x!=0)
	{
		x = (x & (x << 1));
		count++;
	}
	return count;
}
int main()
{
	int n;
	cin>>n;
	cout<<ones(n);
}