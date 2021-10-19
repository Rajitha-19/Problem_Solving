/*Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.

Example 1:

Input :
        1
      /   \
     3     2

Output: 3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
Example 2:

Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10
*/
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        Queue<Node> que=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stck=new Stack<>();
        if(node==null){
            return res;
        }
        que.add(node);
        while(!que.isEmpty()){
            Node temp=que.poll();
            //stck.push(temp.data);
            if(temp.right!=null){
                que.add(temp.right);
            }
            if(temp.left!=null){
                que.add(temp.left);
            }
            stck.push(temp.data);
        }
        while(!stck.isEmpty()){
            res.add(stck.pop());
        }
        return res;
        
    }
}      
