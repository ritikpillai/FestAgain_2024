//Find n-th term of series 1, 3, 6, 10, 15, 21


//User function Template for Java

class Solution {
    static int findNthTerm(int N) {
        // code here
        // int num = 0;
        // num = 2N-1; /* a+(n-1)d , a=1, d=2*/
        return N*(N+1)/2;
    }
}
