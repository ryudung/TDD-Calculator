package operator;

public class Multiple implements Operator {
    @Override
    public int calc(int i, int j) {
        return i * j;
    }
}
