package lab2_polygon_calculator.shapes;

public class Rectangle extends Quadrilateral {
    protected double length, width;

    public Rectangle(double length, double width) {
        super(length, width, length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return length + length + width + width;
    }

}
