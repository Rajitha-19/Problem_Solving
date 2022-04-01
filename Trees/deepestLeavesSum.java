/*
Given the root of a binary tree, return the sum of values of its deepest leaves.
 

Example 1:


Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15
Example 2:

Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
Output: 19
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
1 <= Node.val <= 100
  
*/

//Approach-1 BFS

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int leavesSum=0;
        while(!queue.isEmpty()){
            int n=queue.size();
            int currLeavesSum=0;
            for(int i=0;i<n;i++){
                TreeNode curr=queue.poll();
                currLeavesSum+=curr.val;
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            leavesSum=currLeavesSum;
        }
        return leavesSum;
    }
}

//Appproach-2 

class Solution {
    int sum=0;
    int max_depth=Integer.MIN_VALUE;
    public void getMaxDepth(TreeNode root,int level){
        if(root==null){
            return;
        }
        max_depth=Math.max(max_depth,level);
        getMaxDepth(root.left,level+1);
        getMaxDepth(root.right,level+1);
        
    }
    public void getMaxSum(TreeNode root,int currLevel){
        if(root==null){
            return;
        }
        if(currLevel==max_depth){
            sum=sum+root.val;
        }
        getMaxSum(root.left,currLevel+1);
        getMaxSum(root.right,currLevel+1);
    }
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        getMaxDepth(root,0);
        getMaxSum(root,0);
        return sum;
    }
}
