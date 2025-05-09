# Search in a Row-Wise Sorted Matrix

## Problem Statement  
Given a row-wise sorted 2D matrix `mat[][]` of size `n x m` and an integer `x`, the task is to determine whether `x` is present in the matrix.

📌 A row-wise sorted matrix means:  
For every row `i`, `mat[i][j] <= mat[i][j+1]`

---

## Examples

### Example 1:
**Input**:  
`mat = [[3, 4, 9], [2, 5, 6], [9, 25, 27]], x = 9`  
**Output**: `true`  
**Explanation**: 9 is present in the matrix.

---

### Example 2:
**Input**:  
`mat = [[19, 22, 27, 38, 55, 67]], x = 56`  
**Output**: `false`  
**Explanation**: 56 is not present in the matrix.

---

### Example 3:
**Input**:  
`mat = [[1, 2, 9], [65, 69, 75]], x = 91`  
**Output**: `false`  
**Explanation**: 91 is not present in the matrix.

---

## Constraints
- `1 <= n, m <= 1000`
- `1 <= mat[i][j] <= 10^5`
- `1 <= x <= 10^5`

---

## Approach
1. **Row-wise Binary Search**:
   - Iterate over each row of the matrix.
   - Use binary search on each row to look for the element `x`.

2. **Break Early**:
   - If `x` is found, return `true`.
   - If all rows are searched and `x` is not found, return `false`.

---

## Complexity
- **Time Complexity**: `O(n * log m)`  
- **Space Complexity**: `O(1)`

---

## Tags
- Matrix  
- Binary Search  
- Easy Difficulty  
- Search Optimization  
- Row-wise Sorted Matrix
