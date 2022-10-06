package expression;

public class Max extends Operation {

    public Max(All first, All second) {
        super.first = first;
        super.second = second;
        super.sign = " max ";
    }

    public int operation(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}