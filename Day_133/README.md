# Minimum Platforms

## Problem Statement
Given arrival `arr[]` and departure `dep[]` times of trains on the same day, find the minimum number of platforms needed so that no train waits. A platform cannot serve two trains at the same time; if a train arrives before another departs, an extra platform is needed.

**Note:** Time intervals are in the 24-hour format (HHMM), where the first two characters represent hour (between 00 to 23) and the last two characters represent minutes (this will be ≤ 59 and ≥ 0). Leading zeros for hours less than 10 are optional (e.g., 0900 is the same as 900).

---

## Examples

### Example 1:
**Input:**  
`arr[] = [900, 940, 950, 1100, 1500, 1800]`  
`dep[] = [910, 1200, 1120, 1130, 1900, 2000]`  
**Output:**  
`3`  
**Explanation:**  
There are three trains during the time 9:40 to 12:00. So we need a minimum of 3 platforms.

---

### Example 2:
**Input:**  
`arr[] = [900, 1235, 1100]`  
`dep[] = [1000, 1240, 1200]`  
**Output:**  
`1`  
**Explanation:**  
All train times are mutually exclusive. So we need only one platform.

---

### Example 3:
**Input:**  
`arr[] = [1000, 935, 1100]`  
`dep[] = [1200, 1240, 1130]`  
**Output:**  
`3`  
**Explanation:**  
All 3 trains have to be there from 11:00 to 11:30.

---

## Constraints
- `1 ≤ number of trains ≤ 50000`
- `0000 ≤ arr[i] ≤ dep[i] ≤ 2359`

---

## Approach

1. **Sort both arrival and departure arrays.**
2. Use two pointers to traverse both arrays:
   - If the next train arrives before the earliest departure, increment platform count.
   - If the next train departs before the next arrival, decrement platform count.
   - Track the maximum platforms needed at any time.
3. The answer is the maximum number of platforms needed at any time.