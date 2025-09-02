# Word Break

## Problem Statement
You are given a string `s` and a list `dictionary[]` of words. Your task is to determine whether the string `s` can be formed by concatenating one or more words from the `dictionary[]`.

**Note:** From `dictionary[]`, any word can be taken any number of times and in any order.

---

## Examples

### Example 1:
**Input:**  
`s = "ilike"`  
`dictionary[] = ["i", "like", "gfg"]`  
**Output:**  
`true`  
**Explanation:**  
`s` can be broken down as `"i like"`.

---

### Example 2:
**Input:**  
`s = "ilikegfg"`  
`dictionary[] = ["i", "like", "man", "india", "gfg"]`  
**Output:**  
`true`  
**Explanation:**  
`s` can be broken down as `"i like gfg"`.

---

### Example 3:
**Input:**  
`s = "ilikemangoes"`  
`dictionary[] = ["i", "like", "man", "india", "gfg"]`  
**Output:**  
`false`  
**Explanation:**  
`s` cannot be formed using `dictionary[]` words.

---

## Constraints
- `1 ≤ s.size() ≤ 3000`
- `1 ≤ dictionary.size() ≤ 1000`
- `1 ≤ dictionary[i].size() ≤ 100`

---

## Approach

1. **Dynamic Programming (DP):**
   - Use a boolean DP array `dp[]` where `dp[i]` is `True` if the substring `s[0:i]` can be segmented using the dictionary.
   - Initialize `dp[0] = True` (empty string).
   - For each position `i`, check all possible words in the dictionary. If `s[i-len(word):i] == word` and `dp[i-len(word)]` is `True`, then set `dp[i] = True`.
   - The answer is `dp[len(s)]`.

2. **Time Complexity:**
   - O(n * m * k), where n = length of `s`, m = number of words in the dictionary, k = average word