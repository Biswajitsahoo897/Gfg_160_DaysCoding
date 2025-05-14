package Day_044;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        res.add(Arrays.asList(i, j, k));
                    }
                }
            }
        }

        return res;
    }
}