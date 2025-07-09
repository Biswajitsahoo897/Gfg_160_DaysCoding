# Longest Valid Parentheses

## Problem Statement

Given a string `s` consisting of opening and closing parenthesis `'('` and `')'`, find the length of the longest valid parenthesis substring.

A parenthesis string is valid if:
- For every opening parenthesis, there is a closing parenthesis.
- The closing parenthesis must be after its opening parenthesis.

## Examples

**Example 1:**

Input:  
`s = "((()"`  
Output:  
`2`  
Explanation: The longest valid parenthesis substring is `"()"`.

**Example 2:**

Input:  
`s = ")()())"`  
Output:  
`4`  
Explanation: The longest valid parenthesis substring is `"()()"`.

**Example 3:**

Input:  
`s = "())()"`  
Output:  
`2`  
Explanation: The longest valid parenthesis substring is `"()"`.

## Constraints

- 1 ≤ s.size() ≤ 10⁶  
- s consists of `'('` and `')'` only

