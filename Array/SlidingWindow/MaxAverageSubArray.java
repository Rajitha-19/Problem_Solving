/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result=Integer.MIN_VALUE;
        double wsum=0;
        for(int i=0;i<k;i++){
            wsum=wsum+nums[i];
        }
        result=Math.max(result,wsum/k);
        for(int end=k;end<nums.length;end++){
            wsum=wsum+nums[end]-nums[end-k];
            double avg=(wsum/k);
            result=Math.max(result,avg);
        }
        return result;
    }
}
