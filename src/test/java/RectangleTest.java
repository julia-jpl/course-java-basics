public class RectangleTest {
    public static void main(String[] args) {
        Point firstPoint = new Point (2, 4);
        Point secondPoint = new Point(-2, -5);
        Rectangle rectangle1 = new Rectangle(firstPoint, secondPoint);
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());
    }
}
