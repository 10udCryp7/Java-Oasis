public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * constructor.
     * 
     * @param center c.
     * @param radius r.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;

    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return PI * radius * 2;
    }

    @Override
    public String getInfo() {
        String centerX = String.format("%.2f", center.getPointX());
        String centerY = String.format("%.2f", center.getPointY());
        String radiusString = String.format("%.2f", this.radius);
        return "Circle"
                + "[(" + centerX + "," + centerY + ")"
                + "," + "r=" + radiusString + "]";
    }
}
