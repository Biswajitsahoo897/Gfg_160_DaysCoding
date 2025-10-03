package Day_148;
import java.util.*;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length, n = image[0].length; // dimensions of the image
        int oc = image[sr][sc]; // original color at the starting pixel

        // If the new color is same as the original color, no change is needed
        if (oc == newColor) return image;

        // Queue for BFS traversal
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc}); // add the starting pixel to queue

        // Change the color of the starting pixel
        image[sr][sc] = newColor;

        // Directions for moving up, right, down, left (4-directional)
        int[] d = {-1, 0, 1, 0, -1};

        // BFS traversal
        while (!q.isEmpty()) {
            int[] p = q.poll(); // current pixel

            // Check its 4 neighbors
            for (int i = 0; i < 4; i++) {
                int x = p[0] + d[i];     // row index of neighbor
                int y = p[1] + d[i + 1]; // column index of neighbor

                // Check if neighbor is inside the image boundaries 
                // and has the original color
                if (x >= 0 && y >= 0 && x < m && y < n && image[x][y] == oc) {
                    image[x][y] = newColor; // fill with new color
                    q.add(new int[]{x, y}); // push this pixel into queue
                }
            }
        }
        return image; // return the updated image
    }
}
