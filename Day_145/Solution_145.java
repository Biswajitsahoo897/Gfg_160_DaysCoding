// package Day_145;
import java.util.ArrayList;
class Solution {
    // Main function to find all articulation points in the graph
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        // just to avoid unchecked warning
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] adj = (ArrayList<Integer>[]) new ArrayList[V];

        // Initialize adjacency lists for each vertex
        for(int i=0;i<V;i++){
            adj[i]=new ArrayList<>();
        }

        // Build the undirected graph from the edge list
        for(int[] e:edges){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        // Arrays to store discovery time and low value for each vertex
        int [] disc =new int[V], low =new int[V];
        // Visited array and articulation point marker array
        boolean[] vis=new boolean[V], ap=new boolean[V];
        // Time counter wrapped in array for mutability in recursion
        int[] time={0};

        // Run DFS for each component (handles disconnected graphs)
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(i,-1,adj,disc,low,vis,ap,time);
            }
        }

        // Collect all articulation points
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(ap[i]) res.add(i);
        }
        // If no articulation point exists, return -1
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }

    // DFS utility to find articulation points using discovery and low times
    static void dfs(int u, int p, ArrayList<Integer>[] adj, int[] disc, int[] low, boolean[] vis, boolean[] ap, int[] time){
        vis[u]=true;
        disc[u]=low[u]=++time[0]; // Set discovery and low time
        int children=0; // Count of children in DFS tree

        for(int v:adj[u]){
            if(!vis[v]){
                children++;
                dfs(v,u,adj,disc,low,vis,ap,time);
                low[u]=Math.min(low[u],low[v]); // Update low value after visiting child

                // If u is not root and low value of one child is >= discovery time of u, then u is an articulation point
                if(p!=-1 && low[v]>=disc[u]){
                    ap[u]=true;
                }
            }
            // Update low value if v is already visited and is not parent
            else if(v!=p){
                low[u]=Math.min(low[u],disc[v]);
            }
        }
        // If u is root and has more than one child, it is an articulation point
        if(p==-1 && children>1){
            ap[u]=true;
        }
    }
}