package parser.data;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class ParsedData {
    private List<Integer> numbers;
    private List<String> operators;

    @Builder
    public ParsedData(List<Integer> numbers, List<String> operators) {
        this.numbers = numbers;
        this.operators = operators;
    }
}
