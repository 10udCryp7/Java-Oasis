public class Circle extends Shape {
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
     * string.
     *
     * @return string.
     */
    @Override
    public String toString() {
        return "Circle["
                + "radius=" + this.getRadius()
                + "," + "color=" + this.getColor()
                + "," + "filled=" + this.isFilled()
                + "]";
    }
}
