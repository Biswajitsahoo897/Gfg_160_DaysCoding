# Implement Trie

## Problem Statement

Implement a `Trie` class and complete the `insert()`, `search()`, and `isPrefix()` functions for the following queries:

-   **Type 1: `(1, word)`**: Calls `insert(word)` function and inserts `word` into the Trie.
-   **Type 2: `(2, word)`**: Calls `search(word)` function and checks whether `word` exists in the Trie or not.
-   **Type 3: `(3, word)`**: Calls `isPrefix(word)` function and checks whether `word` exists as a prefix of any string in the Trie or not.

---

### Examples:

**Example 1:**

**Input:**
```
query[][] = [[1, "abcd"], [1, "abc"], [1, "bcd"], [2, "bc"], [3, "bc"], [2, "abc"]]
```

**Output:**
```
[false, true, true]
```

**Explanation:**
-   `search("bc")`: The string "bc" does not exist in the trie.
-   `isPrefix("bc")`: "bc" exists as a prefix of the word "bcd" in the trie.
-   `search("abc")`: "abc" also exists in the trie.

**Example 2:**

**Input:**
```
query[][] = [[1, "gfg"], [1, "geeks"], [3, "fg"], [3, "geek"], [2, "for"]]
```

**Output:**
```
[false, true, false]
```

**Explanation:**
-   `isPrefix("fg")`: The string "fg" is not a valid prefix.
-   `isPrefix("geek")`: "geek" is a valid prefix of the word "geeks" in the trie.
-   `search("for")`: The string "for" is not present in the trie.

---

### Constraints:

-   `1 ≤ query.size() ≤ 10^4`
-   `1 ≤ word.size() ≤ 10^3`