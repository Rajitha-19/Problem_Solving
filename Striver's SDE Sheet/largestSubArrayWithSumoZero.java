/*
Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
Your Task:
You just have to complete the function maxLen() which takes two arguments an array A and n, where n is the size of the array A and returns the length of the largest subarray with 0 sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
*/


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlen=0;
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum=currsum+arr[i];
            if(currsum==0){
                maxlen=i+1;
            }
            if(map.containsKey(currsum)){
                int length=i-map.get(currsum);
                maxlen=Math.max(length,maxlen);
            }
            else{
                map.put(currsum,i);
            }
        }
        return maxlen;
    }
}
