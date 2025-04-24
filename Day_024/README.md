# Overlapping Intervals

## Problem Statement
Given an array of intervals `arr[][]`, where `arr[i] = [starti, endi]`, the task is to merge all overlapping intervals.

---

## Examples

### Example 1:
**Input**:  
`arr[][] = [[1,3],[2,4],[6,8],[9,10]]`  
**Output**:  
`[[1,4], [6,8], [9,10]]`  
**Explanation**:  
In the given intervals, we have only two overlapping intervals: `[1,3]` and `[2,4]`, which merge to become `[1,4]`. Therefore, the result is `[[1,4], [6,8], [9,10]]`.

---

### Example 2:
**Input**:  
`arr[][] = [[6,8],[1,9],[2,4],[4,7]]`  
**Output**:  
`[[1,9]]`  
**Explanation**:  
In the given intervals, all the intervals overlap with the interval `[1,9]`. Therefore, the result is `[[1,9]]`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ starti ≤ endi ≤ 10^5`

---

## Approach
1. **Sort Intervals**:  
   - Sort the intervals based on their starting points (`starti`).
2. **Merge Intervals**:  
   - Traverse the sorted intervals and merge overlapping intervals by comparing the current interval's start with the previous interval's end.
3. **Return Result**:  
   - Add non-overlapping intervals directly to the result.

---

## Complexity
- **Time Complexity**: `O(n log n)` (due to sorting).
- **Space Complexity**: `O(n)` (for storing the merged intervals).

---

## Tags
- Array
- Sorting
- Interval Problems
- Medium Difficulty