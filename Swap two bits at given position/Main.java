#include<iostream>
using namespace std;
void decToBinary(int n) 
{ 
    int binaryNum[32]; 
    int i = 0;  
    while (n > 0) 
	{ 
        binaryNum[i] = n % 2; 
        n = n / 2; 
        i++; 
    }
    for (int j = 0; j<(8-i); j++)
    	cout<<0;
    for (int j = i - 1; j >= 0; j--) 
        cout << binaryNum[j]; 
}
int main()
{
	int n,n1;
	cin>>n;
	int temp=n;
	int x,y;
	cin>>x>>y;
	if (((n & (1 << x)) >> x) ^ ((n & (1 << y)) >> y))
	{
		n ^= (1 << x);
		n ^= (1 << y);
	}	
    cout<<n<<"\n";
    decToBinary(temp);
} 
