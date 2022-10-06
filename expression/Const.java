package expression;

public class Const implements All {
    protected int val;

    public Const(int val) {
        this.val = val;
    }

    @Override
    public int evaluate(int val) {
        return this.val;
    }

    @Override
    public int evaluate(int val1, int val2, int val3) {
        return val;
    }

    @Override
    public String toString() {
        return Integer.toString(val);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Const cnst = (Const) object;
        return val == cnst.val;
    }

    @Override
    public int hashCode() {
        return 17 * val;
    }
}