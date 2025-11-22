# 📘 Project 2 – Divide-and-Conquer Sorts (Merge Sort & Quick Sort)

This project implements two **O(n log n)** sorting algorithms—**Merge Sort** and **Quick Sort**—using the **Divide-and-Conquer** paradigm discussed in lecture. A driver program is included to test the sorting methods on random integer arrays.

---

## 🔍 Overview

You will implement:

### ✔ **Merge Sort**
- A recursive sorting algorithm that:
  1. Divides the array into two halves  
  2. Recursively sorts each half  
  3. Merges the sorted halves back together  
- **Best/Worst/Average case:** O(n log n)  
- Requires **O(n)** additional space for merging  

### ✔ **Quick Sort**
- A recursive in-place sorting algorithm that:
  1. Chooses a pivot  
  2. Partitions the array so that elements ≤ pivot are on the left and > pivot on the right  
  3. Recursively sorts the subarrays  
- **Best/Average case:** O(n log n)  
- **Worst case:** O(n²) (e.g., already sorted with bad pivot choice)  
- Space complexity: O(log n) due to recursion  

Both sorting methods are defined as **static generic methods** using Java generics and the `Comparator` interface.

---

## 📁 Files Included

### **1. AdvancedSorters.java**

Contains:

- `public static <K> void mergeSort(K[] S, Comparator<K> comp)`  
- `private static <K> void merge(K[] S, K[] S1, K[] S2, Comparator<K> comp)`  
- `public static <K> void quickSort(K[] S, Comparator<K> comp)`  
- `private static <K> void quickSort(K[] S, Comparator<K> comp, int a, int b)`  
- `private static <K> int partition(K[] S, Comparator<K> comp, int a, int b)`  

---

### **2. AdvancedSortDriver.java**

A driver program that:

- Generates a random integer array (`N = 20` by default)  
- Prints the original array  
- Tests both **Merge Sort** and **Quick Sort**  
- Prints the sorted arrays to verify correctness  

You can increase the array size (`N`) to 100+ elements to test performance.

---

## ▶️ How to Run

### **Compile:**
```bash
javac AdvancedSorters.java AdvancedSortDriver.java
