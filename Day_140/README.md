# Rotten Oranges 

## Problem Statement  
Given a matrix `mat[][]` of dimension `n * m` where each cell in the matrix can have values:  
- `0`: Empty cell  
- `1`: Fresh orange  
- `2`: Rotten orange  

At every **unit of time**, a rotten orange rots its adjacent fresh oranges (up, down, left, right).  
We need to return the **minimum time** required to rot all fresh oranges. If it is not possible, return `-1`.

---

## Examples  

### Example 1:
**Input:**  
`mat[][] = [[0, 1, 2], [0, 1, 2], [2, 1, 1]]`  
**Output:**  
`1`  
**Explanation:**  
Oranges at positions (0,2), (1,2), (2,0) will rot oranges at (0,1), (1,1), (2,2) and (2,1) in unit time.

---

### Example 2:
**Input:**  
`mat[][] = [[2, 2, 0, 1]]`  
**Output:**  
`-1`  
**Explanation:**  
Oranges at (0,0) and (0,1) can't rot orange at (0,3).

---

### Example 3:
**Input:**  
`mat[][] = [[2, 2, 2], [0, 2, 0]]`  
**Output:**  
`0`  
**Explanation:**  
There is no fresh orange.

---

## Constraints
- `1 ≤ mat.size() ≤ 500`
- `1 ≤ mat[0].size() ≤ 500`
- `mat[i][j] = {0, 1, 2}`

---

## Approach

1. **Breadth-First Search (BFS):**
   - Use a queue to store the positions of all initially rotten oranges.
   - For each unit of time, rot all adjacent fresh oranges and add their positions to the queue.
   - Track the time taken to rot all oranges.

2. **Edge Cases:**
   - If there are no fresh oranges, return 0.
   - If some fresh oranges cannot be rotted, return -1.

3. **Time Complexity:**  
   - O(n * m), where n and m are the dimensions of the matrix.
