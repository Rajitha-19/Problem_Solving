/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Ex:
Input: s = "()"
Output: true
  
*/
class Solution {
    public boolean isValid(String s) {
        return isParen(s);
    }
    public static boolean check(char a,char b){
        if(a=='(' && b==')'){
            return true;
        }
        else if(a=='{' && b=='}'){
            return true;
        }
        else if(a=='[' && b==']'){
            return true;
        }
        return false;
    }
    public static boolean isParen(String str){
        char[] arr=str.toCharArray();
        Stack stck=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='['){
                stck.push(arr[i]);
            }
            else if(arr[i]==')' || arr[i]=='}' || arr[i]==']'){
                if(stck.isEmpty() || (!check((Character)stck.pop(),arr[i]))){
                    return false;
                }
            }
        }
        if(stck.isEmpty()){
            return true;
        }
        return false;
    }
}
