public class Main {
    public static void main(String[] args) {


//        *****************   Shape Objects  ************


        Shape shape = new Shape();
        System.out.println(shape);

        shape.setColor("black");
        shape.setFilled(false);
        System.out.println(shape);


        Shape shape1 = new Shape("Pink", false);
        System.out.println(shape1);
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());


//        ****************  Circle Objects  ****************


        Circle circle = new Circle(4.0, "red", false);
        System.out.println(circle);

        Circle circle1 = new Circle(6.0);
        System.out.println("the circle area: " + circle1.getArea());
        System.out.println("the circle perimeter: " + circle1.getPerimeter());


//        ****************   Rectangle Objects ****************

        Rectangle rectangle = new Rectangle("white", false, 3, 4);
        System.out.println(rectangle);

        System.out.println("the rectangle area " + rectangle.getArea());
        System.out.println("the rectangle perimeter " + rectangle.getPerimeter());


//        *************  Square Objects  ***************

        Square square = new Square("yellow", true, 2);
        System.out.println(square);

        System.out.println("the square area " + square.getArea());
        System.out.println("the square perimeter " + square.getPerimeter());
    }
}