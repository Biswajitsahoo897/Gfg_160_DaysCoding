# Min Cost Climbing Stairs

## Problem Statement

You are given an integer array `cost` where `cost[i]` is the cost of the `i`-th step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can start from either the step with index 0 or the step with index 1.

Return the *minimum cost to reach the top of the floor*. The top of the floor is considered to be one step beyond the last element of the `cost` array.

---

## Examples

### Example 1:
**Input:**
`cost[] = {10, 15, 20}`
**Output:**
`15`
**Explanation:**
The cheapest way is to start at `cost[1]`, pay the cost of 15, and climb two steps to reach the top.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/708151/Web/Other/blobid1_1741612335.png" width=50%>

---

### Example 2:
**Input:**
`cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}`
**Output:**
`6`
**Explanation:**
The cheapest option is to start on `cost[0]`, and only step on the 1s, skipping the 100s. The path would be indices 0 -> 2 -> 3 -> 4 -> 6 -> 7 -> 9 -> top. The total cost is `1 + 1 + 1 + 1 + 1 + 1 = 6`.

<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/708151/Web/Other/blobid0_1741612208.png" width=50%>

---

## Constraints

- `2 ≤ cost.length ≤ 10^5`
- `0 ≤ cost[i] ≤ 999`

---

## Approach

This problem can be solved efficiently using dynamic programming. The core idea is to determine the minimum cost to reach each step by building upon the solutions for the previous steps.

Let `dp[i]` be the minimum cost to reach the `i`-th step. To arrive at step `i`, we must have come from either step `i-1` or step `i-2`. The cost to land on step `i` is `cost[i]`. Therefore, the total minimum cost to reach step `i` is `cost[i]` plus the minimum of the costs to reach the two preceding steps.

This gives us the recurrence relation:
`dp[i] = cost[i] + min(dp[i-1], dp[i-2])`
