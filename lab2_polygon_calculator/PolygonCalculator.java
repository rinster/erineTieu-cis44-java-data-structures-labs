package lab2_polygon_calculator;

import java.util.Scanner;
import lab2_polygon_calculator.shapes.*;

public class PolygonCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Choose a shape (rectangle, square, pentagon, hexagon, octagon, equilateral triangle, isosceles triangle):");
        String shape = scanner.nextLine().toLowerCase();

        if (shape.equals("rectangle")) {
            System.out.println("Enter rectangle width:");
            double width = scanner.nextDouble();
            System.out.println("Enter rectangle height:");
            double height = scanner.nextDouble();
            Rectangle rect = new Rectangle(width, height);
            System.out.printf("Rectangle area: %.2f, perimeter: %.2f%n", rect.area(), rect.perimeter());

        } else if (shape.equals("square")) {
            System.out.println("Enter square side length:");
            double side = scanner.nextDouble();
            Square sq = new Square(side);
            System.out.printf("Square area: %.2f, perimeter: %.2f%n", sq.area(), sq.perimeter());

        } else if (shape.equals("pentagon")) {
            System.out.println("Enter pentagon side length:");
            double side = scanner.nextDouble();
            Pentagon pent = new Pentagon(side, side, side, side, side);
            System.out.printf("Pentagon area: %.2f, perimeter: %.2f%n", pent.area(), pent.perimeter());

        } else if (shape.equals("hexagon")) {
            System.out.println("Enter hexagon side length:");
            double side = scanner.nextDouble();
            Hexagon hex = new Hexagon(side, side, side, side, side, side);
            System.out.printf("Hexagon area: %.2f, perimeter: %.2f%n", hex.area(), hex.perimeter());

        } else if (shape.equals("octagon")) {
            System.out.println("Enter octagon side length:");
            double side = scanner.nextDouble();
            Octagon oct = new Octagon(side, side, side, side, side, side, side, side);
            System.out.printf("Octagon area: %.2f, perimeter: %.2f%n", oct.area(), oct.perimeter());

        } else if (shape.equals("equilateral triangle")) {
            System.out.println("Enter side length:");
            double side = scanner.nextDouble();
            EquilateralTriangle eqTri = new EquilateralTriangle(side);
            System.out.printf("Equilateral triangle area: %.2f, perimeter: %.2f%n", eqTri.area(), eqTri.perimeter());

        } else if (shape.equals("isosceles triangle")) {
            System.out.println("Enter base length:");
            double base = scanner.nextDouble();
            System.out.println("Enter side length:");
            double side = scanner.nextDouble();
            IsoscelesTriangle isoTri = new IsoscelesTriangle(base, side);
            System.out.printf("Isosceles triangle area: %.2f, perimeter: %.2f%n", isoTri.area(), isoTri.perimeter());

        } else {
            System.out.println("Invalid shape selected!");
        }

        scanner.close();
    }
}