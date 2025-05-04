// package Day_033;
import java.util.Arrays;
class Solution_033 {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length - 1] - stalls[0], result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 1, lastPlaced = stalls[0];
            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPlaced >= mid) {
                    count++;
                    lastPlaced = stalls[i];
                }
            }
            if (count >= k) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
// public static void main(String[] args) {
//     int[] stalls = {1, 2, 4, 8, 9};
//     int k = 3;
//     System.out.println(aggressiveCows(stalls, k)); 
// }
// this is the main method to test the function
