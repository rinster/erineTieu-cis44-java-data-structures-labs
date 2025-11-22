# 📘 Lab 12 – Simple Sorting Algorithms (Bubble Sort & Insertion Sort)

This lab implements two **O(n²)** sorting algorithms—**Bubble Sort** and **Insertion Sort**—using Java generics and the `Comparator` interface. A driver program is included to test the sorting methods on multiple types of input arrays.

---

## 🔍 Overview

You will implement:

### ✔ bubbleSort
An optimized Bubble Sort that stops early when no swaps occur during a pass.

- **Best case:** O(n) (already sorted)  
- **Worst case:** O(n²)  
- Uses a `swapped` flag for early termination  
- Compares elements using a generic `Comparator`

### ✔ insertionSort
A standard Insertion Sort that shifts elements right until the correct insertion point is found.

- **Best case:** O(n) (already sorted)  
- **Worst case:** O(n²)  
- Mimics sorting a hand of playing cards  
- Uses the same generic `Comparator`

Both sorting methods are defined as **static generic methods**, allowing them to work with any data type.

---

## 📁 Files Included

### 1. SimpleSorters.java

Contains the implementations of:

- `public static <K> void bubbleSort(K[] S, Comparator<K> comp)`  
- `public static <K> void insertionSort(K[] S, Comparator<K> comp)`  

These methods sort the array **in place**.

### 2. SimpleSortDriver.java

A driver program that:

- Creates test arrays  
- Prints their contents before and after sorting  
- Tests both algorithms on three scenarios:  
  - **Unsorted array**  
  - **Reverse-sorted array** (worst-case for Insertion Sort)  
  - **Already-sorted array** (best-case for both algorithms)  

This verifies correctness and demonstrates performance behavior discussed in lecture.

---

## ▶️ How to Run

### Compile the files:

```bash
javac lab12_simple_sorts/*.java

java lab12_simple_sorts.SimpleSortDriver 
```
