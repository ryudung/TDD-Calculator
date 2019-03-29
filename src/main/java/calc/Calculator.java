package calc;

import operator.Operator;
import parser.data.Numbers;
import parser.data.ParsedData;
import printer.Printer;

import java.util.List;

public class Calculator extends AbstractCalculator {

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

            result = wrappedOperate(operators, numbers, result, i);

        }


        return result;
    }

    private int wrappedOperate(List<String> operators, Numbers numbers, int result, int i) {

        Printer.printOutWithSpace(
                String.valueOf(result),
                operators.get(i),
                String.valueOf(numbers.next(i)));


        result = Operator.operate(operators.get(i), result, numbers.next(i));


        Printer.printOutWithSpace("=", String.valueOf(result));

        return result;
    }
}
