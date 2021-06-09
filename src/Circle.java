import java.util.Objects;

public class Circle extends Shape {

    private static int count;
    public static final int ANGLES = 0;
    private int radius;

    {
        count++;
    }

    public Circle() {
        this(0,0,0);
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(int radius, int x, int y){
        setRadius(radius);
        setPosition(x, y);
    }

    public Circle(Circle circle){
        this(circle.radius, circle.getX(), circle.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        double pi = 3.14;
        double area = pi * radius * radius;
        return (int)area;
    }

    @Override
    public int getPerimeter() {
        int perimeter = (22 * 2 * this.radius) / 7;
        return perimeter;
    }


    public void grow(int d){
        radius += d;
        if (radius < 0){
            radius = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return getRadius() == circle.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public static int getCount() {
        return count;
    }
}
