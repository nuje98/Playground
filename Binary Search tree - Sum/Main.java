#include<bits/stdc++.h>
using namespace std;

class node
{
	public:
		node *left,*right;
		int data;
}*root;

node *insert(node* root,int data)
{
	if(root==NULL)
	{
		node* new_node= new node();
		new_node->data=data;
		new_node->left=NULL;
		new_node->right=NULL;
		return new_node; 
	}	
	if(data<root->data)
		root->left = insert(root->left, data);
	else if(data>root->data)
		root->right = insert(root->right, data);
	return root;
}

void print(node *root)
{
	
	if(root!=NULL)
	{
		print(root->left);
		cout<<root->data<<" ";
		print(root->right);
	}
}

int add(node *root)
{
	if(root==NULL)
		return 0;
	return (root->data+add(root->left)+add(root->right));
}
int main()
{
	int n;
	cin>>n;
  	if(n>0)
		root=insert(root,n);
	while(1)
	{
		cin>>n;
		if(n>0)
		{
			insert(root,n);
		}
		else
		{
			cout<<"Sum of all nodes are "<<add(root);
			break;
		}
	}
}