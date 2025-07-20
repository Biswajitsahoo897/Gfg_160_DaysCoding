package Day_110;

class Solution_109 {
    static int lis(int arr[]) {
        int n = arr.length;
        int lis[] = new int[n];
        // Initialize LIS values for all indexes
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }
        // Compute optimized LIS values in
        // bottom up manner
        for (int i = 1; i < n; i++) {
            for (int prev = 0; prev < i; prev++) {
                if (arr[i] > arr[prev] && lis[i] < lis[prev] + 1) {
                    lis[i] = lis[prev] + 1;
                }
            }
        }
        int max = 1;
        // Lastly pick up the maximum one
        for (int i = 0; i < n; i++) {
            max = Math.max(max, lis[i]);
        }
        return max;
    }
}