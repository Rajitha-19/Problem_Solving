/*
Given a Binary Tree, find the vertical traversal of it starting from the leftmost level to the rightmost level.
If there are multiple nodes passing through a vertical line, then they should be printed as they appear in level order traversal of the tree.

Example 1:

Input:
           1
         /   \
       2       3
     /   \   /   \
   4      5 6      7
              \      \
               8      9           
Output: 
4 2 1 5 6 3 8 7 9 
Explanation:

Example 2:

Input:
       1
    /    \
   2       3
 /    \      \
4      5      6
Output: 4 2 1 5 3 6
*/



class Pair{
    Node node;
    int position;
    Pair(Node node,int position){
        this.node=node;
        this.position=position;
    }
}
class Solution{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Map<Integer,ArrayList<Integer>> map=new TreeMap<Integer,ArrayList<Integer>>();
        Queue<Pair> queue=new LinkedList<Pair>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair curr=queue.poll();
            Node currNode=curr.node;
            int pos=curr.position;
            if(map.containsKey(pos)){
                map.get(pos).add(currNode.data);
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(currNode.data);
                map.put(pos,list);
            }
            if(currNode.left!=null){
                queue.add(new Pair(currNode.left,pos-1));
            }
            if(currNode.right!=null){
                queue.add(new Pair(currNode.right,pos+1));
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
            List<Integer> temp=(entry.getValue());
            //List<Integer> newTemp=Collections.sort(temp);
            for(Integer k:temp){
                res.add(k);
            }
        }
        return res;
    }
}
