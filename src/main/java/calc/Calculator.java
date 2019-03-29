package calc;

import operator.Operator;
import parser.data.Numbers;
import parser.data.ParsedData;

import java.util.List;

public class Calculator {

    /**
     * 계산하는 메서드
     *
     * @param parsedData 계산하기 위한 연산자, 숫자를 담은 객체
     * @return 연산한 결과값
     */
    public int calc(ParsedData parsedData) {

        List<String> operators = parsedData.getOperators();
        Numbers numbers = parsedData.getNumbers();


        int result = numbers.findFirst();


        for (int i = 0; i < operators.size(); i++) {

            result = Operator.operate(operators.get(i), result, numbers.get(i + 1));

        }


        return result;
    }
}
