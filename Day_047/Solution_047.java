package Day_047;
import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);
        int longest = 0;
        for (int num : numSet)
            if (!numSet.contains(num - 1)) {
                int count = 1;
                while (numSet.contains(++num)) count++;
                longest = Math.max(longest, count);
            }
        return longest;
    }
}