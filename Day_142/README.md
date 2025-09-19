# Find the Number of Islands

## Problem Statement
Given a grid of size `n*m` (where `n` is the number of rows and `m` is the number of columns) consisting of `'W'` (Water) and `'L'` (Land), find the number of islands.

**Note:**  
An island is either surrounded by water or the boundary of the grid and is formed by connecting adjacent lands horizontally, vertically, or diagonally (i.e., in all 8 directions).

---

## Examples

### Example 1:
**Input:**  
`grid[][] = [['L', 'L', 'W', 'W', 'W'], ['W', 'L', 'W', 'W', 'L'], ['L', 'W', 'W', 'L', 'L'], ['W', 'W', 'W', 'W', 'W'], ['L', 'W', 'L', 'L', 'W']]` 

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/891756/Web/Other/blobid1_1743509451.jpg" width=60%>

**Output:**  
`4`  
**Explanation:**  
There are 4 islands in the grid.

---

### Example 2:
**Input:**  
`grid[][] = [['W', 'L', 'L', 'L', 'W', 'W', 'W'], ['W', 'W', 'L', 'L', 'W', 'L', 'W']]`  

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/891756/Web/Other/blobid2_1743509488.jpg" width=60%>

**Output:**  
`2`  
**Explanation:**  
There are 2 islands in the grid.

---

## Constraints
- `1 ≤ n, m ≤ 500`
- `grid[i][j] = {'L', 'W'}`

---

## Approach

1. **Traversal:**  
   - Use Depth-First Search (DFS) or Breadth-First Search (BFS) to visit all connected land cells in all 8 directions.
   - Mark visited land cells to avoid counting the same island multiple times.

2. **Counting Islands:**  
   - For each unvisited land cell, start a DFS/BFS and increment the island count.

3. **Time Complexity:**  
   - O(n * m), where n and m are the dimensions of the grid.

---