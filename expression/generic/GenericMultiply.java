package expression.generic;public class GenericMultiply<T> extends GenericOperation<T> {    public GenericMultiply(GenericGeneralExpression<T> first, GenericGeneralExpression<T> second, NumberMode<T> calculator) {        super.first = first;        super.second = second;        super.sign = " * ";        super.calculator = calculator;    }    public T operation(T first, T second) {        return calculator.multiply(first, second);    }}