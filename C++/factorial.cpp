#include <bits/stdc++.h> 
using namespace std; 

int fact(int n)
{
    if(n==0)
        return 1;
    else
    return n*fact(n-1);
}

int main()
{
    int num;
    cout<<"Enter a number: ";
    cin>>num;
    cout<<"Factorial of "<<num<<" is "<<fact(num);
    // cout<<fact(6);
    return 0;   
}

// Time Complexity: O(n)
// Space Complexity: O(n)

