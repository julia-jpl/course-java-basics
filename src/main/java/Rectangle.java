public class Rectangle {
    Point firstPoint;
    Point secondPoint;
    public Rectangle (Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public double getPerimeter() {
        return Math.abs(firstPoint.getX() - secondPoint.getX()) * 2 + Math.abs(firstPoint.getY() - secondPoint.getY()) * 2;
    }
    public double getArea() {
        return Math.abs(firstPoint.getX() - secondPoint.getX()) * Math.abs(firstPoint.getY() - secondPoint.getY());
    }
}

