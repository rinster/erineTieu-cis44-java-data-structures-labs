# Lab 6 Code Syntax
## 📘 Objective
Implement a Java program that uses a **stack** to check whether symbols in a line of code are **balanced**.  
The checker ensures that every opening bracket `(` `{` `[` has a matching closing bracket `)` `}` `]`.

---

## ⚙️ Description
The `SyntaxChecker` class uses a stack to:
- Push opening symbols onto the stack.
- Pop and verify matching closing symbols.
- Return `true` if all symbols are properly balanced and `false` otherwise.

Only the following symbols are checked:  
`( ) { } [ ]`

---

## 💻 Compile and Run

### Compile
```bash
javac lab6_code_syntax/*.java
java lab6_code_syntax.SyntaxChecker 