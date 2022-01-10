package shapes;

public class Square extends Quadrilateral{
    private int side;

    public Square(int side) {
        this.side = side;
        this.length = side;
        this.width=side;

    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public void setLength(int length) {


    }

    @Override
    public void setWidth(int width) {

    }

    public void setSide(){

    }
}