/*Given two strings A and B, find the minimum number of times A has to be repeated such that B becomes 
a substring of the repeated A. If B cannot be a substring of A no matter how many times it is repeated, return -1.

Example 1:

Input: A = "abcd", B = "cdabcdab"
Output: 3
Explanation: After repeating A three times, 
we get "abcdabcdabcd".
*/


class Solution 
{ 
	static int repeatedStringMatch(String A, String B) 
	{ 
        // Your code goes here
        if(A.contains(B)){
            return 1;
        }
        String st=A;
        int count=1;
        while(st.length()<B.length()){
            st=st+A;
            count++;
        }
        if(st.contains(B)){
            return count;
        }
        st=st+A;
        count++;
        if(st.contains(B)){
            return count;
        }
        return -1;
	} 
} 
