
/*
Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice, except 
for one number which will occur only once. Find the number occurring only once.

Ex:
N = 5
A = {1, 1, 2, 5, 5}
Output: 2
Explanation: 
Since 2 occurs once, while
other numbers occur twice, 
2 is the answer.
*/

//Approach-1 :using hashMap ,Time and space-O(N) and O(N)

class Sol
{
    public static int search(int A[], int N)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}

//Approach-2 :using XOR Operation,Time and space-O(N) and O(1)

class Sol
{
    public static int search(int A[], int N)
    {
       int ans=0;
       for(int i=0;i<N;i++){
           ans=ans^A[i];
       }
       return ans;
    }
}

//Approach-3 :using  BinarySearch,Time and space-O(Log(N)) and O(1)

class Sol
{
    public static int search(int A[], int N)
    {
        int low=0;
        int high=N-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(low==high){
                return A[low];
            }
            if(mid%2==1){
                if(A[mid]==A[mid-1]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(A[mid]==A[mid+1]){
                    low=mid+2;
                }
                else{
                    high=mid;
                }
            }
        }
        return -1;
    }
}


