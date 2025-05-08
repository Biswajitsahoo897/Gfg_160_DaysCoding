# Rotate Matrix by 90 Degrees

## Problem Statement
Given a square matrix `mat[][]` of size `n x n`, the task is to rotate it by 90 degrees in an anti-clockwise direction **without using any extra space**.

---

## Examples

### Example 1:
**Input**:  
`mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]`  
**Output**:  
Rotated Matrix:  
`[3, 6, 9]`  
`[2, 5, 8]`  
`[1, 4, 7]`  

---

### Example 2:
**Input**:  
`mat[][] = [[1, 2], [3, 4]]`  
**Output**:  
Rotated Matrix:  
`[2, 4]`  
`[1, 3]`  

---

## Constraints
- `1 ≤ n ≤ 102`
- `0 ≤ mat[i][j] ≤ 10^3`

---

## Approach
1. **Transpose the Matrix**:
   - Convert rows into columns by swapping `mat[i][j]` with `mat[j][i]` for all `i < j`.

2. **Reverse the Rows**:
   - Reverse the order of elements in each row to achieve a 90-degree anti-clockwise rotation.

3. **In-Place Transformation**:
   - Perform the above steps without using any extra space.

---

## Complexity
- **Time Complexity**: `O(n^2)` (for transposing and reversing rows).
- **Space Complexity**: `O(1)` (no extra space used).

---

## Tags
- Matrix
- Array
- In-Place Transformation
- Easy Difficulty