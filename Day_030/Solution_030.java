package Day_030;
class Solution {
    int search(int[] arr, int key) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(key==arr[i])
                return i;
        }
        return -1;
    }
}