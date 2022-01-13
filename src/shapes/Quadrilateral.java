package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
// protected properties for length and width.
    protected int length;
    protected int width;

    public Quadrilateral(){

    }


//    methods for getting the length and width.

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }


//    abstract methods for setting the length and width.
    public abstract void setLength(int length);

    public abstract void setWidth(int width);



}
