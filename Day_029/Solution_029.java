package Day_029;
class Solution {
    public int findMin(int[] arr) {
        int low=0,high=arr.length-1;
        while(low<high){
            if(arr[low]<arr[high])
                return arr[low];
            int mid=low+((high-low)>>1);
            if(arr[mid]>arr[high])
                low=mid+1;
            else
                high=mid;            
        }
        return arr[low];
    }
}