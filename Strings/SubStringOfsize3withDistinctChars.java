
/*
A string is good if there are no repeated characters.

Given a string s, return the number of good substrings of length three in s.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.

 Ex:

Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".
*/


class Solution {
    public static int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        int k=3;
        String str="";
        for(int i=0;i<k;i++){
            str=str+s.charAt(i);
        }
        int count=0;
        if(str.charAt(0)!=str.charAt(1) && str.charAt(0)!=str.charAt(2) && str.charAt(1)!=str.charAt(2)){
            count=count+1;
        }
        String st1=str;
        for(int end=k;end<s.length();end++){
            st1=st1+s.charAt(end);
            st1=st1.substring(1,st1.length());
            if(st1.charAt(0)!=st1.charAt(1) && st1.charAt(0)!=st1.charAt(2) && st1.charAt(1)!=st1.charAt(2)){
            count=count+1;
        }   
        }
        return count;
       
    }
}
