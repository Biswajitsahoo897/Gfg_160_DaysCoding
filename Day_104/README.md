# Max of Min for Every Window Size

## Problem Statement
Given an array of integers `arr[]`, the task is to find the maximum of the minimum values for every possible window size in the array, where the window size ranges from 1 to `arr.size()`.

For each window size `k`, determine the smallest element in all windows of size `k`, and then find the largest value among these minimums where `1 ≤ k ≤ arr.size()`.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [10, 20, 30, 50, 10, 70, 30]`  
**Output**:  
`[70, 30, 20, 10, 10, 10, 10]`  
**Explanation**:  
- For window size 1: minimums are [10], [20], [30], [50], [10], [70], [30] → max = 70
- For window size 2: minimums are [10], [20], [30], [10], [10], [30] → max = 30
- For window size 3: minimums are [10], [20], [10], [10], [10] → max = 20
- For window size 4: minimums are [10], [10], [10], [10] → max = 10
- For window sizes 5, 6, 7: all minimums are 10

---

### Example 2:
**Input**:  
`arr[] = [10, 20, 30]`  
**Output**:  
`[30, 20, 10]`  
**Explanation**:  
- For window size 1: [10], [20], [30] → max = 30
- For window size 2: [10], [20] → max = 20
- For window size 3: [10] → max = 10

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^6`

---

## Approach

1. **Find Previous and Next Smaller Elements**:
   - For each element, find the index of the previous and next smaller element using a stack.
   - This helps determine the window size where each element is the minimum.

2. **Fill Result Array**:
   - For each element, calculate the length of the window where it is the minimum.
   - For each window size, store the maximum of such minimums.

3. **Propagate Maximums**:
   - Some window sizes may not be filled directly, so propagate the maximums from larger to smaller window sizes.

4. **Time Complexity**:
   - All steps can be done in O(n) time