package Day_098;
import java.util.*;
class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // Max heap for the lower half of numbers
        PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());
        // Min heap for the upper half of numbers
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        // List to store medians after each insertion
        ArrayList<Double> res = new ArrayList<>();

        for (int n : arr) {
            // Add new number to max heap
            maxH.add(n);
            //for Balance move largest from max heap to min heap
            minH.add(maxH.poll());
            // Ensure max heap has equal or one more element than min heap
            if (maxH.size() < minH.size()) maxH.add(minH.poll());
            //Then Calculate median 
            res.add(maxH.size() > minH.size() ? (double) maxH.peek() : (maxH.peek() + minH.peek()) / 2.0);
        }
        return res;
    }
}