package Day_010;
class Solution {
    int maxSubarraySum(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE; //initialize with the smallest integer value
        int sum=0; 
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return sum;
    }
}
