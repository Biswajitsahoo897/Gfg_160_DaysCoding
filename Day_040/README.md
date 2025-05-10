# Search in a Sorted Matrix

## Problem Statement
Given a strictly sorted 2D matrix `mat[][]` of size `n x m` and a number `x`, find whether the number `x` is present in the matrix or not.

### Note:
- In a strictly sorted matrix:
  - Each row is sorted in strictly increasing order.
  - The first element of the `i-th` row (`i != 0`) is greater than the last element of the `(i-1)-th` row.

---

## Examples

### Example 1:
**Input**:  
`mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]]`, `x = 14`  
**Output**:  
`true`  
**Explanation**:  
14 is present in the matrix.

---

### Example 2:
**Input**:  
`mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]]`, `x = 42`  
**Output**:  
`false`  
**Explanation**:  
42 is not present in the matrix.

---

### Example 3:
**Input**:  
`mat[][] = [[87, 96, 99], [101, 103, 111]]`, `x = 101`  
**Output**:  
`true`  
**Explanation**:  
101 is present in the matrix.

---

## Constraints
- `1 <= n, m <= 1000`
- `1 <= mat[i][j] <= 10^9`
- `1 <= x <= 10^9`

---

## Solution

### Approach:
We can solve this problem efficiently using **Binary Search** by treating the matrix as a flattened sorted array.

### Algorithm:
1. Treat the matrix as a 1D array:
   - For an index `mid` in the 1D representation:
     - Row index = `mid // m`
     - Column index = `mid % m`
2. Perform binary search:
   - Compare the middle element with `x`.
   - Adjust the search range (`low` and `high`) accordingly.
3. If the element is found, return `true`. Otherwise, return `false`.

---