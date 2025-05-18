# Print Anagrams Together

## Problem Statement
Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array.

---

## Examples

### Example 1:
**Input:**  
`arr[] = ["act", "god", "cat", "dog", "tac"]`  
**Output:**  
`[["act", "cat", "tac"], ["god", "dog"]]`  
**Explanation:**  
There are 2 groups of anagrams: "god", "dog" make group 1. "act", "cat", "tac" make group 2.

---

### Example 2:
**Input:**  
`arr[] = ["no", "on", "is"]`  
**Output:**  
`[["is"], ["no", "on"]]`  
**Explanation:**  
There are 2 groups of anagrams: "is" makes group 1. "no", "on" make group 2.

---

### Example 3:
**Input:**  
`arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]`  
**Output:**  
`[["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]`  
**Explanation:**  
Group 1: "abc", "bac", and "cab" are anagrams.  
Group 2: "listen", "silent", and "enlist" are anagrams.  
Group 3: "rat", "tar", and "art" are anagrams.

---

## Constraints
- `1 ≤ arr.size() ≤ 100`
- `1 ≤ arr[i].size() ≤ 10`

---