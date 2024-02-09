public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * constructor.
     */
    public Shape() {

    }

    /**
     * constructor.
     *
     * @param color  color.
     * @param filled filled.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * color getter.
     *
     * @return color.
     */
    public String getColor() {
        return color;
    }

    /**
     * setter color.
     *
     * @param color color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * bool fill.
     *
     * @return fill or not.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * setter filled.
     *
     * @param filled filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * getArea.
     *
     * @return area.
     */
    public abstract double getArea();

    /**
     * get perimeter.
     *
     * @return perimeter.
     */
    public abstract double getPerimeter();

    /**
     * string.
     *
     * @return string.
     */
    public String toString() {
        return "Shape["
                + "color=" + this.color
                + "," + "filled="
                + this.filled
                + "]";
    }

}
