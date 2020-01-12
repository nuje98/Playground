#include<bits/stdc++.h>
using namespace std;
int bits=16;
int rotateLeft(int N, int D)
{
    int c = (N << D) | (N >> (bits - D));
    return c;
}
int rotateRight(int N, int D) 
{
    int c = (N >> D) | (N << (bits - D));
    return c;
}
int main()
{
	int N,D;
	cin>>N;
	cin>>D;
	cout<<rotateLeft(N,D)<<endl;
	cout<<rotateRight(N,D);
}