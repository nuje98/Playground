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

int depth(node *root)
{
	if(root==NULL)
		return 0;
	return ( (depth(root->left)>depth(root->right)) ? depth(root->left)+1 : depth(root->right)+1 );
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
			cout<<"Height of the tree is "<<depth(root);
			break;
		}
	}
}