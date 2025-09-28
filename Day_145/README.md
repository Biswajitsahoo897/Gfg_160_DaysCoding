# Articulation Point - II

## Problem Statement
You are given an undirected graph with `V` vertices and `E` edges. The graph is represented as a 2D array `edges[][]`, where each element `edges[i] = [u, v]` indicates an undirected edge between vertices `u` and `v`.

Your task is to return all the articulation points (or cut vertices) in the graph.  
An articulation point is a vertex whose removal, along with all its connected edges, increases the number of connected components in the graph.

**Note:**  
- The graph may be disconnected, i.e., it may consist of more than one connected component.
- If no such point exists, return `{-1}`.

---

## Examples

### Example 1:
**Input:**  
`V = 5, edges[][] = [[0, 1], [1, 4], [4, 3], [4, 2], [2, 3]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/892595/Web/Other/blobid3_1744109134.png" width="50%">

**Output:**  
`[1, 4]`  
**Explanation:**  
Removing the vertex 1 or 4 will disconnect the graph.
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/892595/Web/Other/blobid4_1744109133.png" width="50%">
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/892595/Web/Other/blobid5_1744109133.png" width="50%">

---

### Example 2:
**Input:**  
`V = 4, edges[][] = [[0, 1], [0, 2]]` 

**Output:**  
`[0]`  
**Explanation:**  
Removing the vertex 0 will increase the number of disconnected components to 3.

---

## Constraints
- `1 ≤ V, E ≤ 10^4`

---

## Approach

1. **Graph Representation:**  
   - Build an adjacency list from the edge list.

2. **Finding Articulation Points:**  
   - Use Depth-First Search (DFS) and track discovery and low times for each vertex.
   - A vertex is an articulation point if:
     - It is the root of DFS and has more than one child.
     - It is not the root, and there exists a child such that no vertex in the subtree rooted at that child has a back edge to one of the ancestors of the vertex.

3. **Disconnected Graphs:**  
   - Run DFS for every unvisited vertex to handle disconnected components.

4. **Return:**  
   - Return all articulation points found, or `{-1}` if none exist.

5. **Time Complexity:**  
   - O(V + E), where V is the number of vertices and E is the number of edges.

---