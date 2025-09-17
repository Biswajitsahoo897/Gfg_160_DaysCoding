# Undirected Graph Cycle

## Problem Statement
Given an undirected graph with `V` vertices and `E` edges, represented as a 2D vector `edges[][]`, where each entry `edges[i] = [u, v]` denotes an edge between vertices `u` and `v`, determine whether the graph contains a cycle or not. The graph can have multiple components.

---

## Examples

### Example 1:
**Input:**  
`V = 4, E = 4, edges[][] = [[0, 1], [0, 2], [1, 2], [2, 3]]` 

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/891735/Web/Other/blobid1_1743510240.jpg" width="60%"> 

**Output:**  
`true`  
**Explanation:**  
There is a cycle: 1 → 2 → 0 → 1.

---

### Example 2:
**Input:**  
`V = 4, E = 3, edges[][] = [[0, 1], [1, 2], [2, 3]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/891735/Web/Other/blobid2_1743510254.jpg" width="60%"> 

**Output:**  
`false`  
**Explanation:**  
No cycle in the graph.

---

## Constraints
- `1 ≤ V ≤ 10^5`
- `1 ≤ E = edges.size() ≤ 10^5`

---

## Approach

1. **Graph Representation:**  
   - Build an adjacency list from the edge list.

2. **Cycle Detection:**  
   - Use BFS or DFS to traverse each component.
   - For each node, check if there is a back edge to a previously visited node that is not its parent.
   - If such an edge exists, a cycle is present.

3. **Multiple Components:**  
   - Since the graph may have multiple components, check each unvisited node.

4. **Time Complexity:**  
   - O(V + E), where V is the number of vertices and E is the number of edges.

---