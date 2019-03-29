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

    /**
     * 첫번째 값을 리턴하는 메서드.
     *
     * @return 첫번째 숫자
     */
    public int findFirst() {
        return numbers.get(0);
    }

    /**
     * 해당위치 값을 리턴하는 메서드.
     *
     * @return 해당위치 숫자
     */
    public int get(int i) {
        return numbers.get(i);
    }

    /**
     * 다음 값을 리턴하는 메서드.
     *
     * @return 다음 숫자
     */
    public int next(int i) {
        return numbers.get(i + 1);
    }
}
