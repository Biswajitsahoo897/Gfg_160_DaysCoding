# Aggressive Cows

## Problem Statement
You are given an array with unique elements `stalls[]`, which denote the position of a stall. You are also given an integer `k` which denotes the number of aggressive cows. Your task is to assign stalls to `k` cows such that the minimum distance between any two of them is the maximum possible.

---

## Examples

### Example 1:
**Input**:  
`stalls[] = [1, 2, 4, 8, 9], k = 3`  
**Output**:  
`3`  
**Explanation**:  
The first cow can be placed at `stalls[0]`, the second cow can be placed at `stalls[2]`, and the third cow can be placed at `stalls[3]`.  
The minimum distance between cows, in this case, is `3`, which is the largest among all possible ways.

---

### Example 2:
**Input**:  
`stalls[] = [10, 1, 2, 7, 5], k = 3`  
**Output**:  
`4`  
**Explanation**:  
The first cow can be placed at `stalls[0]`, the second cow can be placed at `stalls[1]`, and the third cow can be placed at `stalls[4]`.  
The minimum distance between cows, in this case, is `4`, which is the largest among all possible ways.

---

### Example 3:
**Input**:  
`stalls[] = [2, 12, 11, 3, 26, 7], k = 5`  
**Output**:  
`1`  
**Explanation**:  
Each cow can be placed in any of the stalls, as the number of stalls is exactly equal to the number of cows.  
The minimum distance between cows, in this case, is `1`, which is the largest among all possible ways.

---

## Constraints
- `2 ≤ stalls.size() ≤ 10^6`
- `0 ≤ stalls[i] ≤ 10^8`
- `2 ≤ k ≤ stalls.size()`

---

## Approach
1. **Sorting**:  
   - Sort the `stalls[]` array to arrange the stall positions in ascending order.

2. **Binary Search**:  
   - Use binary search to find the maximum minimum distance between cows.
   - The search range is between `1` (minimum possible distance) and `stalls[n-1] - stalls[0]` (maximum possible distance).

3. **Placement Check**:  
   - For a given distance `mid`, check if it is possible to place `k` cows such that the minimum distance between any two cows is at least `mid`.
   - If possible, update the result and search for a larger distance.
   - Otherwise, search for a smaller distance.

4. **Return Result**:  
   - The result is the largest minimum distance for which placement is possible.

---

## Complexity
- **Time Complexity**:  
  - Sorting: `O(n log n)`  
  - Binary Search: `O(log(max_distance) * n)`  
  - Total: `O(n log n + log(max_distance) * n)`  
- **Space Complexity**: `O(1)` (no extra space used).

---

## Tags
- Array
- Binary Search
- Greedy Algorithm
- Medium Difficulty