# BFS of Graph

## Problem Statement
Given a connected undirected graph containing `V` vertices, represented by a 2-d adjacency list `adj[][]`, where each `adj[i]` represents the list of vertices connected to vertex `i`. Perform a Breadth First Search (BFS) traversal starting from vertex 0, visiting vertices from left to right according to the given adjacency list, and return a list containing the BFS traversal of the graph.

**Note:** Traverse neighbors in the same order as they appear in the adjacency list.

---

## Examples

### Example 1:
**Input:**  
`adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700217/Web/Other/blobid0_1728648582.jpg" width=65% alt="Example1">

**Output:**  
`[0, 2, 3, 1, 4]`  
**Explanation:**  
Starting from 0, the BFS traversal will follow these steps:  
Visit 0 → Output: 0  
Visit 2 (first neighbor of 0) → Output: 0, 2  
Visit 3 (next neighbor of 0) → Output: 0, 2, 3  
Visit 1 (next neighbor of 0) → Output: 0, 2, 3, 1  
Visit 4 (neighbor of 2) → Final Output: 0, 2, 3, 1, 4

---

### Example 2:
**Input:**  
`adj[][] = [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700217/Web/Other/blobid1_1728648604.jpg" width=65% alt="Example1">

**Output:**  
`[0, 1, 2, 3, 4]`  
**Explanation:**  
Starting from 0, the BFS traversal proceeds as follows:  
Visit 0 → Output: 0  
Visit 1 (the first neighbor of 0) → Output: 0, 1  
Visit 2 (the next neighbor of 0) → Output: 0, 1, 2  
Visit 3 (the first neighbor of 2 that hasn't been visited yet) → Output: 0, 1, 2, 3  
Visit 4 (the next neighbor of 2) → Final Output: 0, 1, 2, 3, 4

---

## Constraints
- `1 ≤ V = adj.size() ≤ 10^4`
- `1 ≤ adj[i][j] ≤ 10^4`

---

## Approach

1. **Breadth First Search (BFS):**
   - Use a queue to keep track of vertices to visit.
   - Use a visited array to avoid revisiting vertices.
   - Start BFS from vertex 0.
   - For each vertex, visit its neighbors in the order they