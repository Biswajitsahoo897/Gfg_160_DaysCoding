import java.util.*;
class Solution {
    public int orangesRotting(int[][] mat) {
        int n = mat.length, m = mat[0].length, fresh = 0, time = 0;
        Queue<int[]> q = new LinkedList<>();

        // Count fresh oranges and enqueue all initially rotten oranges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 2) { // Rotten orange
                    q.add(new int[]{i, j});
                } else if (mat[i][j] == 1) { // Fresh orange
                    fresh++;
                }
            }
        }
        // If there are no fresh oranges, return 0
        if (fresh == 0) return 0;
        // Directions: down, up, right, left

        int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        // BFS to rot adjacent fresh oranges
        while (!q.isEmpty()) {
            int sz = q.size();
            boolean changed = false;
            for (int k = 0; k < sz; k++) {
                int[] p = q.poll();
                int i = p[0], j = p[1];
                for (int[] dir : d) {
                    int x = i + dir[0], y = j + dir[1];
                    // Check boundaries and if the orange is fresh
                    if (x < 0 || y < 0 || x >= n || y >= m || mat[x][y] != 1) {
                        continue;
                    }
                    mat[x][y] = 2; // Rot the orange
                    q.add(new int[]{x, y});
                    fresh--;
                    changed = true;
                }
            }
            // If any orange was rotted in this round, increment time
            if (changed) time++;
        }

        // If all oranges are rotten, return time, else return -1
        return fresh == 0 ? time : -1;
    }
}