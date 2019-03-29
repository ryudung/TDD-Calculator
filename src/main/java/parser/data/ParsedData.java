package parser.data;

import lombok.Builder;
import lombok.Getter;
import operator.Operator;

import java.util.List;

@Getter
public class ParsedData {
    private List<Integer> numbers;
    private List<Operator> operators;

    @Builder
    public ParsedData(List<Integer> numbers, List<Operator> operators) {
        this.numbers = numbers;
        this.operators = operators;
    }
}
