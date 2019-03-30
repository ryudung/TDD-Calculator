package parser.data;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ParsedData {
    private Numbers numbers;
    private Operators operators;

    @Builder
    private ParsedData(Numbers numbers, Operators operators) {
        this.numbers = numbers;
        this.operators = operators;
    }
}
