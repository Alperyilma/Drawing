public class SquareApp {

    public static void main(String[] args) {

        Rectangle square1 = new Square();

        square1.setHeight(15);
        square1.setWidth(24);
        square1.setPosition(1, -7);

        System.out.println("Square height: " + square1.getHeight());
        System.out.println("Square width: " + square1.getWidth());
        System.out.println("Square position (x, y): " + square1.getX() + " " + square1.getY());

        System.out.println("Square area: " + square1.getArea());
        System.out.println("Square perimeter: " + square1.getPerimeter());

        square1.setHeight(5);
        square1.setWidth(5);

        System.out.println("Square height: " + square1.getHeight());
        System.out.println("Square width: " + square1.getWidth());

        Square square2 = new Square(24, 42, 98);
        System.out.println(square2);

        Square square3 = new Square(square2);
        System.out.println(square3);


        System.out.println(Square.getCount());
        System.out.println(Rectangle.getCount());

        Rectangle rectangle = new Rectangle();


        System.out.println();

        square1 = new Rectangle();

        System.out.println(Square.getCount());
        System.out.println(Rectangle.getCount());

        System.out.println(Shape.getCount());
    }

}
