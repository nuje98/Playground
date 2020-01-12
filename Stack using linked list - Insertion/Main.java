#include<bits/stdc++.h>
using namespace std;
class node 
{
	public:
		int data;
		node* link;
};
void push(node** top,int data)
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
		cout<<temp->data<<" ";
		temp=temp->link;
	}
}

int main()
{
	node* top=NULL;
	int n;
	while(1)
	{
		cin>>n;
		if(n>0)
		{
			push(&top,n);
		}
		else
		{
			print(top);
			break;
		}
	} 
	return 0;	
}
 