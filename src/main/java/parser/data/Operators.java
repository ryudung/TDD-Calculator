package parser.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import operator.Operator;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Operators {
    private List<String> operators;

    public static Operators of(List<String> operators) {
        return new Operators(operators);
    }


    /**
     * 해당위치 값을 리턴하는 메서드.
     *
     * @return 해당위치 연산자
     */
    public String get(int i) {
        return operators.get(i);
    }

    /**
     * operators의 크기를 리턴하는 메서드.
     *
     * @return operators의 크기
     */
    public int size() {
        return operators.size();
    }

    public boolean isValid() {
        return operators.stream()
                .allMatch(Operator::has);
    }
}
