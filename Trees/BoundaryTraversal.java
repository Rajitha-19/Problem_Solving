/*

Problem Statement
You have been given a binary tree of integers. Your task is to print the boundary nodes of this binary tree in Anti-Clockwise direction starting from the root node.
NOTE:
The boundary nodes of a binary tree include nodes from the left boundary, right boundary and the leaf nodes without duplicate nodes. However, the values from the nodes may contain duplicates. 

Sample Input 1:
2
1 2 3 4 -1 5 -1 -1 -1 -1 -1
1 2 -1 3 -1 4 -1 -1 -1

Sample Output 1:
1 2 4 5 3 
1 2 3 4

Sample Input 2:
1
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
1 2 4 5 6 7 3  
*/


import java.util.*;
public class Solution {
	public static int getMaxWidth(TreeNode root) {
		// Write your code here.
        //ArrayList<Integer> list=new ArrayList<>();
        int maxSize=0;
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            int currSize=0;
            for(int i=0;i<n;i++){
                TreeNode curr=queue.poll();
                currSize++;
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            maxSize=Math.max(maxSize,currSize);
        }
        return maxSize;
	}
}
