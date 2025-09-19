import java.util.*;
class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // Create adjacency list for the graph
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        // Array to store in-degree of each vertex
        int[] in = new int[V];
        // List to store the result (topological order)
        ArrayList<Integer> res = new ArrayList<>();
        
        // Initialize adjacency list
        for (int i = 0; i < V; i++) g.add(new ArrayList<>());
        
        // Build the graph and compute in-degrees
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]); // Add edge from e[0] to e[1]
            in[e[1]]++; // Increment in-degree of destination vertex
        }
        
        // Queue for vertices with in-degree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (in[i] == 0) {
                q.add(i); // Add vertex with no incoming edges
            }
        }
        
        // Kahn's Algorithm for Topological Sort (BFS)
        while (!q.isEmpty()) {
            int u = q.poll(); // Get vertex with in-degree 0
            res.add(u); // Add to result
            // For all adjacent vertices, reduce in-degree by 1
            for (int v : g.get(u)) {
                if (--in[v] == 0) q.add(v); // If in-degree becomes 0, add to queue
            }
        }
        
        // Return the topological order
        return res;
    }
}