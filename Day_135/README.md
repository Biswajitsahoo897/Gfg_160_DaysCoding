# Job Sequencing Problem

## Problem Statement
You are given two arrays: `deadline[]` and `profit[]`, which represent a set of jobs. Each job is associated with a deadline and a profit. Each job takes 1 unit of time to complete, and only one job can be scheduled at a time. You will earn the profit associated with a job only if it is completed by its deadline.

Your task is to find:
- The maximum number of jobs that can be completed within their deadlines.
- The total maximum profit earned by completing those jobs.

---

## Examples

### Example 1:
**Input:**  
`deadline[] = [4, 1, 1, 1]`  
`profit[] = [20, 10, 40, 30]`  
**Output:**  
`[2, 60]`  
**Explanation:**  
Job1 and Job3 can be done with maximum profit of 60 (20+40).

---

### Example 2:
**Input:**  
`deadline[] = [2, 1, 2, 1, 1]`  
`profit[] = [100, 19, 27, 25, 15]`  
**Output:**  
`[2, 127]`  
**Explanation:**  
Job1 and Job3 can be done with maximum profit of 127 (100+27).

---

### Example 3:
**Input:**  
`deadline[] = [3, 1, 2, 2]`  
`profit[] = [50, 10, 20, 30]`  
**Output:**  
`[3, 100]`  
**Explanation:**  
Job1, Job3 and Job4 can be completed with a maximum profit of 100 (50 + 20 + 30).

---

## Constraints
- `1 ≤ deadline.size() = profit.size() ≤ 10^5`
- `1 ≤ deadline[i] ≤ deadline.size()`
- `1 ≤ profit[i] ≤ 500`

---

## Approach

1. **Sort Jobs by Profit (Descending):**
   - Pair each job's deadline and profit.
   - Sort jobs in descending order of profit.

2. **Schedule Jobs Greedily:**
   - For each job, try to schedule it in the latest available slot before its deadline.
   - Use a time slot array or a disjoint set to efficiently find free slots.

3. **Count and Sum:**
   - Track the number of jobs scheduled and the total profit.

4. **Time Complexity:**
   - O(n log n) for sorting, O(n * d) for scheduling (can be