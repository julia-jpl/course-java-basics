public class PointTest {
    public static void main(String[] args) {
        Point first = new Point(3, 6);
        Point second = new Point(-2, 4);
        double distance = first.getDistance(second);
        System.out.println(distance);
        first.setX(-2);
        first.setY(-4);
        second.setY(7);
        second.setX(3);
        double distance1 = second.getDistance(first);
        System.out.println(distance1);
    }
}
