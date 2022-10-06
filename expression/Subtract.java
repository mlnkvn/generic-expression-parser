package expression;

public class Subtract extends Operation {

    public Subtract(All first, All second) {
        super.first = first;
        super.second = second;
        super.sign = " - ";
    }

    public int operation(int first, int second) {
        return first - second;
    }
}