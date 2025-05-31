class Solution {
    public static int findEquilibrium(int arr[]) {
        int lSum=0,rSum=0;
        for(int e:arr){
            rSum+=e;
        }        
        for(int i=0;i<arr.length-1;i++){
            rSum-=arr[i];
        
        if(lSum==rSum){
            return i;
            }
            lSum+=arr[i];
        }
    return -1;
    }
}