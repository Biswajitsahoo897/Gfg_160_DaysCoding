import java.util.*;

class Solution {
    // Function to check if a directed graph contains a cycle
    public boolean isCyclic(int V, int[][] edges) {
        // Create adjacency list for the graph
        List<List<Integer>> g = new ArrayList<>();
        // Array to store in-degree of each vertex
        int[] in = new int[V];

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            g.add(new ArrayList<>()); // Use add() to initialize each list
        }

        // Build the graph and compute in-degrees
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]); // Add edge from e[0] to e[1]
            in[e[1]]++;            // Increment in-degree of destination vertex
        }

        // Queue for vertices with in-degree 0
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < V; i++) {
            if (in[i] == 0){
                q.add(i); // Add vertex with no incoming edges
            }
        }

        int c = 0; // Counter for number of vertices processed

        // Kahn's Algorithm for cycle detection (BFS)
        while (!q.isEmpty()) {
            int u = q.poll(); // Get vertex with in-degree 0
            c++;              // Increment processed vertex count
            // For all adjacent vertices, reduce in-degree by 1
            for (int v : g.get(u)){
                if (--in[v] == 0){
                    q.add(v); // If in-degree becomes 0, add to queue
                }
            }
        }
        // If not all vertices are processed, there is a cycle
        return c != V;
    }
}