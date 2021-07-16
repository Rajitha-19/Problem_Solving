
//Merge Two Sorted LinkedLists

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode newnode=null;
        if(l1.val<l2.val){
            newnode=l1;
            l1=l1.next;
        }
        else{
            newnode=l2;
            l2=l2.next;
        }
        ListNode current=newnode;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                current.next=l1;
                l1=l1.next;
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1==null){
            current.next=l2;
        }
        else{
            current.next=l1;
        }
        return newnode;
        
    }
}
