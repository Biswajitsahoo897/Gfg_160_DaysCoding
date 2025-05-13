# Count Pairs with Given Sum

## Problem Statement
Given an array `arr[]` and an integer `target`. You have to find the number of pairs in the array `arr[]` which sum up to the given `target`.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [1, 5, 7, -1, 5]`, `target = 6`  
**Output**:  
`3`  
**Explanation**:  
Pairs with sum `6` are `(1, 5)`, `(7, -1)`, and `(1, 5)`.

---

### Example 2:
**Input**:  
`arr[] = [1, 1, 1, 1]`, `target = 2`  
**Output**:  
`6`  
**Explanation**:  
Pairs with sum `2` are `(1, 1)` repeated `6` times.

---

### Example 3:
**Input**:  
`arr[] = [10, 12, 10, 15, -1]`, `target = 125`  
**Output**:  
`0`  
**Explanation**:  
No pairs with sum `125` exist.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `-10^4 ≤ arr[i] ≤ 10^4`
- `1 ≤ target ≤ 10^4`

---

## Solution

### Approach:
To solve this problem efficiently, we can use a **Hash Map**:
1. Traverse the array and maintain a hash map to store the frequency of each element.
2. For each element `arr[i]`, calculate the complement `target - arr[i]`:
   - If the complement exists in the hash map, add its frequency to the count of pairs.
   - Update the frequency of `arr[i]` in the hash map.
3. Return the total count of pairs.

### Complexity:
- **Time Complexity**: `O(n)` because we traverse the array once and perform constant-time operations for each element.
- **Space Complexity**: `O(n)` for the hash map.

---