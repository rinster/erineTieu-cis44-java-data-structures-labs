package lab2_polygon_calculator.shapes;

public class Octagon implements Polygon {
    protected double side1, side2, side3, side4, side5, side6, side7, side8;

    public Octagon(double side1, double side2, double side3, double side4, double side5, double side6, double side7,
            double side8) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
        this.side7 = side7;
        this.side8 = side8;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3 + side4 + side5 + side6 + side7 + side8;
    }

    @Override
    public double area() {
        return 2 * (1 + Math.sqrt(2)) * side1 * side2;
    }
}
