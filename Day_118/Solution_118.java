package Day_118;

public class Solution_118 {
    static int minCostClimbingStairs(int[] cost) {
        int a = cost[0], b = cost[1];
        int n = cost.length;
        for (int i = 2; i < n; i++) {
            int temp = b;
            b = cost[i] + Math.min(a, b);
            a = temp;
        }
        return Math.min(a, b);
    }
}
