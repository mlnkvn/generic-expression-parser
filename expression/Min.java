package expression;

public class Min extends Operation {

    public Min(All first, All second) {
        super.first = first;
        super.second = second;
        super.sign = " min ";
    }

    public int operation(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
}