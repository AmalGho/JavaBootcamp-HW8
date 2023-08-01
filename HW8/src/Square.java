public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side){
        this.setWidth(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public double getArea() {
        return (getWidth() * getWidth());
    }

    @Override
    public double getPerimeter() {
        return (getWidth() * 4);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }


    @Override
    public String toString() {
        return "A Square with side "
                + getWidth()
                + ", which is a subclass of "
                + Rectangle.class.toString();
    }
}
