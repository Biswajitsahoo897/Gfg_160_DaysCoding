# DFS of Graph

## Problem Statement
Given a connected undirected graph containing `V` vertices represented by a 2-d adjacency list `adj[][]`, where each `adj[i]` represents the list of vertices connected to vertex `i`. Perform a Depth First Search (DFS) traversal starting from vertex 0, visiting vertices from left to right as per the given adjacency list, and return a list containing the DFS traversal of the graph.

**Note:** Traverse neighbors in the same order as they appear in the adjacency list.

---

## Examples

### Example 1:
**Input:**  
`adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700203/Web/Other/blobid0_1728647807.jpg" width=60%>

**Output:**  
`[0, 2, 4, 3, 1]`  
**Explanation:**  
Starting from 0, the DFS traversal proceeds as follows:  
Visit 0 → Output: 0  
Visit 2 (the first neighbor of 0) → Output: 0, 2  
Visit 4 (the first neighbor of 2) → Output: 0, 2, 4  
Backtrack to 2, then backtrack to 0, and visit 3 → Output: 0, 2, 4, 3  
Finally, backtrack to 0 and visit 1 → Final Output: 0, 2, 4, 3, 1

---

### Example 2:
**Input:**  
`adj[][] = [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700203/Web/Other/blobid1_1728648013.jpg" width=60%>

**Output:**  
`[0, 1, 2, 3, 4]`  
**Explanation:**  
Starting from 0, the DFS traversal proceeds as follows:  
Visit 0 → Output: 0  
Visit 1 (the first neighbor of 0) → Output: 0, 1  
Visit 2 (the first neighbor of 1) → Output: 0, 1, 2  
Visit 3 (the first neighbor of 2) → Output: 0, 1, 2, 3  
Backtrack to 2 and visit 4 → Final Output: 0, 1, 2, 3, 4

---

## Constraints
- `1 ≤ V = adj.size() ≤ 10^4`
- `1 ≤ adj[i][j] ≤ 10^4`

---

## Approach

1. **Depth First Search (DFS):**
   - Use a visited array to keep track of visited vertices.
   - Start DFS from vertex 0.
   - For each vertex, visit its neighbors in the order they appear in the adjacency list.
   - Add each visited vertex to the result list.

2. **Time Complexity:**  
   - O(V + E), where V is the number of vertices and E is the number of edges.