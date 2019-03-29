package parser.data;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class ParsedData {
    private Numbers numbers;
    private List<String> operators;

    @Builder
    public ParsedData(Numbers numbers, List<String> operators) {
        this.numbers = numbers;
        this.operators = operators;
    }
}
