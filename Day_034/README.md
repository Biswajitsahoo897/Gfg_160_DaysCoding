# Allocate Minimum Pages

## Problem Statement
You are given an array `arr[]` of integers, where each element `arr[i]` represents the number of pages in the `i-th` book. You also have an integer `k` representing the number of students. The task is to allocate books to each student such that:

1. Each student receives at least one book.
2. Each student is assigned a contiguous sequence of books.
3. No book is assigned to more than one student.

The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.

**Note**: Return `-1` if a valid assignment is not possible, and the allotment should be in contiguous order.

---

## Examples

### Example 1:
**Input**:  
`arr[] = [12, 34, 67, 90], k = 2`  
**Output**:  
`113`  
**Explanation**:  
Allocation can be done in the following ways:  
- `[12]` and `[34, 67, 90]` → Maximum Pages = `191`  
- `[12, 34]` and `[67, 90]` → Maximum Pages = `157`  
- `[12, 34, 67]` and `[90]` → Maximum Pages = `113`  

The minimum of these cases is `113`, which is selected as the output.

---

### Example 2:
**Input**:  
`arr[] = [15, 17, 20], k = 5`  
**Output**:  
`-1`  
**Explanation**:  
Allocation cannot be done as there are more students than books.

---

### Example 3:
**Input**:  
`arr[] = [22, 23, 67], k = 1`  
**Output**:  
`112`  
**Explanation**:  
All books are assigned to one student, so the total pages are `112`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`
- `1 ≤ arr[i] ≤ 10^3`
- `1 ≤ k ≤ 10^3`

---

## Approach
1. **Binary Search on Maximum Pages**:  
   - Use binary search to find the minimum possible maximum pages that can be allocated to any student.
   - The search range is between `max(arr)` (minimum possible maximum pages) and `sum(arr)` (maximum possible maximum pages).

2. **Feasibility Check**:  
   - For a given maximum page limit, check if it is possible to allocate books to `k` students such that no student gets more than the given limit.
   - Traverse the array and allocate books to students while ensuring the page limit is not exceeded.

3. **Edge Cases**:  
   - If `k > arr.size()`, return `-1` as allocation is not possible.

---

## Complexity
- **Time Complexity**:  
  - Binary Search: `O(log(sum(arr) - max(arr)))`  
  - Feasibility Check: `O(n)` for each binary search iteration.  
  - Total: `O(n * log(sum(arr) - max(arr)))`  
- **Space Complexity**: `O(1)` (no extra space used).

---

## Tags
- Array
- Binary Search
- Greedy Algorithm
- Medium Difficulty