# LRU Cache

## Problem Statement
Design a data structure that works like a LRU (Least Recently Used) Cache. Here `cap` denotes the capacity of the cache and `Q` denotes the number of queries. Queries can be of two types:

- **PUT x y:** Sets the value of the key `x` with value `y`.
- **GET x:** Gets the value of key `x` if present, else returns `-1`.

The `LRUCache` class has two methods `get()` and `put()` which are defined as follows:

- `get(key)`: Returns the value of the key if it already exists in the cache, otherwise returns `-1`.
- `put(key, value)`: If the key is already present, update its value. If not present, add the key-value pair to the cache. If the cache reaches its capacity, it should remove the least recently used item before inserting the new item.

In the constructor of the class, the capacity of the cache should be initialized.

---

## Examples

### Example 1:
**Input:**  
cap = 2, Q = 2, Queries = `[["PUT", 1, 2], ["GET", 1]]`  
**Output:**  
`[2]`  
**Explanation:**  
- Cache Size = 2  
- `["PUT", 1, 2]` will insert the key-value pair (1, 2) in the cache.
- `["GET", 1]` will print the value corresponding to Key 1, i.e., 2.

---

### Example 2:
**Input:**  
cap = 2, Q = 8, Queries = `[["PUT", 1, 2], ["PUT", 2, 3], ["PUT", 1, 5], ["PUT", 4, 5], ["PUT", 6, 7], ["GET", 4], ["PUT", 1, 2], ["GET", 3]]`  
**Output:**  
`[5, -1]`  
**Explanation:**  
- Cache Size = 2  
- `["PUT", 1, 2]` will insert the pair (1,2) in the cache.
- `["PUT", 2, 3]` will insert the pair (2,3) in the cache: 1->2, 2->3 (the most recently used one is kept at the rightmost position).
- `["PUT", 1, 5]` will replace the value of 1 from 2 to 5: 2 -> 3, 1 -> 5.
- `["PUT", 4, 5]`: 1 -> 5, 4 -> 5 (Cache size is 2, hence we delete the least recently used key-value pair).
- `["PUT", 6, 7]`: 4 -> 5, 6 -> 7.
- `["GET", 4]`: Prints 5 (The cache now looks like 6 -> 7, 4 -> 5).
- `["PUT", 1, 2]`: 4 -> 5, 1 -> 2 (Cache size is 2, hence we delete the least recently used key-value pair).
- `["GET", 3]`: No key value pair having key = 3. Hence, -1 is printed.

---

## Constraints
- `1 ≤ cap ≤ 10^3`
- `1 ≤ Q ≤ 10^5`
- `1 ≤ x, y ≤ 10^4`