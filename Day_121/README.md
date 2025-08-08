# Coin Change (Minimum Coins)

## Problem Statement
You are given an array `coins[]`, where each element represents a coin of a different denomination, and a target value `sum`.  
You have an unlimited supply of each coin type.  
The task is to determine the **minimum number of coins** needed to obtain the target sum.  
If it is not possible to form the sum, return `-1`.

---

## Examples

**Input:**  
coins = [25, 10, 5], sum = 30  
**Output:** 2  
**Explanation:** 25 + 5 = 30  

**Input:**  
coins = [4, 6, 2], sum = 5  
**Output:** -1  
**Explanation:** Cannot form 5 using given coins.  

---

## Constraints
- `1 ≤ sum * coins.size() ≤ 10^6`
- `0 ≤ sum ≤ 10^4`
- `1 ≤ coins[i] ≤ 10^4`
- `1 ≤ coins.size() ≤ 10^3`

---

## Approach
- Use **Dynamic Programming** with a 1D `dp` array.
- `dp[i]` stores the minimum number of coins to make sum `i`.
- Initialize `dp[0] = 0` and all others to infinity.
- For each coin, update all sums `i >= coin`
