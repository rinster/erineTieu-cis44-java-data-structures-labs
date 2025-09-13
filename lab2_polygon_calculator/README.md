# Polygons - Java Shapes Project

## 🎯 Goals
- Practice **interfaces** and **inheritance** in Java.
- Create a simple hierarchy of geometric shapes:
  - `Polygon` (interface)
  - `Quadrilateral` (base class implementing `Polygon`)
  - `Rectangle` (extends `Quadrilateral`)
  - `Square` (extends `Rectangle`)
- Implement **area**, **perimeter**, and a simple `draw()` method.
- Learn how to structure a Java project into multiple files (and optionally, packages).

---

## 🛠️ Steps to Run

### 1. Clone or download the project `cd` into the root folder `erineTieu-cis44-java-data-structures-labs`
```
. <----------- erineTieu-cis44-java-data-structures-labs
├── PolygonCalculator.class
├── PolygonCalculator.java
├── README.md
└── shapes
    ├── EquilateralTriangle.class
    ├── EquilateralTriangle.java
    ├── Hexagon.class
    ├── Hexagon.java
    ├── IsoscelesTriangle.class
    ├── IsoscelesTriangle.java
    ├── Octagon.class
    ├── Octagon.java
    ├── Pentagon.class
    ├── Pentagon.java
    ├── Polygon.class
    ├── Polygon.java
    ├── Quadrilateral.class
    ├── Quadrilateral.java
    ├── Rectangle.class
    ├── Rectangle.java
    ├── Square.class
    ├── Square.java
    ├── Triangle.class
    └── Triangle.java
```

### 2.  Run in your command line:
```
javac lab2_polygon_calculator/*.java lab2_polygon_calculator/shapes/*.java
java lab2_polygon_calculator.PolygonCalculator 
```