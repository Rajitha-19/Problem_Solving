
/*The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
xample 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Ouput:3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
*/

//RECURSIVE SOLUTION

class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}

//Memoizaton -Recursion

class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fibNum(n,dp);
    }
    public int fibNum(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibNum(n-1,dp)+fibNum(n-2,dp);
    }   
}

//TABULATION

class Solution {
    public int fib(int n) {
        int[] dp=new int[n+2];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
}


//SPACE OPTIMISATION - No need to maintain array for storing values

class Solution {
    public int fib(int n) {
        int prev2=0;
        int prev1=1;
        if(n==0){
            return 0;
        }
        for(int i=2;i<=n;i++){
            int curr=prev2+prev1;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
        
    }
}




