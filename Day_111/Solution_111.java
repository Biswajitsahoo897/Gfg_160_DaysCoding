package Day_111;
import java.util.*;
public class Solution_111 {
public int longestStringChain(String[] words) {
        // Sort the words by their length in ascending order. This is crucial
        // because a predecessor must always be shorter than its successor.
        Arrays.sort(words, Comparator.comparingInt(String::length));
        
        // dp map stores the longest string chain ending with a particular word.
        // Key: word, Value: length of the longest string chain ending with this word.
        Map<String, Integer> dp = new HashMap<>();
        
        // Initialize the maximum length of a string chain
        int res = 1;
        
        // Iterate through each word in the sorted array.
        for (String w : words) {
            // Initialize the chain length for the current word to 1 (the word itself).
            dp.put(w, 1);
            // Try to form a predecessor by removing one character at each possible position.
            for (int i = 0; i < w.length(); i++) {
                String pred = w.substring(0, i) + w.substring(i + 1);
                // If the predecessor exists in our dp map, update the current word's chain length.
                // The new chain length would be (chain length of predecessor + 1).
                dp.put(w, Math.max(dp.get(w), dp.getOrDefault(pred, 0) + 1));
            }
            // Update the overall maximum string chain length found.
            res = Math.max(res, dp.get(w));
        }
        return res;
    }
}
