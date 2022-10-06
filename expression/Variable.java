package expression;


public class Variable implements All {
    protected String var;

    public Variable(String var) {
        this.var = var;
    }

    @Override
    public int evaluate(int val) {
        return val;
    }

    @Override
    public int evaluate(int val1, int val2, int val3) {
        if (var.equals("x")) {
            return val1;
        } else if (var.equals("y")) {
            return val2;
        } else {
            return val3;
        }
    }

    @Override
    public String toString() {
        return var;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Variable var2 = (Variable) object;
        return var.equals(var2.var);
    }

    @Override
    public int hashCode() {
        return 17 * var.hashCode();
    }
}