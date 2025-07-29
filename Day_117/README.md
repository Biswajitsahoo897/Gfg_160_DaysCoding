# Ways to Reach the n'th Stair

## Problem Statement

There are `n` stairs, and a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Your task is to count the number of ways the person can reach the top. The order of the steps matters.

---

## Examples

### Example 1:
**Input:**  
`n = 1`  
**Output:**  
`1`  
**Explanation:**  
There is only one way to climb 1 stair: {1}.

---

### Example 2:
**Input:**  
`n = 2`  
**Output:**  
`2`  
**Explanation:**  
There are 2 ways to reach the 2nd stair: {1, 1} and {2}.

---

### Example 3:
**Input:**  
`n = 4`  
**Output:**  
`5`  
**Explanation:**  
There are five ways to reach the 4th stair: {1, 1, 1, 1}, {1, 1, 2}, {1, 2, 1}, {2, 1, 1}, and {2, 2}.

---

## Constraints

- `1 ≤ n ≤ 44`
  
---

## Approach

This problem is a classic example of dynamic programming and is closely related to the Fibonacci sequence.

Let `ways(n)` be the number of ways to reach the `n`-th stair. To reach the `n`-th stair, the final step must be either a single step from the `(n-1)`-th stair or a double step from the `(n-2)`-th stair.

Therefore, the total number of ways to reach the `n`-th stair is the sum of the ways to reach the `(n-1)`-th stair and the ways to reach the `(n-2)`-th stair.

This gives us the recurrence relation:
`ways(n) = ways(n-1) + ways(n-2)`

### Complexity Analysis
- **Time Complexity:** O(n), as we iterate from 1 to `n`.
- **Space Complexity:** O(1), as we only use a few variables to store the previous two states.
