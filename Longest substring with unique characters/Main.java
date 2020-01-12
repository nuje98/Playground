#include <bits/stdc++.h> 
using namespace std; 
#define NO_OF_CHARS 256 

int longestUniqueSubsttr(string str) 
{ 
	int n = str.size(); 
	int cur_len = 1; // length of current substring 
	int max_len = 1; // result 
	int prev_index; // previous index 
	
	int* visited = new int[sizeof(int) * NO_OF_CHARS]; 


	for (int i = 0; i < NO_OF_CHARS; i++) 
		visited[i] = -1; 


	visited[str[0]] = 0; 

	
	for (int i = 1; i < n; i++) { 
		prev_index = visited[str[i]]; 

	
		if (prev_index == -1 || i - cur_len > prev_index) 
			cur_len++; 

	
		else { 
	
			if (cur_len > max_len) 
				max_len = cur_len; 

			cur_len = i - prev_index; 
		} 

	 
		visited[str[i]] = i; 
	} 

	
	if (cur_len > max_len) 
		max_len = cur_len; 

	free(visited); // free memory allocated for visited 
	return max_len; 
} 
int main() 
{ 
	string str;
  	getline(cin,str);
	
	
	int len = longestUniqueSubsttr(str); 
	
	cout << len; 
	return 0; 
} 

