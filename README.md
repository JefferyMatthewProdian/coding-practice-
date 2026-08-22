# Java DSA Problems Solved

## 1. Arrays

### 1. 🚩 Two Sum

**Category:** Arrays + HashMap
Used a `HashMap` to store previously seen numbers and their indices. Initially struggled to think beyond creating a mirror array, but eventually understood the `target - arr[i]` approach.

### 2. 🚩 Move Zeroes

**Category:** Arrays + Two Pointers
Used two pointers to move all zeroes to the end while maintaining the order of non-zero elements. Needed some practice understanding how the two pointers work together.

### 3. Remove Duplicates

**Category:** Arrays + Two Pointers
Solved by using array positions/pointers to remove duplicate values in-place. Focused on understanding how modifying the original array works.

### 4. Find Duplicates — Floyd's Algorithm

**Category:** Arrays + Floyd's Cycle Detection
Used Floyd's Cycle Detection algorithm to find a duplicate without using extra space. Learned how array values can be treated as pointers to detect a cycle.

### 5. Missing Number

**Category:** Arrays + Mathematical Approach
Solved by using the properties of a sequence to identify the missing number. Practiced solving the problem without relying on additional data structures.

### 6. Second Largest

**Category:** Arrays + Traversal
Solved by maintaining the largest and second-largest values during a single traversal of the array. Focused on correctly updating both values.

---

## 2. HashMap

### 7. 🚩 Count Duplicates

**Category:** HashMap + Frequency Counting
Used a `HashMap<Integer, Integer>` to store each number and its frequency. Learned the important pattern `map.put(key, map.getOrDefault(key, 0) + 1)` for counting occurrences.

### 8. First Non-Repeating Element

**Category:** HashMap + Frequency Counting
Used a `HashMap` to count the frequency of every element, then traversed the original array to find the first element with a frequency of `1`.
Applied the previously learned `getOrDefault()` frequency-counting pattern successfully.

### 9. Valid Anagram

**Category:** HashMap + Strings + Frequency Counting
Used two `HashMap<Character, Integer>` maps to count character frequencies in both strings and compare them.
Handled the edge case of different string lengths and learned how frequency comparison determines whether two strings are anagrams.

### 11. Reverse String

**Category:** Strings + Two Pointers
Used two pointers from both ends of a character array and swapped the characters while moving toward the center.
Initially struggled with achieving O(1) space, then understood how in-place swapping avoids creating another string.

### 12. Best Time to Buy and Sell Stock

**Category:** Arrays + Greedy + One-Pass Traversal
Tracked the minimum buying price seen so far and calculated the maximum possible profit at each later price.
Solved the problem in a single traversal with O(n) time and O(1) extra space.

### 13. Maximum Sum Subarray of Size K

**Category:** Arrays + Sliding Window
Used a sliding window to maintain the sum of `k` consecutive elements by removing the outgoing element and adding the incoming element.
Solved the problem in a single traversal with O(n) time and O(1) extra space.

### 15. Valid Parentheses

**Category:** Stack + HashMap
Used an `ArrayDeque` as a stack and a `HashMap` to map opening brackets to their corresponding closing brackets.
Validated brackets in O(n) time using LIFO ordering with O(n) space for the stack.

### 16. Next Greater Element

**Category:** Stack + Arrays + Monotonic Stack
Used a stack while traversing the array from right to left, removing elements that cannot be the next greater element.
Solved the problem in O(n) time with O(n) extra space using the monotonic stack pattern.
Add this as **#17**:

### 17. 🚩 Daily Temperatures

**Category:** Stack + Arrays + Monotonic Stack
Used an `ArrayDeque` as a monotonic stack while traversing the array from right to left. Stored **indices instead of temperatures** so the difference between the current index and the next warmer index could be calculated directly. Initially struggled with storing values instead of indices, then understood how index-based stacks are useful when the answer depends on distance. Solved in O(n) time and O(n) space.
