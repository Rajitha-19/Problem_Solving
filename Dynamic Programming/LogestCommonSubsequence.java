/*
Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0
*/

//RECURSIVE SOLUTION
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.length()==0 || text2.length()==0){
            return 0;
        }
        if(text1.charAt(0)==text2.charAt(0)){
            return 1+longestCommonSubsequence(text1.substring(1),text2.substring(1));
        }
        else{
            return Math.max(longestCommonSubsequence(text1,text2.substring(1)),longestCommonSubsequence(text1.substring(1),text2));
        }
        
    }
}

//Memoisation 

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m+1][n+1];
        int ans=lcs(text1,text2,dp);
        return ans;
    }
    public int lcs(String s1,String s2,int[][] dp){
        int m=s1.length();
        int n=s2.length();
        if(m==0 || n==0){
            return 0;
        }
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        if(s1.charAt(0)==s2.charAt(0)){
            dp[m][n]=1+lcs(s1.substring(1),s2.substring(1),dp);
            return dp[m][n];
        }
        else{
            dp[m][n]=Math.max(lcs(s1,s2.substring(1),dp),lcs(s1.substring(1),s2,dp));
            return dp[m][n];
        }
        
    }
}
