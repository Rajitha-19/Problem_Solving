/*
Given a binary tree. Find the inorder traversal of the tree without using recursion.

Example 1

Input:
           1
         /    \
       2       3
      /   \
    4     5
Output: 4 2 5 1 3
Explanation:
Inorder traversal (Left->Root->Right) of 
the tree is 4 2 5 1 3.
*/

class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Node> stck=new Stack<Node>();
        Node curr=root;
        while(!stck.isEmpty() || curr!=null){
            if(curr!=null){
                stck.push(curr);
                curr=curr.left;
            }
            else if(!stck.isEmpty()){
                curr=stck.pop();
                list.add(curr.data);
                curr=curr.right;
            }
            
        }
        return list;
    }
    
}
