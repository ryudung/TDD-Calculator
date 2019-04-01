package parser.data;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class SplitedData {
    private List<String> numbers;
    private List<String> operators;

    @Builder
    public SplitedData(List<String> numbers, List<String> operators) {
        this.numbers = numbers;
        this.operators = operators;
    }

    /**
     * 숫자(numbers), 연산자(operators)+ 1 의 개수가 같은지 검증하는 메서드.
     * */
    public boolean isSizeValid() {
        return numbers.size() == operators.size() + 1;
    }
}
