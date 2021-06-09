public class Square extends Rectangle {

    private static int count;

    {
        count++;
    }

    public Square() {
        this(0, 0, 0);
    }

    public Square(int side) {
        this(side, 0, 0);
    }

    public Square(int side, int x, int y) {
        setSide(side);
        setPosition(x, y);
    }

    public Square(Square side) {
        super(side.getX(), side.getY(), side.getWidth(), side.getHeight());

    }

    public int getSide() {
        return getHeight();
    }

    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() + "}";
    }
}
