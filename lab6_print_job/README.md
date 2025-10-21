# 🖨️ Lab Project 2 – Print Job Simulator

## 📘 Objective
Simulate a printer queue system using the **FIFO (First-In, First-Out)** principle.  
This project demonstrates how an operating system manages print jobs using a **Queue** data structure.

---

## ⚙️ Description
The program consists of:
- **PrintJob** – Stores a document name and page count.  
- **Printer** – Manages a queue of print jobs using `LinkedQueue`.  
- **LinkedQueue** – Implements a simple linked list–based queue.  

Each new job is added to the rear of the queue, and the printer processes jobs from the front.

---

### 💻 Compile & Run
```bash
javac lab6_print_job/*.java
java lab6_print_job.Printer 
