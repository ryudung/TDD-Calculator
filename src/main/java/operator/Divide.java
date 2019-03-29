package operator;

public class Divide implements Operator {
    @Override
    public int calc(int i, int j) {
        return i / j;
    }
}
