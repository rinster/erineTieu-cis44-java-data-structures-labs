package lab2_polygon_calculator.shapes;

public class Pentagon implements Polygon {
    protected double side1, side2, side3, side4, side5;

    public Pentagon(double side1, double side2, double side3, double side4, double side5) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
    }

    @Override
    public double area() {
        return (5 * side1 * side2) / (4 * Math.tan(Math.PI / 5));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3 + side4 + side5;
    }
}
