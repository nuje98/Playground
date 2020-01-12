#include<iostream>
#include<cstring>
#include<cstdlib>
using namespace std;
class Node
{
    public:
    	int data;
    	Node *next;
}*head;

void insert(int data)
{
	Node *temp, *newnode;
    temp = head;
    newnode= new Node;
    newnode->data = data;
    newnode->next = NULL;
    if(head == NULL)
        head=newnode;
    else
    {
        head=newnode;
        newnode->next=temp;
    }
}
int pop()
{
	if(head == NULL)
        cout<<"Stack underflow";
    else
    {
        Node *temp = head;
        head = temp->next;
        temp->next = NULL;
        return(temp-> data);
        free(temp);
    }
  	return 0;
}

int main()
{
    char s[30];
    int a, b;
    cin>>s;
    for(int i=0; i<strlen(s); i++)
    {
        if(s[i]>=48 && s[i]<=57) //ASCII values of numbers
        	insert(s[i]-'0');
        else if(s[i]>=42 && s[i]<=47) //ASCII values of special characters
        {
            a=pop();
            b=pop();
            switch(s[i])
            {
                case '+':
                insert(a+b);
                break;
               
                case '-':
                insert(a-b);
                break;
               
                case '*':
                insert(a*b);
                break;
               
                case '/':
                insert(a/b);
                break;
               
                default:
                break;
               
            }
        }
    }
    cout <<"Answer is "<<pop();      
}