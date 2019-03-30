package error;

/**
 * 존재하지 않는 연산자 에러 클래스.
 * */
public class OperatorNotExist extends RuntimeException {
    public OperatorNotExist(String operator) {
        super(operator + "는 존재하지 않는 연산자입니다.");
    }
}
