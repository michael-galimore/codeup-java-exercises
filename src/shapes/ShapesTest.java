package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(8,9);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());



    }
}