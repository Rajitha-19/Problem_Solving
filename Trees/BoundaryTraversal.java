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


import java.util.ArrayList;
import java.util.*;

public class Solution {
    public static boolean isLeafNode(TreeNode root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
    public static void addLeftBoundary(TreeNode root,ArrayList<Integer> res){
        TreeNode curr=root.left;
        while(curr!=null){
            if(!isLeafNode(curr)){
                res.add(curr.data);
            }
            if(curr.left!=null){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
    }
    public static void addRightBoundary(TreeNode root,ArrayList<Integer> res){
        TreeNode curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while(curr!=null){
            if(!isLeafNode(curr)){
                temp.add(curr.data);
            }
            if(curr.right!=null){
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }
    public static void addLeaves(TreeNode root,ArrayList<Integer> res){
        if(isLeafNode(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null){
            addLeaves(root.left,res);
        }
        if(root.right!=null){
            addLeaves(root.right,res);
        }
    }
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		// Write your code here
        ArrayList<Integer> res=new ArrayList<>();
        if(!isLeafNode(root)){
            res.add(root.data);
        }
        addLeftBoundary(root,res);
        addLeaves(root,res);
        addRightBoundary(root,res);
        return res;
 
	}
}
