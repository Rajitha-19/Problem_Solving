/*
Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

 Ex:
 Input: numbers = [2,7,11,15], target = 9
  Output: [1,2]
  Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int n=numbers.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                arr[0]=start+1;
                arr[1]=end+1;
                break;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return arr;
    }
}
