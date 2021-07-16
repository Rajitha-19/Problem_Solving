//check whether the linkedlist is palindrome or not

class Solution {
    public boolean checkPalindrome(int n1,int n2){
        if(n1==n2){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stck=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stck.push(temp.val);
            temp=temp.next;
        }
        while(head!=null){
            int n1=head.val;
            int n2=stck.pop();
            if(!checkPalindrome(n1,n2)){
                return false;
            }
            head=head.next;
        }
        return true;
        
    }
}
