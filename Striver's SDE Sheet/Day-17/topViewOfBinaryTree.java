/*
Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7
Note: Return nodes from leftmost node to rightmost node.

Example 1:

Input:
      1
   /    \
  2      3
Output: 2 1 3
Example 2:

Input:
       10
    /      \
  20        30
 /   \    /    \
40   60  90    100
Output: 40 20 10 30 100
*/



class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static class Pair{
        Node rootNode;
        int data;
        Pair(Node root,int val){
            rootNode=root;
            data=val;
        }
    }
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair temp=q.poll();
            int val1=temp.data;
            Node node=temp.rootNode;
            if(map.get(val1)==null){
                map.put(val1,node.data);
            }
            if(node.left!=null){
                q.add(new Pair(node.left,val1-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,val1+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
