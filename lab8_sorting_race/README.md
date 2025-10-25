# 🏁 Lab 8 – The Sorting Race  

## Overview
This project demonstrates and compares the performance of three sorting algorithms — **Selection Sort**, **Insertion Sort**, and **Merge Sort** — through empirical testing. Each algorithm was implemented in Java and timed under three conditions: **best case (sorted array)**, **average case (random array)**, and **worst case (reverse-sorted array)**.  

The results confirm the theoretical complexities:

- **Selection Sort:** O(n²) across all cases  
- **Insertion Sort:** O(n) best case, O(n²) average/worst  
- **Merge Sort:** O(n log n) consistently  

---

## Files
- `SortingAlgorithms.java` – Contains implementations of the three sorting algorithms.  
- `SortingTester.java` – Generates test data, runs each algorithm, and measures execution times.  

---

## How to Compile and Run

1. Open a terminal in the project directory.  
2. Compile all Java files:
    ```bash
    javac lab8_sorting_race/*.java
    ```
3. Run the tester:
    ```bash
    java lab8_sorting_race.SortingTester
    ```
4. The program will print timing results for all sorting algorithms and array sizes.




