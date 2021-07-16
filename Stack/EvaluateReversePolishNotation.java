/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

Note that division between two integers should truncate toward zero.

It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
Ex:
Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                stck.push(stck.pop()+stck.pop());
            }
            else if(tokens[i].equals("-")){

                stck.push(-stck.pop()+stck.pop());
            }
            else if(tokens[i].equals("*")){
                
                stck.push(stck.pop()*stck.pop());
            }
            else if(tokens[i].equals("/")){
                int num2=stck.pop();
                stck.push(stck.pop()/num2);
            }
            else{
                stck.push(Integer.parseInt(tokens[i]));
            }
        }
        int res=stck.pop();
        return res;
    }
}
