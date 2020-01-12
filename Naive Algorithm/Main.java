#include<bits/stdc++.h>
using namespace std;
void naivematch(char* txt, char* pat)
{
	int tlen=strlen(txt);
	int plen=strlen(pat);
	int i,j;
	for(i=0; i<=(tlen-plen);i++)
	{
		for(j=0;j<plen;j++)
		{
			if(txt[i+j]!=pat[j])
				break;
		}
		if (j == plen) 
        	cout << "Pattern found at index "<< i << endl; 
	}
}
int main()
{
	char text[100];
	char pattern[100];
	cin.getline(text,100);
	cin.getline(pattern,100);
	naivematch(text,pattern);
}