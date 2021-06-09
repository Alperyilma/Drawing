

public class App {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,-27,25,88);
        Rectangle copy = new Rectangle(rectangle);

        Triangle triangle = new Triangle(24,55,26);

        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle(55,75);

        Circle circle = new Circle(24,5,88);

        Square square = new Square(25,81,74);

        Drawing drawing = new Drawing();

        drawing.add(rectangle);
        drawing.add(circle);
        drawing.add(square);

        System.out.println("The size of our drawing is: " + drawing.getSize());

        drawing.clear();

        System.out.println("The size of our drawing is: " + drawing.getSize());



    }
}
