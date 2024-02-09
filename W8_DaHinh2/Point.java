public class Point {
    private double pointX;
    private double pointY;

    /**
     * point.
     *
     * @param pointX x.
     * @param pointY y.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * x.
     *
     * @return pointx.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * setter point x.
     *
     * @param pointX point.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * getter point x.
     *
     * @return point x.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * y.
     *
     * @param pointY pointy.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * point.
     *
     * @param newPoint point.
     * @return point.
     */
    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(this.pointX - newPoint.pointX, 2)
                + Math.pow(this.pointY - newPoint.pointY, 2));
    }

    /**
     * equals.
     */
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        return this.pointX == ((Point) o).pointX
                && this.pointY == ((Point) o).pointY;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
