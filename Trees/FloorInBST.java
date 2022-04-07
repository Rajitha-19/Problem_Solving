/*
Floor in BST

Problem Statement
You are given a BST (Binary search tree) with’ N’ number of nodes and a value ‘X’. Your task is to find the greatest value node of the BST which is smaller than or equal to ‘X’.
Note :‘X’ is not smaller than the smallest node of BST .
For example:
Sample Input 1:
2
10 5 15 2 6 -1 -1 -1 -1 -1 -1
7
2 1 3 -1 -1 -1 -1
2
Sample Output 1:
6
2
*/


public class Solution {

    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
        int floor=-1;
        while(root!=null){
            if(root.data==X){
                floor=root.data;
                return floor;
            }
            if(root.data<X){
                floor=root.data;
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return floor;
    }
}
