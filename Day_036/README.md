# Spirally Traversing a Matrix

## Problem Statement
You are given a rectangular matrix `mat[][]` of size `n x m`, and your task is to return an array while traversing the matrix in spiral form.

---

## Examples

### Example 1:
**Input**:  
`mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]`  
**Output**:  
`[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]`  
**Explanation**:  
The matrix is traversed in a spiral order starting from the top-left corner.

---

### Example 2:
**Input**:  
`mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]`  
**Output**:  
`[1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]`  
**Explanation**:  
The matrix is traversed in a spiral order starting from the top-left corner.

---

### Example 3:
**Input**:  
`mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]`  
**Output**:  
`[32, 44, 27, 23, 62, 50, 28, 54]`  
**Explanation**:  
The matrix is traversed in a spiral order starting from the top-left corner.

---

## Constraints
- `1 ≤ n, m ≤ 1000`
- `0 ≤ mat[i][j] ≤ 100`

---

## Approach
1. **Define Boundaries**:  
   - Use four variables (`top`, `bottom`, `left`, `right`) to define the current boundaries of the matrix.
2. **Traverse in Spiral Order**:  
   - Traverse from left to right along the `top` boundary, then move the `top` boundary down.
   - Traverse from top to bottom along the `right` boundary, then move the `right` boundary left.
   - Traverse from right to left along the `bottom` boundary, then move the `bottom` boundary up.
   - Traverse from bottom to top along the `left` boundary, then move the `left` boundary right.
3. **Repeat Until Boundaries Overlap**:  
   - Continue the traversal until the boundaries overlap or cross.

---

## Complexity
- **Time Complexity**: `O(n * m)` (each element is visited once).
- **Space Complexity**: `O(1)` (excluding the output array).

---

## Visualization
![Spiral Traversal](<https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701264/Web/Other/blobid1_1734498654.png>)

---

## Tags
- Matrix
- Array
- Spiral Traversal
- Medium Difficulty