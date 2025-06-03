# Product Array Puzzle

## Problem Statement
Given an array, `arr[]`, construct a product array, `res[]`, where each element in `res[i]` is the product of all elements in `arr[]` except `arr[i]`. Return this resultant array, `res[]`.

**Note:** Each element in `res[]` lies inside the 32-bit integer range.

---

## Examples

### Example 1:
**Input:**  
`arr[] = [10, 3, 5, 6, 2]`  
**Output:**  
`[180, 600, 360, 300, 900]`  
**Explanation:**  
- For `i = 0`, `res[0] = 3 * 5 * 6 * 2 = 180`
- For `i = 1`, `res[1] = 10 * 5 * 6 * 2 = 600`
- For `i = 2`, `res[2] = 10 * 3 * 6 * 2 = 360`
- For `i = 3`, `res[3] = 10 * 3 * 5 * 2 = 300`
- For `i = 4`, `res[4] = 10 * 3 * 5 * 6 = 900`

---

### Example 2:
**Input:**  
`arr[] = [12, 0]`  
**Output:**  
`[0, 12]`  
**Explanation:**  
- For `i = 0`, `res[0] = 0`
- For `i = 1`, `res[1] = 12`

---

## Constraints
- `2 ≤ arr.size() ≤ 10^5`
- `-100 ≤ arr[i] ≤ 100`

---