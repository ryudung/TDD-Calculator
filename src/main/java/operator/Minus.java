package operator;

public class Minus implements Operator{
    @Override
    public int calc(int i, int j) {
        return i - j;
    }
}
