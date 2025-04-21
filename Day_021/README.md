# Sort 0s, 1s, and 2s

## Problem Statement

Given an array `arr[]` containing only `0`s, `1`s, and `2`s, sort the array in ascending order.  
You need to solve this problem without utilizing the built-in sort function.

---

## Input Format

- An integer array `arr[]` containing only `0`s, `1`s, and `2`s.

---

## Output Format

- A sorted array in ascending order.

---

## Constraints

- `1 ≤ arr.size() ≤ 106`
- `0 ≤ arr[i] ≤ 2`

---

## Examples

### Example 1:
**Input:**  
`arr[] = [0, 1, 2, 0, 1, 2]`  
**Output:**  
`[0, 0, 1, 1, 2, 2]`  
**Explanation:**  
The `0`s, `1`s, and `2`s are segregated into ascending order.

---

### Example 2:
**Input:**  
`arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]`  
**Output:**  
`[0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]`  
**Explanation:**  
The `0`s, `1`s, and `2`s are segregated into ascending order.

---

## Follow-Up

Could you come up with a one-pass algorithm using only constant extra space?

---

## Notes

To solve this problem efficiently:
1. Use the **Dutch National Flag Algorithm** (or three-pointer approach).
2. Maintain three pointers:
   - `low` for `0`s,
   - `mid` for `1`s,
   - `high` for `2`s.
3. Traverse the array once and swap elements to their correct positions based on the value at `mid`.
4. The time complexity of this approach is `O(N)`, and it uses `O(1)` extra space.