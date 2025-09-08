# Maximize Partitions in a String

## Problem Statement
Given a string `s` of lowercase English alphabets, your task is to return the maximum number of substrings formed, after possible partitions (possibly zero) of `s` such that no two substrings have a common character.

---

## Examples

### Example 1:
**Input:**  
`s = "acbbcc"`  
**Output:**  
`2`  
**Explanation:**  
"a" and "cbbcc" are two substrings that do not share any characters between them.

---

### Example 2:
**Input:**  
`s = "ababcbacadefegdehijhklij"`  
**Output:**  
`3`  
**Explanation:**  
Partitioning at index 8 and 15 produces three substrings: `"ababcbaca"`, `"defegde"`, and `"hijhklij"` such that none of them have a common character.

---

### Example 3:
**Input:**  
`s = "aaa"`  
**Output:**  
`1`  
**Explanation:**  
Since the string consists of the same character, no further partition can be performed. The whole string is considered as one substring.

---

## Constraints
- `1 ≤ s.size() ≤ 10^5`
- `'a' ≤ s[i] ≤ 'z'`

---

## Approach

1. **Track Last Occurrence:**  
   - For each character, record its last occurrence index in the string.

2. **Greedy Partitioning:**  
   - Iterate through the string, maintaining the farthest last occurrence of any character seen so far.
   - When the current index matches the farthest last occurrence, partition the string.
   - Count the number of such partitions.

3. **Time Complexity:**  
   - O(n), where n is the length