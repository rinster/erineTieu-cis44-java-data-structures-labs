package lab2_polygon_calculator.shapes;

public class IsoscelesTriangle extends Triangle {
    protected double side, base;

    public IsoscelesTriangle(double side, double base) {
        super(side, side, base);
        this.side = side;
        this.base = base;
    }

    @Override
    public double perimeter() {
        return (side * 2) + base;
    }

    public double area() {
        double height = Math.sqrt(side1 * side1 - (side3 / 2) * (side3 / 2));
        return (side3 * height) / 2;
    }
}
