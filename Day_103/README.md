# Histogram Max Rectangular Area

## Problem Statement
You are given a histogram represented by an array `arr`, where each element of the array denotes the height of the bars in the histogram. All bars have the same width of 1 unit.

Your task is to find the largest rectangular area possible in the given histogram, where the rectangle can be formed using a number of contiguous bars.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [60, 20, 50, 40, 10, 50, 60]`  

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240924161857/Largest-Rectangular-Area-in-a-Histogram.webp" width=60%>

**Output**:  
`100`  
**Explanation**:  
We get the maximum by picking bars 50 and 60. The area is computed as (smallest height) * (number of picked bars) = 50 * 2 = 100.

---

### Example 2:
**Input**:  
`arr[] = [3, 5, 1, 7, 5, 9]`  
**Output**:  
`15`  
**Explanation**:  
We get the maximum by picking bars 7, 5, and 9. The area is computed as 5 * 3 = 15.

---

### Example 3:
**Input**:  
`arr[] = [3]`  
**Output**:  
`3`  
**Explanation**:  
The largest area would be 3 (height 3, width 1).

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^4`

---

## Approach
1. **Use a Stack**:
   - Traverse the histogram bars.
   - For each bar, pop from the stack until the current bar is taller than the bar at the top of the stack.
   - For each popped bar, calculate the area with the popped bar as the smallest bar.
   - Keep track of the maximum area found.
   - After traversing all bars, pop any remaining bars from the stack and calculate their areas.

2. **Time Complexity**:
   - Each bar is pushed and popped at most once, so the overall time complexity