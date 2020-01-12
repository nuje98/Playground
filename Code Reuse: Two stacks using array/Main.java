#include <stdio.h>

#define SIZE 1000
// Returns 1 if success
//         0 if failure
int push_to_stack1(int a[], int n, int *top1, int *top2, int temp)
{
    if(*top1>=*top2)
		printf("Stack is full");
	else
	{
	    //printf("%d",*top1);
		a[*top1]=temp;
		*top1=*top1+1;
		return 1;
	}
    return 0;
}

// Returns 1 if success
//         0 if failure
int push_to_stack2(int a[], int n, int *top1, int *top2, int temp)
{
    if(*top2<=*top1)
		printf("Stack is full");
	else
	{
		a[*top2]=temp;
		*top2=*top2-1;
		return 1;
	}
    return 0;
}

// Returns 1 if success
//         0 if failure
int pop_from_stack1(int a[], int n, int *top1, int *top2)
{
        if(*top1<=0)
        {
            printf("Stack underflow. ");
            return 0;
        }
        else
            {
                a[*top1]=0;
                *top1=*top1-1;
                return 1;
            }
}

// Returns 1 if success
//         0 if failure
int pop_from_stack2(int a[], int n, int *top1, int *top2)
{
     if(*top1>n)
        {
            printf("Stack underflow. ");
            return 0;
        }
        else
            {
                a[*top2]=0;
                *top2=*top2+1;
                return 1;
            }
}

void display_stack1(int a[], int n, int *top1, int *top2)
{
    int i;
    for(i=*top1-1; i>=0; i--)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
}

void display_stack2(int a[], int n, int *top1, int *top2)
{
    int i;
	for(i=*top2+1; i<n; i++)
 	{
        printf("%d ", a[i]);
    }
    printf("\n");
}

int main() {
	int arr[SIZE], n = SIZE, i;
	
	// stack 1
	int top1 = 0;
	
	// stack 2
	int top2 = n-1;
	
	// User inputs for each stack
	int stack1_push_count, stack1_pop_count;
	int stack2_push_count, stack2_pop_count;
	
	scanf("%d", &stack1_push_count);
	for(i=0; i<stack1_push_count; i++)
	{
	    int temp;
	    scanf("%d", &temp);
	    if(0 == push_to_stack1(arr, n, &top1, &top2, temp))
	    {
	        printf("Push to stack 1 failed\n");
	    }
	}
	
	scanf("%d", &stack2_push_count);
	for(i=0; i<stack2_push_count; i++)
	{
	    int temp;
	    scanf("%d", &temp);
	    if(0 == push_to_stack2(arr, n, &top1, &top2, temp))
	    {
	        printf("Push to stack 2 failed\n");
	    }
	}
    printf("Stack 1 Elements:\n");
	display_stack1(arr, n, &top1, &top2);
	
	printf("Stack 2 Elements:\n");
	display_stack2(arr, n, &top1, &top2);
	
	scanf("%d", &stack1_pop_count);
	for(i=0; i<stack1_pop_count; i++)
	{
	    if(0 == pop_from_stack1(arr, n, &top1, &top2))
	    {
	        printf("pop from stack 1 failed\n");
	    }
	}
	
	scanf("%d", &stack2_pop_count);
	for(i=0; i<stack2_pop_count; i++)
	{
	    if(0 == pop_from_stack2(arr, n, &top1, &top2))
	    {
	        printf("Pop from stack 2 failed\n");
	    }
	}
	
	printf("Stack 1 Elements:\n");
	display_stack1(arr, n, &top1, &top2);
	
	printf("Stack 2 Elements:\n");
	display_stack2(arr, n, &top1, &top2);
	
	return 0;
}