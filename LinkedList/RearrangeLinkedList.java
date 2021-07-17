/*
Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are together and all even positions node are together.
Assume the first element to be at position 1 followed by second element at position 2 and so on.

Input:
LinkedList: 1->2->3->4
Output: 1 3 2 4 
Explanation: 
Odd elements are 1, 3 and even elements are 
2, 4. Hence, resultant linked list is 
1->3->2->4

*/
class Solution
{
    void rearrangeEvenOdd(Node head)
    {
        Node oddhead=head;
        Node evenhead=head.next;
        Node curreven=head.next;
        while(evenhead!=null && evenhead.next!=null){
            oddhead.next=oddhead.next.next;
            oddhead=oddhead.next;
            evenhead.next=evenhead.next.next;
            evenhead=evenhead.next;
        }
        oddhead.next=curreven;
        
    }
}
