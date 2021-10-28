/*
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

class Solution {
    public int lengthOfLongestSubstring(String st) {
        char[] s=st.toCharArray();
        //hashmap for keep tracking of caharacters count
        HashMap<Character,Integer> window=new HashMap<>();
        //slow pointer
        int left=0;
        //fast pointer
        int right=0;
        int maxLen=0;
        while(right<st.length()){
            char c=s[right];
            //incrementing the frequency of the characters 
            window.put(c,window.getOrDefault(c,0)+1);
            right++;
            while(window.get(c)>1){
                char c2=s[left];
                window.put(c2,window.get(c2)-1);
                left++;
            }
            maxLen=Math.max(maxLen,right-left);
        }
        return maxLen;
    }
}
