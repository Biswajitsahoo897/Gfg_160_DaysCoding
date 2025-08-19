# Stock Buy and Sell – Max K Transactions Allowed

## Problem Statement
In the stock market, a person buys a stock and sells it on some future date. You are given an array `prices[]` representing stock prices on different days and a positive integer `k`. Find out the maximum profit a person can make in at most `k` transactions.

A transaction consists of buying and subsequently selling a stock, and a new transaction can start only when the previous transaction has been completed.

---

## Examples

### Example 1:
**Input:**  
`prices[] = [10, 22, 5, 80]`, `k = 2`  
**Output:**  
`87`  
**Explanation:**  
- 1st transaction: Buy at 10 and sell at 22.  
- 2nd transaction: Buy at 5 and sell at 80.  
Total Profit will be 12 + 75 = 87.

---

### Example 2:
**Input:**  
`prices[] = [20, 580, 420, 900]`, `k = 3`  
**Output:**  
`1040`  
**Explanation:**  
- 1st transaction: Buy at 20 and sell at 580.  
- 2nd transaction: Buy at 420 and sell at 900.  
Total Profit will be 560 + 480 = 1040.

---

### Example 3:
**Input:**  
`prices[] = [100, 90, 80, 50, 25]`,  `k = 1`  
**Output:**  
`0`  
**Explanation:**  
Selling price is decreasing continuously, leading to loss. So seller cannot have any profit.

---

## Constraints
- `1 ≤ prices.length ≤ 10^3`
- `1 ≤ prices[i] ≤ 10^5`
- `1 ≤ k ≤ 100`

---

## Approach

1. **Dynamic Programming (DP):**
   - Use a DP table where `dp[t][d]` represents the maximum profit up to day `d` with at most `t` transactions.
   - For each transaction, for each day, calculate the maximum profit by either not trading or selling on that day after buying on a previous day.
   - Optimize by keeping track of the maximum value of `dp[t-1][j] - prices[j]` for all previous days `j`.

2. **Time Complexity:**
   - O(k * n), where `n` is the number of days and `k` is the number of