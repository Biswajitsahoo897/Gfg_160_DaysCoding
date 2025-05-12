package Day_042;
import java.util.HashSet;
import java.util.Set;
class Solution {
    boolean twoSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) return true;
            seen.add(num);
        }
        return false;
    }
}