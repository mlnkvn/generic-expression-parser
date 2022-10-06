package expression.generic;public class Count<T> implements GenericGeneralExpression<T> {    protected GenericGeneralExpression<T> expression;    protected boolean hasBrackets;    protected NumberMode<T> calculator;    public Count(GenericGeneralExpression<T> expression, boolean hasBrackets, NumberMode<T> calculator) {        this.expression = expression;        this.hasBrackets = hasBrackets;        this.calculator = calculator;    }    public T evaluate(T val) {        return calculator.count(expression.evaluate(val));    }    public T evaluate(T val1, T val2, T val3) {        return calculator.count(expression.evaluate(val1, val2, val3));    }    @Override    public String toString() {        if (hasBrackets || (expression instanceof GenericConst && calculator.compare(expression.evaluate(calculator.parse("0")), calculator.parse("0")))) {            return "count (" + expression.toString() + ")";        }        return "count " + expression.toString();    }    @Override    public boolean equals(Object object) {        if (object == null || this.getClass() != object.getClass()) {            return false;        }        Count<?> var2 = (Count<?>) object;        return expression.equals(var2.expression);    }    @Override    public int hashCode() {        return 17 * expression.hashCode();    }}