/*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).


Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
*/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        que.add(root);
        boolean flag=false;
        while(!que.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int n=que.size();
            for(int i=0;i<n;i++){
                TreeNode temp=que.poll();
                if(flag){
                    list.add(0,temp.val);
                }
                else{
                    list.add(temp.val);
                }
                if(temp.left!=null){
                    que.add(temp.left);
                }
                if(temp.right!=null){
                    que.add(temp.right);
                }
            }
            res.add(list);
            flag=!flag;
        }
        return res;
    }
}
