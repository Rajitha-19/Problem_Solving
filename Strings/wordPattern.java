/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Ex:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
 
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split("\\s");
        HashMap<Character,String> map = new HashMap<Character,String>();
        if(pattern.length()!=str.length){
            return false;
        }
        for(int i=0;i<str.length;i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(str[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(str[i])){
                    return false;
                }
                map.put(ch,str[i]);
            }
        }
        return true;
    }
}
