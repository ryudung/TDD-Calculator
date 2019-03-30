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
}
