# 🧰 Game Inventory System with Combine Feature (Java + Iterators)

## 📂 Project: `lab5_game_inventory_mgmt_Iterators`

A simple Java-based inventory management system for a text-based adventure game. This project demonstrates:

- Object-oriented programming (`Item` and `Inventory` classes)
- Safe list modification using **Java Iterators**
- A `combine` feature to merge two items into one (e.g., `stick + flint → torch`)

---

## ✨ Features

- ✅ Add items to inventory
- ✅ Display current inventory
- ✅ Combine two items into a new one
- ✅ Uses `Iterator` to safely remove items from a list
- ❌ Prevents combining if required items are missing

---

## 📁 Project Structure

```
lab5_game_inventory_mgmt_Iterators/
├── Item.java // Represents an inventory item
├── Inventory.java // Holds and manages inventory
└── Main.java // Contains the main() method
```

## 🛠️ How to Compile and Run

> **Requires:** Java JDK (8 or higher)

```bash
javac ./lab5_game_inventory_mgmt_Iterators/*.java
java ./lab5_game_inventory_mgmt_Iterators/Main.java
```

## Example Output
```
Inventory:
- stick
- flint
- rope
Combined 'stick' and 'flint' into 'torch'
Inventory:
- rope
- torch
Cannot combine. You need both 'rope' and 'stick' in inventory.
Inventory:
- rope
- torch

```

