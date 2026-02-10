### Day 04 – Remove Duplicates from Sorted Array

**Problem:**  
Given a sorted array, remove the duplicate elements such that each element appears only once.
Return the number of unique elements and modify the array in-place.

---

### Approach 1: Bruteforce (Using HashSet)
- Create a HashSet to store unique elements
- Traverse the array and add elements to the HashSet
- Copy elements from the HashSet back into the array starting from index 0
- Return unique elements by traversal
- The size of the HashSet represents the number of unique elements

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### Approach 2: Optimized (Two Pointers)
- Since the array is sorted, duplicates appear next to each other
- Use two pointers:
  - One pointer to track the last unique element
  - Another pointer to traverse the array
- Place unique elements at the correct position in the same array
- Return the unique elements

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

**Learning:**  
Bruteforce solutions are easier to implement but consume extra space.
Optimized solutions take advantage of sorted data and improve space efficiency.
