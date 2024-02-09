public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    public String toString() {
        return "(" + expression.toString() + ")"
                + " ^ 2";
    }

    public double evaluate() {
        return Math.pow(expression.evaluate(), 2);
    }
}
