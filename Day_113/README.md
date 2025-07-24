# Longest Palindromic Subsequence

This repository contains a Java solution for finding the length of the longest palindromic subsequence in a given string.

## Problem Statement

Given a string `s`, find the length of the longest subsequence that is also a palindrome.

- A **subsequence** is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
- A **palindrome** is a sequence that reads the same backward as forward.

### Examples

**Example 1:**
- **Input:** `s = "bbabcbcab"`
- **Output:** `7`
- **Explanation:** The subsequence `"babcbab"` is the longest palindromic subsequence.

**Example 2:**
- **Input:** `s = "abcd"`
- **Output:** `1`
- **Explanation:** The longest palindromic subsequences are `"a"`, `"b"`, `"c"`, and `"d"`, all of length 1.

**Example 3:**
- **Input:** `s = "agbdba"`
- **Output:** `5`
- **Explanation:** The longest palindromic subsequence is `"abdba"`.

## Approach: Dynamic Programming

This problem exhibits optimal substructure and overlapping subproblems, making it a classic candidate for dynamic programming. We can solve it by building up a solution from smaller subproblems.
