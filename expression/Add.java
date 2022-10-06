package expression;

public class Add extends Operation {

    public Add(All first, All second) {
        super.first = first;
        super.second = second;
        super.sign = " + ";
    }

    public int operation(int first, int second) {
        return first + second;
    }
}