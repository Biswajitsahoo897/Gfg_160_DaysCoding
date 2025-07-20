# Longest Increasing Subsequence

## Problem Statement

Given an array `arr[]` of non-negative integers, the task is to find the length of the **Longest Strictly Increasing Subsequence (LIS)**.

A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. A subsequence is **strictly increasing** if each element in the subsequence is strictly less than the next element.

---

## Input

- `arr[]`: An array of non-negative integers.

## Output

- An integer representing the length of the longest strictly increasing subsequence.

---

## Constraints

- `1 ≤ arr.size() ≤ 10^3`
- `0 ≤ arr[i] ≤ 10^6`

---

## Examples

### Example 1

**Input**: `arr[] = [5, 8, 3, 7, 9, 1]`  
**Output**: `3`  
**Explanation**: The longest strictly increasing subsequence could be `[5, 7, 9]`, which has a length of 3.

### Example 2

**Input**: `arr[] = [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15]`  
**Output**: `6`  
**Explanation**: One of the possible longest strictly increasing subsequences is `[0, 2, 6, 9, 13, 15]`, which has a length of 6.

### Example 3

**Input**: `arr[] = [3, 10, 2, 1, 20]`  
**Output**: `3`  
**Explanation**: The longest strictly increasing subsequence could be `[3, 10, 20]`, which has a length of 3.

---

## Approaches

### Approach 1: Dynamic Programming

This is a classic dynamic programming approach. We define `dp[i]` as the length of the LIS ending at index `i`.

#### Algorithm:
1.  Initialize a `dp` array of the same size as the input array, with all values set to `1`.
2.  Iterate through the array from the second element (`i = 1` to `n-1`).
3.  For each element `arr[i]`, iterate through all previous elements (`j = 0` to `i-1`).
4.  If `arr[i] > arr[j]`, it means we can extend the increasing subsequence ending at `j`. We update `dp[i]` with `max(dp[i], 1 + dp[j])`.
5.  The length of the LIS is the maximum value in the `dp` array.

#### Complexity:
- **Time**: `O(n^2)` due to the nested loops.
- **Space**: `O(n)` to store the `dp` array.

---

### Approach 2: Binary Search (Patience Sorting)

A more efficient approach that finds the LIS in `O(n log n)` time. This method maintains an auxiliary array (e.g., `tails`) that stores the smallest tail of all increasing subsequences of a given length.

#### Algorithm:
1.  Initialize an empty list or array called `tails`.
2.  Iterate through each number `num` in the input array `arr`.
3.  For each `num`:
    - If `tails` is empty or `num` is greater than the last element in `tails`, append `num` to `tails`. This extends the current longest subsequence.
    - Otherwise, find the smallest element in `tails` that is greater than or equal to `num` and replace it with `num`. This can be done efficiently using binary search. This step is crucial because it creates a potential for a longer subsequence later on with a smaller tail.
4.  The final length of the `tails` array is the length of the LIS.

#### Complexity:
- **Time**: `O(n log n)`, as we iterate through `n` elements, and for each element, we perform a binary search which takes `O(log n)` time.
- **Space**: `O(n)` in the worst case for the `tails` array (when the input array is already sorted).

