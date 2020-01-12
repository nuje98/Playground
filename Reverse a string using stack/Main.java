#include<bits/stdc++.h>
#include<string>
using namespace std;
class node 
{
	public:
		char data;
		node* link;
};
void push(node** top,char data)
{
	node* temp=new node();
	temp->data=data;
	temp->link=*top;
	*top=temp;
}
void print(node* top)
{
	node* temp = top;
	while(temp!=NULL)
	{
		cout<<temp->data;
		temp=temp->link;
	}
}

int main()
{
	node* top=NULL;
	string str;
	cin>>str;
  	int n=str.length();
  	char strr[n+1];
  	strcpy(strr,str.c_str());
  	for(int i=0;i<n;i++)
    {
      	push(&top,strr[i]);
    }
  	print(top);
	return 0;	
}
 