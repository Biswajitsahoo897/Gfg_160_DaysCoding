# Search in a Row-Column Sorted Matrix

## Problem Statement  
Given a 2D integer matrix `mat[][]` of size `n x m`, where every row and column is sorted in **increasing order**, and an integer `x`, the task is to determine whether element `x` is present in the matrix.

---

## Examples

### Example 1:
**Input**:  
`mat[][] = [[3, 30, 38], [20, 52, 54], [35, 60, 69]], x = 62`  
**Output**:  
`false`  
**Explanation**:  
62 is not present in the matrix.

---

### Example 2:
**Input**:  
`mat[][] = [[18, 21, 27], [38, 55, 67]], x = 55`  
**Output**:  
`true`  
**Explanation**:  
55 is present in the matrix.

---

### Example 3:
**Input**:  
`mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]], x = 3`  
**Output**:  
`true`  
**Explanation**:  
3 is present in the matrix.

---

## Constraints
- `1 <= n, m <= 1000`  
- `1 <= mat[i][j] <= 10^9`  
- `1 <= x <= 10^9`

---

## Approach
1. **Start from Top-Right Corner**:
   - Begin with the element at `mat[0][m-1]`.

2. **Traversal Strategy**:
   - If the current element equals `x`, return `true`.
   - If the current element is greater than `x`, move left (column--).
   - If the current element is less than `x`, move down (row++).

3. **Why This Works**:
   - Because both rows and columns are sorted in ascending order, we can eliminate either a row or a column at each step.

4. **Return**:
   - If you reach out of bounds without finding `x`, return `false`.

---

## Complexity
- **Time Complexity**: `O(n + m)`  
- **Space Complexity**: `O(1)`

---

## Tags
- Matrix  
- Search  
- Sorted Matrix  
- Easy Difficulty
