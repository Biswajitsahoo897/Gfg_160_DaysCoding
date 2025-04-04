package Day_004;

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // In the case  d > n...it will be rotated again
        // if (d == 0) return; // No need to rotate if d is 0 or a multiple of n
        // s1: for Reverse first d elements
        reverse(arr, 0, d - 1);        
        // s2: for Reverse remaining n-d elements
        reverse(arr, d, n - 1);        
        // s3: for Reverse the whole array
        reverse(arr, 0, n - 1);
    }
    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}