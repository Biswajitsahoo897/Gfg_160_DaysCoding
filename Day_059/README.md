# Trapping Rain Water

## Problem Statement
Given an array `arr[]` with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.

---

## Examples

### Example 1:
**Input:**  
`arr[] = [3, 0, 1, 0, 4, 0, 2]`  
**Output:**  
`10`  
**Explanation:**  
Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.

---
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701211/Web/Other/blobid0_1741784862.png" width="45%">

### Example 2:
**Input:**  
`arr[] = [3, 0, 2, 0, 4]`  
**Output:**  
`7`  
**Explanation:**  
Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.

---

### Example 3:
**Input:**  
`arr[] = [1, 2, 3, 4]`  
**Output:**  
`0`  
**Explanation:**  
We cannot trap water as there is no height bound on both sides.

---

### Example 4:
**Input:**  
`arr[] = [2, 1, 5, 3, 1, 0, 4]`  
**Output:**  
`9`  
**Explanation:**  
Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.

---

## Constraints
- `1 < arr.size() < 10^5`
- `0 < arr[i] < 10^3`

---