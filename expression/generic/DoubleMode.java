package expression.generic;import java.util.Objects;public class DoubleMode implements NumberMode<Double>{    @Override    public Double parse(String string) {        return Double.parseDouble(string);    }    @Override    public Double add(Double a, Double b) {        return a + b;    }    @Override    public Double subtract(Double a, Double b) {        return a - b;    }    @Override    public Double multiply(Double a, Double b) {        return a * b;    }    @Override    public Double divide(Double a, Double b) {        return a / b;    }    @Override    public Double min(Double a, Double b) {        return Double.min(a, b);    }    @Override    public Double max(Double a, Double b) {        return Double.max(a, b);    }    @Override    public Double negate(Double a) {        return -a;    }    @Override    public int intValue(Double a) {        return (int) Math.round(a);    }    @Override    public boolean compare(Double a, Double b) {        return Objects.equals(a, b);    }    @Override    public Double count(Double a) {        return (double)Long.bitCount(Double.doubleToLongBits(a));    }}