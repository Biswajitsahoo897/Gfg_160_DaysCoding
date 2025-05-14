# Find All Triplets with Zero Sum

## Problem Statement
Given an array `arr[]`, find all possible triplets `i, j, k` in the `arr[]` whose sum of elements equals zero.  
The returned triplets should also be internally sorted, i.e., `i < j < k`.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [0, -1, 2, -3, 1]`  
**Output**:  
`[[0, 1, 4], [2, 3, 4]]`  
**Explanation**:  
Triplets with sum `0` are:  
- `arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0`  
- `arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0`

---

### Example 2:
**Input**:  
`arr[] = [1, -2, 1, 0, 5]`  
**Output**:  
`[[0, 1, 2]]`  
**Explanation**:  
Only triplet which satisfies the condition is:  
- `arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0`

---

### Example 3:
**Input**:  
`arr[] = [2, 3, 1, 0, 5]`  
**Output**:  
`[]`  
**Explanation**:  
There is no triplet with sum `0`.

---

## Constraints
- `3 ≤ arr.size() ≤ 10^3`
- `-10^4 ≤ arr[i] ≤ 10^4`

---

## Solution

### Approach:
To solve this problem efficiently, we can use the **Two-Pointer Technique**:
1. Sort the array.
2. Fix one element (`arr[i]`) and use two pointers (`left` and `right`) to find pairs that sum up to `-arr[i]`.
3. For each triplet found, ensure it is unique and sorted.
4. Return all unique triplets.

### Complexity:
- **Time Complexity**: `O(n^2)` because we sort the array (`O(n log n)`) and then use two pointers for each element.
- **Space Complexity**: `O(1)` as we use constant extra space.

---