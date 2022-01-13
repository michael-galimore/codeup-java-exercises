package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Quadrilateral myShape = new Rectangle(8,9);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Square(25);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());


    }
}