package expression.generic;import java.util.*;public abstract class GenericOperation<T> implements GenericGeneralExpression<T> {    protected GenericGeneralExpression<T> first;    protected GenericGeneralExpression<T> second;    protected String sign;    protected NumberMode<T> calculator;    abstract T operation(T first, T second);    @Override    public T evaluate(T val) {        return operation(first.evaluate(val), second.evaluate(val));    }    @Override    public T evaluate(T val1, T val2, T val3) {        return operation(first.evaluate(val1, val2, val3), second.evaluate(val1, val2, val3));    }    @Override    public String toString() {        return "(" + first.toString() + sign + second.toString() + ")";    }    @Override    public boolean equals(Object object) {        if (object == null || object.getClass() != this.getClass()) {            return false;        }        GenericOperation<?> oper = (GenericOperation<?>) object;        return first.equals(oper.first) && second.equals(oper.second);    }    @Override    public int hashCode() {        return Objects.hash(first, second, getClass());    }}