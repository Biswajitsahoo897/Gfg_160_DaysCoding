// package Day_002;
class Solution {
    void pushZerosToEnd(int[] arr) {
        int nonZeroindex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(i!=nonZeroindex){
                int temp=arr[i];
                arr[i]=arr[nonZeroindex];
                arr[nonZeroindex]=temp;
                }
                nonZeroindex++;
            }
        }
    }
}