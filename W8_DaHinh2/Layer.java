import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * shape.
     *
     * @param shape shape.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * string info.
     *
     * @return infor.
     */
    public String getInfo() {
        StringBuilder res = new StringBuilder();
        res.append("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            res.append(shape.toString()).append("\n");
        }
        return res.toString();
    }

    /**
     * remove circle.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * remove duplicate.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            Shape saveVal = shapes.get(i);
            for (int j = 0; j < shapes.size(); j++) {
                if (shapes.get(j) instanceof Rectangle) {
                    if (((Rectangle) shapes.get(j)).equals((saveVal))) {
                        shapes.remove(j);
                    }
                } else if (shapes.get(j) instanceof Circle) {
                    if (((Circle) shapes.get(j)).equals(saveVal)) {
                        shapes.remove(j);
                    }
                }
            }
            shapes.add(i, saveVal);
        }
    }
}
