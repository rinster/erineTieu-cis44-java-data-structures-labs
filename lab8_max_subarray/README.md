# Maximum Subarray Sum (Project 2)

## 📘 Summary
This project demonstrates how algorithm design impacts performance by solving the **Maximum Subarray Sum** problem using two approaches:

1. **Brute-Force Algorithm (O(n²))** — checks all possible subarrays using nested loops.  
2. **Kadane’s Algorithm (O(n))** — a dynamic programming approach that finds the maximum sum in a single pass.

Both algorithms are tested and timed on randomly generated arrays of varying sizes to compare their efficiency.

---

## ⚙️ Files
- `MaxSubarraySolver.java` — contains the two algorithms.  
- `SubarrayTester.java` — generates test data, runs both algorithms, and prints runtime results.

---

## 🧩 How to Compile and Run

### 1. Compile
```bash
javac ./lab8_max_subarray/*.java
java lab8_max_subarray.SubarrayTester 
