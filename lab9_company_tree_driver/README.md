# Company Hierarchy Tree (Lab 9)

This project demonstrates a simple **General Tree** data structure in Java using a company hierarchy as an example.  
Each node in the tree represents an employee or department, with a `GeneralTreeNode` class supporting **preorder** and **postorder** traversals.

---

## 📂 Project Structure

```
lab9_company_tree_driver/
│
├── GeneralTreeNode.java
└── CompanyTreeDriver.java
```

## 🧠 Overview

The program builds a company hierarchy tree starting from the **CEO** at the root.  
It includes departments and employees under each branch, such as *VP of Sales* and *VP of Engineering*.

### Example Hierarchy
```
CEO
│
├── VP of Sales
│ ├── Sales Manager (NA)
│ └── Sales Manager (EU)
│
└── VP of Engineering
├── Dev Team Lead
│ ├── Developer 1
│ └── Developer 2
└── QA Team Lead
```


---

## ▶️ How to Run

```
javac lab9_company_tree_driver/*.java
java lab9_company_tree_driver.CompanyTreeDriver 
```
