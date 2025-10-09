# Alien Dictionary
---

## Problem Statement

A new alien language uses the English alphabet, but the order of letters is unknown. You are given a list of `words[]` from the alien language’s dictionary, where the words are claimed to be sorted lexicographically according to the language’s rules.

Your task is to determine the **correct order of letters** in this alien language based on the given words.

If the order is valid, return a string containing the **unique letters** in lexicographically increasing order as per the new language's rules.  
If there are **multiple valid orders**, return **any one** of them.

However, if the given arrangement of words is **inconsistent** with any possible letter ordering, return an **empty string (`""`)**.

---

## Lexicographic Rule

A string `a` is lexicographically smaller than a string `b` if, at the first position where they differ,  
the character in `a` appears **earlier** in the alien language than the corresponding character in `b`.

If all characters in the shorter word match the beginning of the longer word,  
the **shorter word** is considered smaller.

---

## Note

Your implementation will be tested using a driver code.  
It will print `true` if your returned order correctly follows the alien language’s lexicographic rules; otherwise, it will print `false`.

---

## 💡 Examples

### Example 1

**Input: words[] = ["baa", "abcd", "abca", "cab", "cad"]**
**Output: true**
**Explanation:**
A possible correct order of letters in the alien dictionary is "bdac".

The pairs give the following relations:
- `"baa" → "abcd" → 'b' appears before 'a'`
- `"abcd" → "abca" → 'd' appears before 'a'`
- `"abca" → "cab"  → 'a' appears before 'c'`
- `"cab"  → "cad"  → 'b' appears before 'd'`

- Hence, the valid order is **b → d → a → c**.
---

### Example 2

**Input:** words[] = ["caa", "aaa", "aab"]  
**Output:** true  
**Explanation:**  
A possible correct order of letters in the alien dictionary is "cab".

The pairs give the following relations:  
- `"caa" → "aaa" → 'c' appears before 'a'`  
- `"aaa" → "aab" → 'a' appears before 'b'`

Hence, the valid order is **c → a → b**.

---

### Example 3

**Input:** words[] = ["ab", "cd", "ef", "ad"]  
**Output:** ""  
**Explanation:**  
No valid ordering of letters is possible.

The pairs give the following relations:  
- `"ab" → "ef" → 'a' appears before 'e'`  
- `"ef" → "ad" → 'e' appears before 'a'`

This creates a **contradiction**, so **no valid order exists**.

---

## Constraints

- `1 ≤ words.length ≤ 500`
- `1 ≤ words[i].length ≤ 100`

- words[i] consists only of lowercase English letters.