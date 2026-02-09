### Day 03 – Second Smallest Element in an Array

**Problem:**  
Given an array of integers, find the second smallest element in the array.  
If the second smallest element does not exist (for example, all elements are equal or array size < 2), print an appropriate message.

---

### Approach 1: Bruteforce (Sorting)
- Sort the array in ascending order
- The first element is the smallest
- Traverse from the second element onward to find the first value different from the smallest
- That value is the second smallest element

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)

---

### Approach 2: Optimized (Single Traversal)
- Maintain two variables:
  - `firstSmallest`
  - `secondSmallest`
- Traverse the array once:
  - Update `firstSmallest` when a smaller element is found
  - Update `secondSmallest` when an element is greater than `firstSmallest` but smaller than `secondSmallest`
- If `secondSmallest` remains unchanged, it means no valid second smallest element exists

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

**Learning:**  
A bruteforce solution using sorting is easy to implement but not optimal.  
The optimized approach improves efficiency by finding the second smallest element in a single traversal without extra space.
