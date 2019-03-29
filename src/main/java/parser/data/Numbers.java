package parser.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Numbers {
    private List<Integer> numbers;

    public static Numbers of(List<Integer> numbers) {
        return new Numbers(numbers);
    }

    public int findFirst() {
        return numbers.get(0);
    }

    public int get(int i) {
        return numbers.get(i);
    }
}
