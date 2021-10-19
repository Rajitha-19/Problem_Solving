/*
Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
Example 2:

Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:10 20 30 40 60 N N
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        Queue<Node> que=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(node==null){
            return null;
        }
        que.add(node);
        while(!que.isEmpty()){
            Node num=que.poll();
            if(num.left!=null){
                que.add(num.left);
            }
            if(num.right!=null){
                que.add(num.right);
            }
            list.add(num.data);
        }
        return list;
    }
}



