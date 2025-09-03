# Activity Selection

## Problem Statement
You are given a set of activities, each with a start time and a finish time, represented by the arrays `start[]` and `finish[]`, respectively. A single person can perform only one activity at a time, meaning no two activities can overlap. Your task is to determine the maximum number of activities that a person can complete in a day.

---

## Examples

### Example 1:
**Input:**  
`start[] = [1, 3, 0, 5, 8, 5]`  
`finish[] = [2, 4, 6, 7, 9, 9]`  
**Output:**  
`4`  
**Explanation:**  
A person can perform at most four activities. The maximum set of activities that can be executed is {0, 1, 3, 4}.

---

### Example 2:
**Input:**  
`start[] = [10, 12, 20]`  
`finish[] = [20, 25, 30]`  
**Output:**  
`1`  
**Explanation:**  
A person can perform at most one activity.

---

### Example 3:
**Input:**  
`start[] = [1, 3, 2, 5]`  
`finish[] = [2, 4, 3, 6]`  
**Output:**  
`3`  
**Explanation:**  
A person can perform activities 0, 1 and 3.

---

## Constraints
- `1 ≤ start.size() = finish.size() ≤ 2*10^5`
- `0 ≤ start[i] ≤ finish[i] ≤ 10^9`

---

## Approach

1. **Sort Activities by Finish Time:**  
   - Pair each activity's start and finish time, then sort the activities by their finish times.

2. **Greedy Selection:**  
   - Select the first activity.
   - For each subsequent activity, if its start time is greater than or equal to the finish time of the last selected activity, select it.
   - Count the total number of selected activities.

3. **Time Complexity:**  
   - O(n log n) due to sorting, where n is the number of activities.