# Topological Sort

## Problem Statement
Given a Directed Acyclic Graph (DAG) of `V` (0 to V-1) vertices and `E` edges represented as a 2D list `edges[][]`, where each entry `edges[i] = [u, v]` denotes a directed edge `u -> v`. Return the topological sort for the given graph.


Topological sorting for a Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge `u -> v`, vertex `u` comes before `v` in the ordering.

**Note:** As there are multiple topological orders possible, you may return any of them. If your returned topological sort is correct then the output will be true else false.

---

## Examples

### Example 1:
**Input:**  
`V = 4, E = 3, edges[][] = [[3, 0], [1, 0], [2, 0]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700255/Web/Other/blobid0_1744196747.jpg" width="60%">

**Output:**  
`true`  
**Explanation:**  
The output `true` denotes that the order is valid. Few valid topological orders for the given graph are:  
- `[3, 2, 1, 0]`  
- `[1, 2, 3, 0]`  
- `[2, 3, 1, 0]`  

---

### Example 2:
**Input:**  
`V = 6, E = 6, edges[][] = [[1, 3], [2, 3], [4, 1], [4, 0], [5, 0], [5, 2]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700255/Web/Other/blobid1_1744196789.jpg" width="60%">

**Output:**  
`true`  
**Explanation:**  
The output `true` denotes that the order is valid. Few valid topological orders for the graph are:  
- `[4, 5, 0, 1, 2, 3]`  
- `[5, 2, 4, 0, 1, 3]`  

---

## Constraints
- `2 ≤ V ≤ 5 x 10^3`
- `1 ≤ E = edges.size() ≤ min[10^5, (V * (V - 1)) / 2]`

---

## Approach

1. **Build the Graph:**  
   - Construct the adjacency list from the edge list.

2. **Kahn's Algorithm BFS or DFS:**  
   - Use Kahn's algorithm (BFS with in-degree) or DFS to find a valid topological order.
  
3. **Return Any Valid Order:**  
   - Multiple valid topological orders may exist.
  
4. **Time Complexity:**  
   - O(V + E), where V is the number of vertices and E is the number of edges.

---