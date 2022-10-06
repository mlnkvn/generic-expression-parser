package expression;

public class Multiply extends Operation {

    public Multiply(All first, All second) {
        super.first = first;
        super.second = second;
        super.sign = " * ";
    }

    public int operation(int first, int second) {
        return first * second;
    }
}