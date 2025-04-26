# Insert Interval

## Problem Statement
Geek has an array of non-overlapping intervals `intervals` where `intervals[i] = [starti, endi]` represent the start and the end of the `i-th` event, and `intervals` is sorted in ascending order by `starti`. He wants to add a new interval `newInterval = [newStart, newEnd]` where `newStart` and `newEnd` represent the start and end of this interval.

Help Geek to insert `newInterval` into `intervals` such that `intervals` is still sorted in ascending order by `starti` and does not have any overlapping intervals (merge overlapping intervals if necessary).

---

## Examples

### Example 1:
**Input**:  
`intervals = [[1,3], [4,5], [6,7], [8,10]], newInterval = [5,6]`  
**Output**:  
`[[1,3], [4,7], [8,10]]`  
**Explanation**:  
The new interval `[5,6]` overlaps with `[4,5]` and `[6,7]`.

---

### Example 2:
**Input**:  
`intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,9]`  
**Output**:  
`[[1,2], [3,10], [12,16]]`  
**Explanation**:  
The new interval `[4,9]` overlaps with `[3,5], [6,7], [8,10]`.

---

## Constraints
- `1 ≤ intervals.size() ≤ 10^5`
- `0 ≤ start[i], end[i] ≤ 10^9`

---

## Approach
1. **Iterate Through Intervals**:  
   - Traverse the intervals and add all intervals that end before `newInterval` starts to the result.
2. **Merge Overlapping Intervals**:  
   - Merge all intervals that overlap with `newInterval` by updating the start and end of `newInterval`.
3. **Add Remaining Intervals**:  
   - Add all intervals that start after `newInterval` ends to the result.
4. **Insert the Merged Interval**:  
   - Add the merged `newInterval` to the result.

---

## Complexity
- **Time Complexity**: `O(n)` (single traversal of the intervals).
- **Space Complexity**: `O(n)` (for storing the result).

---

## Tags
- Array
- Sorting
- Interval Problems
- Medium Difficulty