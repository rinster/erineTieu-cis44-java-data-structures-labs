# 🐻🐟 Ecosystem Simulation

## 📌 Goals
The purpose is to simulate a simple **ecosystem** using a one-dimensional array called `river`.  
The ecosystem contains two species of animals:

- **Bear (B)**
- **Fish (F)**

Each animal can move left, right, or stay in place at every time step.  
The simulation rules:

- **Bear + Fish** → Bear eats Fish  
- **Fish + Bear** → Bear survives, Fish is removed  
- **Bear + Bear** → Another Bear populates
- **Fish + Fish** → Another Fish is populated
- **Empty spaces** are represented by `-`  
- Animals cannot move outside the river bounds  

---
### ▶️  Compile and Run the Code
```
javac lab2_ecosystem_simulation/*.java
java lab2_ecosystem_simulation.Ecosystem
```

**Visualization**  
   - Prints the river after each step.  
   - Example output:  

     ```
     -B--F---F-B---F---
     --B-F----B----F---
     ```