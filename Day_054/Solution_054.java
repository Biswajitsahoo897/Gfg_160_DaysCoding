package Day_054;
import java.util.HashMap;
class Solution {
    int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int ans = 0;
        for (int num : arr) {
            ans += freq.getOrDefault(target - num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}