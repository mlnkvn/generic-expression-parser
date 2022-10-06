package expression;

public class Divide extends Operation {

    public Divide(All first, All second) {
        super.first = first;
        super.second = second;
        super.sign = " / ";
    }

    public int operation(int first, int second) {
        return first / second;
    }
}