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

void inorder(node *root)
{
	
	if(root!=NULL)
	{
		inorder(root->left);
		cout<<root->data<<" ";
		inorder(root->right);
	}
}
void preorder(node *root)
{
	
	if(root!=NULL)
	{
		cout<<root->data<<" ";
		preorder(root->left);
		preorder(root->right);
	}
}
void postorder(node *root)
{
	
	if(root!=NULL)
	{
		postorder(root->left);
		postorder(root->right);
		cout<<root->data<<" ";
	}
}

int main()
{
	int n,num,i=0;
	cin>>n;
	cin>>num;
	if(n>0)
		root=insert(root,num);
	while(i<n-1)
	{
		cin>>num;
		insert(root,num);
		i++;
	}
	cout<<"In-Order Traversal: ";
	inorder(root);
	cout<<endl;
	cout<<"Pre-Order Traversal: ";
	preorder(root);
	cout<<endl;
	cout<<"Post-Order Traversal: ";
	postorder(root);
	cout<<endl;
}