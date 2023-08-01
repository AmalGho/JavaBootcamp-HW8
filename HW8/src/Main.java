public class Main {
    public static void main(String[] args) {


//        *****************   Shape Objects  ************


        System.out.println("\n\n");


        Shape shape = new Shape();
        System.out.println(shape);

        System.out.println("\nAfter updates: ");
        shape.setColor("black");
        shape.setFilled(false);
        System.out.println(shape);


        Shape shape1 = new Shape("Pink", false);
        System.out.println("\n next shape: \n" + shape1);

        System.out.println("\nthe color of the shape " + shape1.getColor());
        System.out.println("is the shape filled? " + shape1.isFilled());


//        ****************  Circle Objects  ****************


        System.out.println("\n\n");

        Circle circle = new Circle(4.0, "red", false);
        System.out.println(circle);

        Circle circle1 = new Circle(6.0);
        System.out.println("\nthe circle area of radius " + circle1.getRadius() + " = " + circle1.getArea());

        circle1.setRadius(2.0);
        System.out.println("the circle perimeter of radius " + circle1.getRadius() + " = " + circle1.getPerimeter());


//        ****************   Rectangle Objects ****************


        System.out.println("\n\n");


        Rectangle rectangle = new Rectangle("white", false, 3, 4);
        System.out.println(rectangle);

        rectangle.setWidth(6);
        rectangle.setLength(8);
        System.out.println("\nAfter updates: " + rectangle);


        Rectangle rectangle1 = new Rectangle(4, 3);
        System.out.println("\nthe rectangle area of length "+ rectangle1.getLength() + " and width " + rectangle1.getWidth() + " = " + rectangle1.getArea());
        System.out.println("the rectangle perimeter of length "+ rectangle1.getLength() + " and width " + rectangle1.getWidth() + " = " + rectangle1.getPerimeter());




//        *************  Square Objects  ***************


        System.out.println("\n\n");


        Square square = new Square("yellow", true, 2);
        System.out.println(square);

        System.out.println("\nthe square area of side " + square.getWidth() + " = " + square.getArea());
        System.out.println("the square perimeter of side " + square.getWidth() + " = " + square.getPerimeter());

        Square square1 = new Square(8);
        System.out.println("\nnext square: " + square1);

        square1.setWidth(10);
        System.out.println("\nthe square area of side " + square1.getWidth() + " = " + square1.getArea());

    }
}