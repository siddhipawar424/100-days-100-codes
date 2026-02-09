### Day 02 – Equilibrium Index in an Array

**Problem:**  
Given an array of integers, find the equilibrium index.  
An equilibrium index is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

If no such index exists, return `-1`.

---

### Approach 1: Bruteforce
- Traverse each index of the array
- For every index:
  - Calculate sum of elements on the left
  - Calculate sum of elements on the right
- If both sums are equal, that index is the equilibrium index

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

### Approach 2: Optimized (Prefix Sum / Running Sum)
- First calculate the total sum of the array
- Maintain a running `leftSum`
- For each index:
  - Right sum = totalSum − leftSum − current element
  - If leftSum equals rightSum, equilibrium index is found
- Update leftSum after each iteration

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

**Learning:**  
Solving the problem using a bruteforce approach helps in understanding the core logic.  
The optimized solution improves performance by avoiding repeated calculations using prefix sums.
