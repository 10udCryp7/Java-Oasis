import java.util.List;

public class ShapeUtil {
    /**
     * return info.
     * 
     * @param shapes shapes.
     * @return string.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String res = "";
        res += "\nCircle:";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                res += "\n" + shape.getInfo();
            }
        }
        res += "\nTriangle:";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                res += "\n" + shape.getInfo();
            }
        }
        return res;
    }
}
