package calc;

import operator.Operator;
import parser.Parser;
import parser.data.Numbers;
import parser.data.Operators;
import parser.data.ParsedData;
import printer.Printer;

import java.util.List;

public class Calculator extends AbstractCalculator {

    private Calculator(Parser parser) {
        super(parser);
    }

    public static Calculator of(Parser parser) {
        return new Calculator(parser);
    }

    /**
     * 계산하는 메서드
     *
     * @param parsedData 계산하기 위한 연산자, 숫자를 담은 객체
     * @return 연산한 결과값
     */
    public int calc(ParsedData parsedData) {

        Operators operators = parsedData.getOperators();
        Numbers numbers = parsedData.getNumbers();


        int result = numbers.findFirst();


        for (int i = 0; i < operators.size(); i++) {

            result = wrappedOperate(operators, numbers, result, i);

        }


        return result;
    }

    private int wrappedOperate(Operators operators, Numbers numbers, int result, int i) {

        Printer.printOutWithSpace(
                String.valueOf(result),
                operators.get(i),
                String.valueOf(numbers.next(i)));


        result = Operator.operate(operators.get(i), result, numbers.next(i));


        Printer.printOutWithSpace("=", String.valueOf(result));

        return result;
    }
}
