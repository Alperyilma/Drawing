import java.util.Objects;

public class Rectangle extends Shape {

    private static int count;
    public static final int ANGLES = 4;

    private int width;
    private int height;

    {
        count++;
    }

    public Rectangle() {
        this(0,0,0,0);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        setX(x);
        setY(y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getX(), rectangle.getY(), rectangle.width, rectangle.height);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Rectangle.count = count;
    }

    public static int getANGLES() {
        return ANGLES;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width < 0 ? -width : width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : height;
    }

    public void grow(int d) {
        width += d;
        height += d;
        if (width < 0) width = 0;
        if (height < 0) height = 0;
    }

    @Override
    public int getArea() {
        int area = height * width;
        return area;
    }

    @Override
    public int getPerimeter() {
        int perimeter = 2 * (height + width);
        return perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getWidth() == rectangle.getWidth() && getHeight() == rectangle.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWidth(), getHeight());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
