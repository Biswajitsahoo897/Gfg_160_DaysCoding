# Stock Buy and Sell – Max 2 Transactions Allowed

## Problem Statement
In daily share trading, a trader buys shares and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, find out the maximum profit that a share trader could have made.

You are given an array `prices[]` representing stock prices throughout the day. Note that the second transaction can only start after the first one is complete (buy→sell→buy→sell).

---

## Examples

### Example 1:
**Input:**  
`prices[] = [10, 22, 5, 75, 65, 80]`  
**Output:**  
`87`  
**Explanation:**  
- Trader buys at 10 and sells at 22.  
  Profit from 1st transaction = 22 - 10 = 12.  
- Then buys at 5 and sells at 80.  
  Profit from 2nd transaction = 80 - 5 = 75.  
- Total profit = 12 + 75 = 87.

---

### Example 2:
**Input:**  
`prices[] = [2, 30, 15, 10, 8, 25, 80]`  
**Output:**  
`100`  
**Explanation:**  
- Trader buys at 2 and sells at 30.  
  Profit from 1st transaction = 30 - 2 = 28.  
- Then buys at 8 and sells at 80.  
  Profit from 2nd transaction = 80 - 8 = 72.  
- Total profit = 28 + 72 = 100.

---

## Constraints
- `1 ≤ prices.size() ≤ 10^5`
- `1 ≤ prices[i] ≤ 10^5`

---

## Approach

1. **Dynamic Programming (DP):**
   - Use two arrays to keep track of the maximum profit up to each day (from the left) and from each day to the end (from the right).
   - For each day, calculate the sum of the maximum profit from the left and right arrays.
   - The answer is the maximum sum found, representing the best combination of two transactions.

2. **Time Complexity:**
   - O(n), where n is the number of days.

---