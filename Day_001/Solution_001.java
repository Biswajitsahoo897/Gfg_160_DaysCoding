class Solution {
    public int getSecondLargest(int[] arr) {
        int large=arr[0];
        int secLarge=arr[1];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>large){
                secLarge=large;
                large=arr[i];
            }
            else if(arr[i]>secLarge && arr[i]!=large){
                secLarge=arr[i];
            }
        }
        if(secLarge==large){
        return -1;
        }
        return secLarge;
    }
        public static void main(String []args){
        int [] arr={12,35,1,10,34,1};
        Solution obj=new Solution();
        obj.getSecondLargest(arr);
    }
    
}