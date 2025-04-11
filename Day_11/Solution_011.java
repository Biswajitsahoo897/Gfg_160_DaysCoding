package Day_11;

class Solution {
    int maxProduct(int[] arr) {
        int maxProduct=arr[0];
        int currMax=arr[0];
        int currMin=arr[0];
        int n=arr.length;
        
       for(int i=1;i<n;i++){
        int num=arr[i];
        if(num<0){
            int temp=currMax;
            currMax=currMin;
            currMin=temp;
        }
        currMax=Math.max(num,currMax*num);  
        currMin=Math.min(num,currMin*num);  
        
        maxProduct=Math.max(maxProduct,currMax);  
       }
       return maxProduct;
    }
}