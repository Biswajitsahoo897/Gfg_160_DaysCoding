# Next Greater Element

## Problem Statement
Given an array `arr[]` of integers, the task is to find the next greater element for each element of the array in order of their appearance.  
The next greater element of an element in the array is the nearest element on the right which is greater than the current element.  
If there does not exist a next greater element, then the next greater element for that element is `-1`.  
For example, the next greater element of the last element is always `-1`.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [1, 3, 2, 4]`  
**Output**:  
`[3, 4, 4, -1]`  
**Explanation**:  
The next greater element to 1 is 3, for 3 it is 4, for 2 it is 4, and for 4 it is -1.

---

### Example 2:
**Input**:  
`arr[] = [6, 8, 0, 1, 3]`  
**Output**:  
`[8, -1, 1, 3, -1]`  
**Explanation**:  
The next greater element to 6 is 8, for 8 it is -1, for 0 it is 1, for 1 it is 3, and for 3 it is -1.

---

### Example 3:
**Input**:  
`arr[] = [10, 20, 30, 50]`  
**Output**:  
`[20, 30, 50, -1]`  
**Explanation**:  
For a sorted array, the next element is the next greater element except for the last element.

---

### Example 4:
**Input**:  
`arr[] = [50, 40, 30, 10]`  
**Output**:  
`[-1, -1, -1, -1]`  
**Explanation**:  
There is no greater element for any of the elements in the array, so all are -1.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`
- `0 ≤ arr[i] ≤ 10^9`

---

## Approach
1. **Use a Stack**:
   - Traverse the array from right to left.
   - For each element, pop elements from the stack until you find a greater element or the stack is empty.
   - The top of the stack (if any) is the next greater element; if the stack is empty, the next greater element is `-1`.
   - Push the current element onto the stack.

2. **Time Complexity**:
   - Each element is pushed and popped at most once, so the overall time complexity