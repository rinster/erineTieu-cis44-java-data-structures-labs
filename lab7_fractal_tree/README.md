# 🌳 Fractal Tree Visualization (Java Swing)

This project visualizes a **recursive fractal tree** using Java Swing.  
Each branch splits into two smaller branches, demonstrating **recursion**, **graphics programming**, and optionally **animation** with random colors and angles.

---

## 🧩 Features

- Recursive tree drawing using Java’s `Graphics` API  
- Adjustable maximum depth (controls complexity)  

---

## 🖼️ Preview

The tree starts from the bottom center and branches upward recursively.  
Each level of recursion produces two smaller branches, forming a fractal-like pattern.  

---

## 🧠 How It Works

1. **Recursion**:
   - Each call to `drawTree()` draws a single branch.
   - It then calls itself twice — once for the left branch and once for the right branch.
2. **Base Case**:
   - When `depth == 0`, the recursion stops.
3. **Branch Calculation**:
   - Uses trigonometry to find end coordinates:
     ```java
     x2 = x1 + length * Math.cos(Math.toRadians(angle));
     y2 = y1 + length * Math.sin(Math.toRadians(angle));
     ```
---

## 🧰 Requirements

- **Java Development Kit (JDK)** 8 or higher
- A text editor or IDE (like IntelliJ, VS Code, or Eclipse)

---

## 🏗️ How to Compile and Run

```bash
javac ./lab7_fractal_tree/FractalTree.java
java lab7_fractal_tree.FractalTree

---
