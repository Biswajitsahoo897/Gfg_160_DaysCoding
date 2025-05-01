# Peak Element

## Problem Statement
Given an array `arr[]` where no two adjacent elements are the same, find the index of a **peak element**.  
An element is considered to be a peak if it is greater than its adjacent elements (if they exist).  
If there are multiple peak elements, return the index of any one of them. The output will be `"true"` if the index returned by your function is correct; otherwise, it will be `"false"`.

**Note**: Consider the element before the first element and the element after the last element to be negative infinity.

---

## Examples

### Example 1:
**Input**:  
`arr = [1, 2, 4, 5, 7, 8, 3]`  
**Output**:  
`true`  
**Explanation**:  
`arr[5] = 8` is a peak element because `arr[4] < arr[5] > arr[6]`.

---

### Example 2:
**Input**:  
`arr = [10, 20, 15, 2, 23, 90, 80]`  
**Output**:  
`true`  
**Explanation**:  
`arr[1] = 20` and `arr[5] = 90` are peak elements because `arr[0] < arr[1] > arr[2]` and `arr[4] < arr[5] > arr[6]`.

---

### Example 3:
**Input**:  
`arr = [1, 2, 3]`  
**Output**:  
`true`  
**Explanation**:  
`arr[2]` is a peak element because `arr[1] < arr[2]` and `arr[2]` is the last element, so it has negative infinity to its right.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`
- `-2^31 ≤ arr[i] ≤ 2^31 - 1`

---

## Approach
1. **Linear Search**:  
   - Traverse the array and check if the current element is greater than its neighbors.
   - Return the index of the first peak element found.

2. **Binary Search (Optimized)**:  
   - Use binary search to find a peak element in `O(log n)` time.
   - Compare the middle element with its neighbors to decide which half of the array to search next.

3. **Edge Cases**:  
   - If the array has only one element, it is the peak.
   - If the first or last element is greater than its only neighbor, it is a peak.

---

## Complexity
- **Time Complexity**:  
  - Linear Search: `O(n)`  
  - Binary Search: `O(log n)`  
- **Space Complexity**: `O(1)` (no extra space used).

---

## Tags
- Array
- Binary Search
- Peak Element
- Basic Difficulty