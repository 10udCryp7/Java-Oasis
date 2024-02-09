public class Rectangle extends Shape {
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
     * String.
     *
     * @return String.
     */
    @Override
    public String toString() {
        return "Rectangle["
                + "width=" + this.getWidth()
                + "," + "length=" + this.getLength()
                + "," + "color=" + this.getColor()
                + "," + "filled=" + this.isFilled()
                + "]";
    }
}
