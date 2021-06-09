public class Drawing {

    private Shape[] shapes = new Shape[100];
    private int size;

    public void add (Shape shape) {
        if (shape != null) {


            for (int i = 0; i < shapes.length; i++) {

                if (shape.equals(shapes[i])) {
                    break;
                }

                if (shapes[i] == null) {
                    shapes[i] = shape;
                    size++;
                    break;
                }
            }
        }
    }

    public void remove (Shape shape){
        if (shape != null){

            for (int i = 0; i < shapes.length; i++){

                if (shape.equals(shapes[i])){
                    shapes[i] = null;
                    size--;
                    break;
                }
            }
        }
    }

    public void clear(){
        shapes = new Shape[100];
        size = 0;
    }

    public int getSize(){
        return size;
    }

}
