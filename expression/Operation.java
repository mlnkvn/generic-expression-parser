package expression;

import java.util.*;

public abstract class Operation implements All, Expression, TripleExpression {
    protected All first;
    protected All second;
    protected String sign;


    abstract int operation(int first, int second);

    @Override
    public int evaluate(int val) {
        return operation(first.evaluate(val), second.evaluate(val));
    }


    @Override
    public int evaluate(int val1, int val2, int val3) {
        return operation(first.evaluate(val1, val2, val3), second.evaluate(val1, val2, val3));
    }

    @Override
    public String toString() {
        return "(" + first.toString() + sign + second.toString() + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Operation oper = (Operation) object;
        return first.equals(oper.first) && second.equals(oper.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, getClass());
    }
}
