public class IsoScelesTriangle extends Triangle{

    private static int count;

    {
        count++;
    }

    public IsoScelesTriangle() {
    }

    public IsoScelesTriangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public IsoScelesTriangle(int width, int height, int x, int y) {
        this(width,height);
        setPosition(x,y);
    }

    public IsoScelesTriangle(IsoScelesTriangle isoScelesTriangle) {
        super(isoScelesTriangle);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setPerpendicular(width/2);

    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(perpendicular*2);

    }

    public static int getCount() {
        return count;
    }

}
