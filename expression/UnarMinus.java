package expression;


public class UnarMinus implements All {
    protected All expression;
    protected boolean hasBrackets;

    public UnarMinus(All expression) {
        this.expression = expression;
        this.hasBrackets = false;
    }

    public UnarMinus(All expression, boolean hasBrackets) {
        this.expression = expression;
        this.hasBrackets = hasBrackets;
    }

    @Override
    public int evaluate(int val) {
        return -expression.evaluate(val);
    }

    @Override
    public int evaluate(int val1, int val2, int val3) {
        return -expression.evaluate(val1, val2, val3);
    }

    @Override
    public String toString() {
        if (hasBrackets || (expression instanceof Const && expression.evaluate(0) == 0)) {
            return "-(" + expression.toString() + ")";
        }
        return "-" + expression.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        UnarMinus var2 = (UnarMinus) object;
        return expression.equals(var2.expression);
    }

    @Override
    public int hashCode() {
        return 17 * expression.hashCode();
    }
}