import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * constructor.
     */
    public Rectangle() {

    }

    /**
     * constructor.
     *
     * @param width  w.
     * @param length l.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructor.
     *
     * @param color  c.
     * @param filled f.
     * @param width  w.
     * @param length l.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * constructor.
     *
     * @param topLeft .
     * @param width   .
     * @param length  .
     * @param color   .
     * @param filled  .
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * topLeft.
     *
     * @return topLeft.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * topLeft.
     *
     * @param topLeft .
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * getter width.
     *
     * @return width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * setter width.
     *
     * @param width w.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * getter length.
     *
     * @return length.
     */
    public double getLength() {
        return length;
    }

    /**
     * setter length.
     *
     * @param length l.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * getter A.
     *
     * @return A.
     */
    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    /**
     * getter P.
     *
     * @return P.
     */
    @Override
    public double getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    /**
     * equals.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Rectangle)) {
            return false;
        }
        return this.width == ((Rectangle) o).width
                && this.length == ((Rectangle) o).length
                && this.topLeft.equals(((Rectangle) o).topLeft);
    }

    /**
     * String.
     *
     * @return String.
     */
    @Override
    public String toString() {
        return "Rectangle["
                + "topLeft=" + this.getTopLeft().toString()
                + "," + "width=" + this.getWidth()
                + "," + "length=" + this.getLength()
                + "," + "color=" + this.getColor()
                + "," + "filled=" + this.isFilled()
                + "]";
    }

    /**
     * hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }
}
