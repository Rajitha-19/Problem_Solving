/*
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
Ex:
Input:
5
4 2 -3 1 6

Output: 
Yes
*/


class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(set.contains(sum) || sum==0 || arr[i]==0){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
