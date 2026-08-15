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
