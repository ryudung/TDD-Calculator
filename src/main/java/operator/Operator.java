package operator;

import error.OperatorNotExist;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public enum Operator {
    PLUS("+", (i, j) -> i + j),
    MINUS("-", (i, j) -> i - j),
    MULTIPLE("*", (i, j) -> i * j),
    DIVIDE("/", (i, j) -> i / j);

    private String key;
    private BiFunction<Integer, Integer, Integer> consumer;

    /**
     * 연산자를 key로 가지고, 연산 함수를 value로 가지는 map.
     * Map<연산자, 연산 function> operatorMap
     */
    private static Map<String, BiFunction<Integer, Integer, Integer>> operatorMap
            = Arrays.stream(Operator.values())
            .collect(Collectors.toMap(Operator::getKey, Operator::getConsumer));

    /**
     * 연산자 값으로 연산 function을 찾는 메서드.
     */
    public static int operate(String operator, int i, int j) {

        BiFunction<Integer, Integer, Integer> operatorBiFunction
                = operatorMap.get(operator);

        if (operatorBiFunction == null) {
            throw new OperatorNotExist(operator);
        }

        return operatorBiFunction.apply(i, j);
    }

    /**
     * 연산자 값을 가지고 있는지 확인하는 메서드.
     */
    public static boolean has(String operator) {
        return operatorMap.get(operator) != null;
    }
}
