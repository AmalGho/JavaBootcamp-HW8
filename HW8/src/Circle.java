public class Circle extends Shape {

    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        double halfRadius = radius/2;
        return (3.14 * (halfRadius * halfRadius));
    }

    public double getPerimeter() {
        return (3.14 * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius "
                + radius
                + " which is subclass of "
                + Shape.class;
    }
}
