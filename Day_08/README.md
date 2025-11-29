# Stock Buy and Sell – Max One Transaction Allowed

## Problem Statement
Given an array `prices[]` of length `n`, representing stock prices on different days, find the maximum profit possible by performing at most one transaction (1 buy + 1 sell). You must buy before you sell. If no profit is possible, return `0`.

---

## Examples

### Example 1
**Input:**  
`prices[] = [7, 10, 1, 3, 6, 9, 2]`  
**Output:**  
`8`  
**Explanation:** Buy at price `1` (day 2) and sell at `9` (day 5). Profit = `9 - 1 = 8`.

### Example 2
**Input:**  
`prices[] = [7, 6, 4, 3, 1]`  
**Output:**  
`0`  
**Explanation:** Prices are decreasing; no profitable buy-sell pair exists.

### Example 3
**Input:**  
`prices[] = [1, 3, 6, 9, 11]`  
**Output:**  
`10`  
**Explanation:** Buy at `1` and sell at `11` for maximum profit `10`.

---

## Approach
- Scan the array once tracking the minimum price seen so far and the maximum profit achievable.
- For each price, update:
  - `minPrice = min(minPrice, price)`
  - `maxProfit = max(maxProfit, price - minPrice)`
- Time Complexity: O(n)  
- Space Complexity: O(1)

---
