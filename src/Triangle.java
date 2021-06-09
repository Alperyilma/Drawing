import java.util.Objects;

public  class Triangle extends Shape {

    private static int count;
    public static final int ANGLES = 3;

    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle(){
        this(0,0,0,0,0);
    }

    public Triangle(int width, int height, int perpendicular) {
        setWidth(width);
        setHeight(height);
        setPerpendicular(perpendicular);
    }

    public Triangle(int width, int height, int perpendicular, int x, int y){
        setWidth(width);
        setHeight(height);
        setPerpendicular(perpendicular);
        setX(x);
        setY(y);
    }

    public Triangle(Triangle triangle){
        this(triangle.width, triangle.height, triangle.perpendicular, triangle.getX(), triangle.getY());
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public int getArea() {
        int area = (getHeight() * getWidth())/2;
        return area;
    }

    @Override
    public int getPerimeter() {
        return getHeight() + getWidth() + getPerimeter();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return getHeight() == triangle.getHeight() && getWidth() == triangle.getWidth() && getPerpendicular() == triangle.getPerpendicular();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHeight(), getWidth(), getPerpendicular());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                '}';
    }

    public static int getCount() {
        return count;
    }
}
