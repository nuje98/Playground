#include<bits/stdc++.h>
using namespace std;
/*void zfunc(string finalstr, int p)
{
	int i=0,j=0,count=0;
	int len=finalstr.length();
	int z[len];
	for(i=0;i<len-1;i++)
	{
		for(j=0;j<len-1;j++)
		{
			if(finalstr[i]==finalstr[j+1])
			{
				count++;
				i++;
			}
			else
				continue;
		}
	}
	while()
	{
		if(finalstr[i]==finalstr[j+1])
		{
			count++;
			i++;
			j++
		}
		else
		{
			j++;
		}
	}
	
	search(z, p);
	
}*/
int main()
{
	string txt;
	string pat;
	//cin>>txt;
	//cin>>pat;
	getline(cin,txt);
	getline(cin,pat);
	int p=pat.length();
	string s=(pat+"$"+txt);
	int n = s.length();
    // z function
	vector<int> z(n);
    for (int i = 1; i < n; ++i)
        while (i + z[i] < n && s[z[i]] == s[i + z[i]])
            ++z[i];
    // searching
	int len=z.size();
	int flag=0;
	for(int i=0;i<len;i++)
	{
		if(z[i]==p)
			cout<<"Found pattern at index "<<(i-p-1);
			
	}
		
	return 0;
}