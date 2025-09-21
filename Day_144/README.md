# Directed Graph Cycle

## Problem Statement
Given a Directed Graph with `V` vertices (Numbered from 0 to V-1) and `E` edges, check whether it contains any cycle or not.  
The graph is represented as a 2D vector `edges[][]`, where each entry `edges[i] = [u, v]` denotes an edge from vertex `u` to `v`.

---

## Examples

### Example 1:
**Input:**  
`V = 4, edges[][] = [[0, 1], [1, 2], [2, 3], [3, 3]]` 

<img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700218/Web/Other/9a013355-2510-4ab0-b554-1a2b9f6cb44f_1685086462.png" width=50%>

**Output:**  
`true`  
**Explanation:**  
There is a cycle: 3 → 3 (self-loop).

---

### Example 2:
**Input:**  
`V = 3, edges[][] = [[0, 1], [1, 2]]`  

<img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700218/Web/Other/b1096e14-7c18-47d8-a4e9-8dd42b2e466f_1685086462.png" width=50%>

**Output:**  
`false`  
**Explanation:**  
No cycle in the graph.

---

## Constraints
- `1 ≤ V, E ≤ 10^5`

---

## Approach

1. **Graph Representation:**  
   - Build an adjacency list from the edge list.

2. **Cycle Detection:**  
   - Use Depth-First Search (DFS) with a recursion stack or Kahn's Algorithm (BFS with in-degree) to detect cycles.
   - For DFS, if a node is revisited in the current recursion stack, a cycle exists.
   - For Kahn's Algorithm, if not all vertices are processed, a cycle exists.

3. **Time Complexity:**  
   - O(V + E), where V is the number of vertices and E is the number of edges.

---