
class binarySearch
{
	int bin_search(int A[], int left, int right,  int k)
	{
		// Your code here
		left=0;
		right=A.length-1;

		while(left<=right){
		    int mid=(left+right)/2;
		    if(A[mid]==k){
		        return mid;
		    }
		    if(A[mid]>k){
		        right=mid-1;
		    }
		    else{
		        left=mid+1;
		    }
		}
		return -1;
	}
}

