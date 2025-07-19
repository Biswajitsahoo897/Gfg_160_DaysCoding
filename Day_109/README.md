# Longest Bounded-Difference Subarray

##  Problem Statement
Given an array of positive integers `arr[]` and a non-negative integer `x`, find the **longest contiguous subarray** where the **absolute difference between any two elements is not greater than `x`**.

If there are multiple answers, return the subarray that starts from the **smallest index**.

---

##  Input
- `arr[]`: List of integers
- `x`: A non-negative integer

##  Output
- A Subarray (list of integers)

---

##  Constraints
- `1 <= arr.length <= 10^5`
- `1 <= arr[i] <= 10^9`
- `0 <= x <= 10^9`

---

##  Examples

### Example 1
**Input**:  
`arr = [8, 4, 2, 6, 7]`, `x = 4`  
**Output**:  
`[4, 2, 6]`  

**Explanation**:  
The difference between max and min in `[4, 2, 6]` is `4`, which is `≤ x`.

---

### Example 2
**Input**:  
`arr = [15, 10, 1, 2, 4, 7, 2]`, `x = 5`  
**Output**:  
`[2, 4, 7, 2]`  

**Explanation**:  
Max = 7, Min = 2 → Difference = 5, valid subarray.

---

##  Approach: Sliding Window + Deques

We use a sliding window `[start, end]` and:
- `maxDeque`: keeps track of max values in decreasing order.
- `minDeque`: keeps track of min values in increasing order.

### Steps:
1. Move `end` pointer and update deques.
2. If `max - min > x`, increment `start` and clean deques.
3. Track the **longest valid window**.

---

##  Complexity
- **Time**: O(n)
- **Space**: O(n)

---
