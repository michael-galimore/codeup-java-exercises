package shapes;

//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(int length, int width) {
        super(length, width);
    }

    public void setLength(int length) {
        this.length = length;

    }


    public void setWidth(int width) {
        this.width = width;

    }

@Override
    public int getPerimeter() {
        return (length + width) * 2;
    }

@Override
    public int getArea() {
        return length * width;
    }
}
