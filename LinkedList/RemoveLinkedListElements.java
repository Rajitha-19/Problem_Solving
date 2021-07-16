/*
Given the head of a linked list and an integer val,remove all the nodes of the linked list 
that has Node.val == val, and return the new head.

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

*/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode root=head;
        if(head==null){
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
}
