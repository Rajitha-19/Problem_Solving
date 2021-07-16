/*
Ex:
Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

*/




class Solution {
    public String removeOuterParentheses(String S) {
        ArrayList<String> list=new ArrayList<>();
        String res="";
        int count=0;
        int p=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                list.add(S.substring(p,i+1));
                p=i+1;
            }
        }
        for(String s:list){
            String m=s;
            String q="";
            q=q+m.substring(1,m.length()-1);
            res=res+q;
        }
        return res.trim();
    }
}
