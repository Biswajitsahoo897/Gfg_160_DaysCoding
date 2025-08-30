


# 🚀  Matrix Chain Multiplication  

## 📌 Problem Statement  
You are given an array `arr[]` which represents the dimensions of a sequence of matrices.  
The ith matrix has dimensions `(arr[i-1] × arr[i])` for i ≥ 1.  

Your task is to determine the most efficient way to multiply these matrices together.  
The efficient way is the one that involves the **least number of scalar multiplications**.  

---

## 🔍 Examples  

### Example 1  
**Input:** arr = [2, 1, 3, 4]  
**Output:** 20  
**Explanation:**  
- Possible ways:  
  - ((M1×M2)×M3) = (2×1×3) + (2×3×4) = 30  
  - (M1×(M2×M3)) = (1×3×4) + (2×1×4) = 20 ✅  
- Minimum = 20  

### Example 2  
**Input:** arr = [1, 2, 3, 4, 3]  
**Output:** 30  
**Explanation:**  
Best order: ((M1×M2)×M3)×M4  
= (1×2×3) + (1×3×4) + (1×4×3) = 30  

### Example 3  
**Input:** arr = [3, 4]  
**Output:** 0  
**Explanation:**  
Only one matrix exists → no multiplication needed.  

---

## 📌 Constraints  
- 2 ≤ arr.size() ≤ 100  
- 1 ≤ arr[i] ≤ 200  

---

## 📖 Approach  
- Use **Dynamic Programming (Bottom-Up)**.  
- Define `dp[i][j]` as the minimum number of multiplications required to multiply matrices from `i` to `j`.  
- Transition:  
