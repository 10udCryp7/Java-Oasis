public class Triangle implements GeometricObject {

    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * p.
     * 
     * @param p1 p1.
     * @param p2 p2.
     * @param p3 p3.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        if (p1.distance(p2) == 0 || p2.distance(p3) == 0 || p3.distance(p1) == 0) {
            throw new RuntimeException();
        } else if ((p1.getPointX() - p2.getPointX()) / (p2.getPointX() - p3.getPointX())
                == (p1.getPointY() - p2.getPointY()) / (p2.getPointY() - p3.getPointY())) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Point getP1() {
        return p1;
    }


    public Point getP2() {
        return p2;
    }


    public Point getP3() {
        return p3;
    }


    @Override
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return a + b + c;
    }

    @Override
    public String getInfo() {
        String x1 = String.format("%.2f", p1.getPointX());
        String y1 = String.format("%.2f", p1.getPointY());
        String x2 = String.format("%.2f", p2.getPointX());
        String y2 = String.format("%.2f", p2.getPointY());
        String x3 = String.format("%.2f", p3.getPointX());
        String y3 = String.format("%.2f", p3.getPointY());
        return "Triangle["
                + "(" + x1 + "," + y1 + "),"
                + "(" + x2 + "," + y2 + "),"
                + "(" + x3 + "," + y3 + ")]";
    }
}
