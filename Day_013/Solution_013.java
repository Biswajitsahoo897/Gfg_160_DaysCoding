package Day_013;
public class Solution_013 {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]>0 && arr[i]<=n&& arr[i]!=arr[arr[i]-1]){
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
        }
        // this will find the index where the value != index+1
        for(int i=0;i<n-1;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
        
    }
}
