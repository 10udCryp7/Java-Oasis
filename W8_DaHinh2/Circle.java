import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * constructor.
     */
    public Circle() {

    }

    /**
     * constructor.
     *
     * @param radius r.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * constructor.
     *
     * @param radius r.
     * @param color  c.
     * @param filled f.
     */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    /**
     * contructor.
     *
     * @param center c.
     * @param radius r.
     * @param color  c.
     * @param filled f.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        this.center = center;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    /**
     * getter center.
     *
     * @return center.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * setter center.
     *
     * @param center center.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * getter r.
     *
     * @return r.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setter r.
     *
     * @param radius r.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getter area.
     *
     * @return area.
     */
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * getter perimeter.
     *
     * @return perimeter.
     */
    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    /**
     * equals method.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Circle)) {
            return false;
        }
        return this.radius == ((Circle) o).radius
                && this.center.equals(((Circle) o).center);
    }

    /**
     * string.
     *
     * @return string.
     */
    @Override
    public String toString() {
        return "Circle["
                + "center=" + this.getCenter().toString()
                + "," + "radius=" + this.getRadius()
                + "," + "color=" + this.getColor()
                + "," + "filled=" + this.isFilled()
                + "]";
    }

    /**
     * hashcode function.
     */
    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
