/*
Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count
*/


class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergeSort(arr,0,(int)N-1);
    }
    static long mergeSort(long[] arr,int left,int right){
        if(left>=right){
            return 0;
        }
        long inversionCount=0;
        int mid=left+(right-left)/2;
        inversionCount=inversionCount+mergeSort(arr,left,mid);
        inversionCount=inversionCount+mergeSort(arr,mid+1,right);
        inversionCount=inversionCount+merge(arr,left,mid,right);
        return inversionCount;
    }
    static long merge(long[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        long[] leftArr=new long[n1];
        long[] rightArr=new long[n2];
        for(int i=0;i<n1;i++){
            leftArr[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=left;
        long count=0;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                k++;
                i++;
            }
            else{
                arr[k]=rightArr[j];
                k++;
                j++;
                count=count+(mid+1)-(left+i);
            }
        }
        while(i<leftArr.length){
            arr[k]=leftArr[i];
            k++;
            i++;
        }
        while(j<rightArr.length){
            arr[k]=rightArr[j];
            k++;
            j++;
        }
        return count;
    }
}
