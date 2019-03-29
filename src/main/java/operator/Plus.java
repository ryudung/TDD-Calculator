package operator;

public class Plus implements Operator {
    @Override
    public int calc(int i, int j) {
        return i + j;
    }
}
