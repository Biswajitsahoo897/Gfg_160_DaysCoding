import java.util.*;
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        // for storing the indices
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                res.add(arr[dq.peekFirst()]);
            }
        }
        return res;
    }
}


/*
dq.peekFirst() – Returns the index at the front of the deque.
dq.pollFirst() – Removes and returns the front index.
dq.peekLast() – Returns the index at the rear of the deque.
dq.pollLast() – Removes and returns the rear index.
dq.offerLast(i) – Adds index i to the rear.
 */