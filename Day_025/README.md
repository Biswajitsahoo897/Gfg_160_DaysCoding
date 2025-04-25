# Non-overlapping Intervals

## Problem Statement
Given a 2D array `intervals[][]` representing intervals where `intervals[i] = [starti, endi]`, return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

---

## Examples

### Example 1:
**Input**:  
`intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]`  
**Output**:  
`1`  
**Explanation**:  
The interval `[1, 3]` can be removed, and the rest of the intervals are non-overlapping.

---

### Example 2:
**Input**:  
`intervals[][] = [[1, 3], [1, 3], [1, 3]]`  
**Output**:  
`2`  
**Explanation**:  
You need to remove two intervals `[1, 3]` to make the rest of the intervals non-overlapping.

---

### Example 3:
**Input**:  
`intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]`  
**Output**:  
`0`  
**Explanation**:  
All intervals are already non-overlapping.

---

## Constraints
- `1 ≤ intervals.size() ≤ 10^5`
- `|intervalsi| == 2`
- `0 ≤ starti < endi ≤ 5 * 10^4`

---

## Approach
1. **Sort Intervals**:  
   - Sort the intervals based on their ending points (`endi`).
2. **Iterate and Count**:  
   - Traverse the sorted intervals and count overlapping intervals by comparing the current interval's start with the previous interval's end.
3. **Return Result**:  
   - The number of intervals to remove is the total number of intervals minus the count of non-overlapping intervals.

---

## Complexity
- **Time Complexity**: `O(n log n)` (due to sorting).
- **Space Complexity**: `O(1)` (if sorting is done in-place).

---

## Tags
- Array
- Sorting
- Greedy Algorithm
- Medium Difficulty