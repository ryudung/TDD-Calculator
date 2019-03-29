package operator;

import error.OperatorNotExist;

/**
 * 연산자 인터페이
 * */
public interface Operator {

    static Operator of(String operator) {
        switch (operator) {
            case ("+"):
                return new Plus();
            case ("-"):
                return new Minus();
            case ("*"):
                return new Multiple();
            case ("/"):
                return new Divide();
            default:
                throw new OperatorNotExist();
        }
    }

    /**
     * 연산자로 계산하는 메서드
     * */
    int calc(int i, int j);
}
