import java.util.Objects;

public abstract class Shape {

    private int x;
    private int y;
    private static int count;

    {
        System.out.println("Super Class shape code block triggered!");
        count++;
    }

    public Shape(){
        this(0,0);
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract int getArea();

    public abstract int getPerimeter();

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return getX() == shape.getX() && getY() == shape.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
