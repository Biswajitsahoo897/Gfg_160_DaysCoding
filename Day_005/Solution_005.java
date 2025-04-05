
package Day_005;
class Solution_005 {
    void nextPermutation(int[] arr) {
        int pivot=-1;
        int n=arr.length;
        // checking if the array is in the decsending order or not and also for the finding the pivot
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
                
            }
        }
        // if the pivot does not exist, reverse the whole array
        if(pivot==-1){
            reverse(arr,0,n-1);
            return ;
        }
        
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        
        reverse(arr,pivot+1,n-1);
    }
    
    private static void reverse(int [] arr,int start,int end){
        while(start<end){
            swap(arr,start++,end--);
        }
    }
    
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
        // find the element from the right that is greater than pivot 
    
}
