package Day_109;
import java.util.*;
public class Solution_109 {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // Deques to maintain indices of minimum and maximum elements in the current window.
        // minQ stores indices in increasing order of values.
        // maxQ stores indices in decreasing order of values.
        Deque<Integer> minQ = new ArrayDeque<>(), maxQ = new ArrayDeque<>();
        // 'start' is the left pointer of the sliding window.
        // 'resStart' stores the starting index of the longest valid subarray found so far.
        // 'resLen' stores the length of the longest valid subarray found so far.
        int n = arr.length, start = 0, resStart = 0, resLen = 0;
        
        // 'end' is the right pointer of the sliding window.
        for (int end = 0; end < n; end++) {
            // Maintain minQ: remove elements from the back that are greater than or equal to the current element.
            // This ensures minQ stores indices of increasing values.
            while (!minQ.isEmpty() && arr[minQ.peekLast()] > arr[end]) minQ.pollLast();
            // Maintain maxQ: remove elements from the back that are less than or equal to the current element.
            // This ensures maxQ stores indices of decreasing values.
            while (!maxQ.isEmpty() && arr[maxQ.peekLast()] < arr[end]) maxQ.pollLast();
            
            // Add the current element's index to both deques.
            minQ.addLast(end);
            maxQ.addLast(end);
            
            // Shrink the window from the left if the difference between the maximum and minimum
            // elements in the current window exceeds 'x'.
            while (arr[maxQ.peekFirst()] - arr[minQ.peekFirst()] > x) {
                // If the element at 'start' is the minimum or maximum in the current window, remove its index from the respective deque.
                if (minQ.peekFirst() == start) minQ.pollFirst();
                if (maxQ.peekFirst() == start) maxQ.pollFirst();
                // Move the start pointer to the right.
                start++;
            }
            
            // Update the result 
            if (end - start + 1 > resLen) {
                resStart = start;
                resLen = end - start + 1;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = resStart; i < resStart + resLen; i++) res.add(arr[i]);
        return res;
    }
}
