
/*
  Given a linked list, swap every two adjacent nodes and return its head. 
  You must solve the problem without modifying the values in the list's
  nodes (i.e., only nodes themselves may be changed.)
  
  Ex:
  Input: head = [1,2,3,4]
  Output: [2,1,4,3]
  */

 //Iterative Approach

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            int num1=temp.val;
            int num2=temp.next.val;
            temp.val=num2;
            temp.next.val=num1;
            temp=temp.next.next;   
        }
        return head;
    }
}
