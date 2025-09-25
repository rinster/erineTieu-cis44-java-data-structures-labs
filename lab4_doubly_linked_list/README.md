# Doubly Linked List - Text Editor History

### Project 2: Doubly Linked List
#### 🎯 Goal
The goal of this project is to implement a simple text editor that supports **typing, undo, and redo** using a **doubly linked list** to manage the document history. Each node in the list represents a snapshot of the text at a given point in time.  

Key features:
- **Add text** → Creates a new state in the history.
- **Undo** → Moves back to the previous state.
- **Redo** → Moves forward to the next state (if available).
- **Clear redo history** → If new text is added after undoing, all redo history is discarded.

---

#### 📂 Project Structure
```
lab4_doubly_linked_list/
│
├── TextEditor.java # Core class with linked list logic
├── Main.java # Menu-driven application to test functionality
└── README.md # Project documentation
```

- `TextEditor.java`  
  Contains the `TextEditor` class and its inner `Node` class, along with the methods `add`, `undo`, `redo`, and `printCurrent`.

- `Main.java`  
  Provides a simple interface for interacting with the text editor.

---

#### ⚙️ How to Compile and Run
Open a terminal in the project root and run:
```
javac lab4_doubly_linked_list/*.java
java lab4_doubly_linked_list.Main
```