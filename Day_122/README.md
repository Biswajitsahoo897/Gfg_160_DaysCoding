# Minimum Jumps

## Problem Statement
Given an array `arr[]` of non-negative integers, each element represents the maximum number of steps you can move forward from that position.  
Find the **minimum number of jumps** to reach the last index.  
Return **-1** if you cannot reach the end.

---

## Examples

### Example 1
**Input:**  
arr = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]  
**Output:** 3  
**Explanation:**  
- Jump from index 0 → index 1  
- Jump from index 1 → index 4  
- Jump from index 4 → last index  

### Example 2
**Input:**  
arr = [1, 4, 3, 2, 6, 7]  
**Output:** 2  
**Explanation:**  
- Jump from index 0 → index 1  
- Jump from index 1 → last index  

### Example 3
**Input:**  
arr = [0, 10, 20]  
**Output:** -1  
**Explanation:** Cannot move from the first element.

---

## Constraints
- `2 ≤ arr.size() ≤ 10^4`
- `0 ≤ arr[i] ≤ 10^4`

---

## Approach
1. Initialize:
   - `maxReach` = arr[0] (farthest index reachable in current jump)
   - `steps` = arr[0] (remaining steps in current jump)
   - `jumps` = 1 (minimum one jump to start moving)

2. Iterate through the array:
   - Update `maxReach` to the farthest index reachable so far.
   - Decrease `steps` as you move forward.
   - When `steps` becomes 0:
     - Increment `jumps`
     - Update `steps = maxReach - currentIndex`
   - If `i > maxReach` at any point → return -1.

3. Return the number of jumps.

---

## Complexity
- **Time Complexity:** O(n) — single traversal of the array.
- **Space Complexity:** O(1) — constant extra space.

---

## Tags
- Greedy
- Arrays
- Medium Difficulty
