public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    /**
     * constructor.
     *
     * @param color  c.
     * @param filled f.
     * @param side   s.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * side.
     *
     * @return side.
     */
    public double getSide() {
        return this.length;
    }

    /**
     * side.
     *
     * @param side s.
     */
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    /**
     * w.
     *
     * @param side w.
     */
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * l.
     *
     * @param side l.
     */
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    /**
     * equals.
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Square)) {
            return false;
        }
        return this.getArea() == ((Square) o).getArea();
    }

    /**
     * string.
     *
     * @return string.
     */
    @Override
    public String toString() {
        return "Square["
                + "topLeft=" + this.getTopLeft().toString()
                + "," + "side=" + this.length
                + "," + "color=" + this.color
                + "," + "filled=" + this.filled + "]";
    }
}
