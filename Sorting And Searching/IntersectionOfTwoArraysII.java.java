/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and 
you may return the result in any order.

Ex:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] arr=new int[list.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=list.get(k);
        }
        return arr;
    }
}
