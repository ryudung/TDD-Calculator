package parser.data;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ParsedData {
    private Numbers numbers;
    private Operators operators;

    @Builder
    public ParsedData(Numbers numbers, Operators operators) {
        // 4칙 연산 이외에 다른 연산에 대한 에러 처리
        // 잘못된 연산에 대한 에러 처리

        this.numbers = numbers;
        this.operators = operators;
    }

}
