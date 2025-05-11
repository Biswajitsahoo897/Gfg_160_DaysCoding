# Set Matrix Zeroes

## Problem Statement
You are given a 2D matrix `mat[][]` of size `n×m`. The task is to modify the matrix such that if `mat[i][j]` is `0`, all the elements in the `i-th` row and `j-th` column are set to `0` and do it in constant space complexity.

---

## Examples

### Example 1:
**Input**:  
`mat[][] = [[1, -1, 1], [-1, 0, 1], [1, -1, 1]]`  
**Output**:  
`[[1, 0, 1], [0, 0, 0], [1, 0, 1]]`  
**Explanation**:  
`mat[1][1] = 0`, so all elements in row `1` and column `1` are updated to zeroes.

---

### Example 2:
**Input**:  
`mat[][] = [[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]]`  
**Output**:  
`[[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]`  
**Explanation**:  
`mat[0][0]` and `mat[0][3]` are `0`s, so all elements in row `0`, column `0`, and column `3` are updated to zeroes.

---

## Constraints
- `1 ≤ n, m ≤ 500`
- `-2^31 ≤ mat[i][j] ≤ 2^31 - 1`

---

## Solution

### Approach:
To solve this problem in **constant space complexity**, we can use the first row and first column of the matrix itself as markers to indicate whether a row or column should be set to zero.

### Algorithm:
1. Use the first row and first column as markers:
   - If `mat[i][j] == 0`, set `mat[i][0] = 0` (mark the row) and `mat[0][j] = 0` (mark the column).
2. Traverse the matrix (excluding the first row and column) and set `mat[i][j] = 0` if either `mat[i][0] == 0` or `mat[0][j] == 0`.
3. Handle the first row and column separately:
   - If the first row or first column originally contained a zero, set the entire first row or column to zero.

---

### Complexity:
- **Time Complexity**: `O(n * m)` because we traverse the matrix multiple times.
- **Space Complexity**: `O(1)` since we use the matrix itself for marking.

---