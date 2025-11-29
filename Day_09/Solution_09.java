package Day_09;
import java.util.Arrays;
class Solution_009 {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int min_elem,max_elem;
        int ans = arr[n-1] - arr[0];
        for (int i=1 ; i<=n-1; i++){
            if (arr[i] >= k){
                max_elem = Math.max(arr[i-1] + k, arr[n-1] - k );
                min_elem = Math.min(arr[0] + k, arr[i] - k );
                ans = Math.min(ans, max_elem - min_elem);
            }
            else{
                continue;
            }
        }
        return ans;
    }
}




// This is the code that I wrote and it was not working as expected. \
// It was not giving the correct output for all test cases.
//  It was only giving the correct output for some test cases. 
//  It was not giving the correct output for the test cases where the array was not sorted. 
//  So I had to change my approach and use sorting to get the correct output. 
//  The code is commented out below. It was not giving any compilation errors but it was not giving the correct output for all test cases. 
//  So I had to change my approach and use sorting to get the correct output.
// compiled but failed all the test cases
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]<k){
    //         arr[i]+=k;
    //     }
    //     else{
    //         arr[i]-=k;
    //     }
    // }
    // // Arrays.sort(arr);
    // for(int i=0;i<n-1;i++){
    //      for(int j=0;j<n-1-i;j++){
    //         if(arr[j]>arr[j+1]){
    //             int swap=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=swap;
    //         }
    // }
    // }
    // return arr[n-1]-arr[0];