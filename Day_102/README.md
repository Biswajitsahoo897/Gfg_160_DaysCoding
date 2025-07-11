# Stock Span Problem

## Problem Statement
The stock span problem is a financial problem where we have a series of daily price quotes for a stock and we need to calculate the span of stock price for all days.  
The span `arr[i]` of the stock's price on a given day `i` is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the given day is less than or equal to its price on the current day.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [100, 80, 60, 70, 60, 75, 85]`  
**Output**:  
`[1, 1, 1, 2, 1, 4, 6]`  
**Explanation**:  
- 100: span is 1 (no previous greater)
- 80: span is 1
- 60: span is 1
- 70: span is 2 (includes 60)
- 60: span is 1
- 75: span is 4 (includes 60, 70, 60)
- 85: span is 6 (includes all previous except 100)

---

### Example 2:
**Input**:  
`arr[] = [10, 4, 5, 90, 120, 80]`  
**Output**:  
`[1, 1, 2, 4, 5, 1]`  
**Explanation**:  
- 10: span is 1
- 4: span is 1
- 5: span is 2 (includes 4)
- 90: span is 4 (includes 5, 4, 10)
- 120: span is 5 (includes 90, 5, 4, 10)
- 80: span is 1

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^5`

---
