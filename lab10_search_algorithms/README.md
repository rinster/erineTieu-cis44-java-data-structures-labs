# Lab 10 – Search Algorithms (Linear Search & Binary Search)

This project implements and compares two classic search algorithms:

- **Linear Search**  
- **Binary Search** (requires a sorted array)

Both algorithms are instrumented with a **comparison counter** to measure performance.

---

## 📁 Files in This Lab
- `SearchComparison.java` — Contains linearSearch and binarySearch implementations, plus comparison counters.

---

## 🧪 What This Program Demonstrates
### Linear Search
- Checks elements from left to right.
- Works on **any** array (sorted or unsorted).
- **Time Complexity:**
  - Best Case: `O(1)`
  - Worst Case: `O(N)`

### Binary Search
- Only works on **sorted arrays**.
- Cuts the search range in half repeatedly.
- **Time Complexity:**
  - Best Case: `O(1)`
  - Worst Case: `O(log N)`

### Comparison Example
Using the sorted array `{1, 4, 8, 9, 12, 15, 22, 30}` to find `30`:

| Algorithm       | Comparisons |
|----------------|-------------|
| Linear Search  | 8           |
| Binary Search  | 4           |

---

## 🛠️ How to Compile and Run

### **Using Terminal / Command Prompt**

#### 1. Navigate to the folder containing your file:
```bash
javac lab10_search_algorithms/*.java
java lab10_search_algorithms.SearchComparison
```
