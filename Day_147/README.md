# Dijkstra Algorithm

## Problem Statement
Given an undirected, weighted graph with `V` vertices numbered from 0 to V-1 and `E` edges, represented by a 2D array `edges[][]`, where `edges[i]=[u, v, w]` represents the edge between the nodes `u` and `v` having weight `w`.  
You have to find the shortest distance of all the vertices from the source vertex `src`, and return an array of integers where the ith element denotes the shortest distance between ith node and source vertex `src`.

**Note:** The graph is connected and doesn't contain any negative weight edge.

---

## Examples

### Example 1:
**Input:**  
`V = 3, edges[][] = [[0, 1, 1], [1, 2, 3], [0, 2, 6]], src = 2`  
**Output:**  
`[4, 3, 0]`  
**Explanation:**  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/892538/Web/Other/blobid0_1744201836.jpg" width=50%>

- Shortest path from 2 to 0: 2 → 1 → 0, distance = 4  
- Shortest path from 2 to 1: 2 → 1, distance = 3  
- Shortest path from 2 to 2: 2, distance = 0  

---

### Example 2:
**Input:**  
`V = 5, edges[][] = [[0, 1, 4], [0, 2, 8], [1, 4, 6], [2, 3, 2], [3, 4, 10]], src = 0`  
**Output:**  
`[0, 4, 8, 10, 10]`  
**Explanation:**  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/892538/Web/Other/blobid1_1744202046.jpg" width=50%>

- Shortest path from 0 to 1: 0 → 1, distance = 4  
- Shortest path from 0 to 2: 0 → 2, distance = 8  
- Shortest path from 0 to 3: 0 → 2 → 3, distance = 10  
- Shortest path from 0 to 4: 0 → 1 → 4, distance = 10  

---

## Constraints
- `1 ≤ V ≤ 10^5`
- `1 ≤ E = edges.size() ≤ 10^5`
- `0 ≤ edges[i][j] ≤ 10^4`
- `0 ≤ src < V`

---

## Approach

1. **Graph Representation:**  
   - Build an adjacency list from the edge list for efficient traversal.

2. **Dijkstra's Algorithm:**  
   - Use a priority queue (min-heap) to always expand the vertex with the smallest known distance.
   - Initialize distances from the source to all vertices as infinity, except the source itself (distance 0).
   - For each vertex, update the distances to its neighbors if a shorter path is found.

3. **Time Complexity:**  
   - O((V + E) log V), where V is the number of vertices and E is the number of edges.

---