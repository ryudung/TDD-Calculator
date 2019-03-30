package calc;

import operator.Operator;
import parser.Parser;
import parser.data.Numbers;
import parser.data.Operators;
import parser.data.ParsedData;
import printer.Printer;

/**
 * 계산을 처리하는 클래스
 * */
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

    /**
     * 계산 과정을 프린트하기위해 감싼 메서드.
     *
     * @param operators 연산자 리스트
     * @param numbers 숫자 리스트
     * @param prevResult 이전 결과값
     * @param j 계산에서 사용할 숫자, 연산자에 대한 인덱스
     *
     * @return 계산한 결과
     * */
    private int wrappedOperate(Operators operators, Numbers numbers, int prevResult, int j) {

        Printer.printOutWithSpace(
                String.valueOf(prevResult),
                operators.get(j),
                String.valueOf(numbers.next(j)));


        int result = Operator.operate(operators.get(j), prevResult, numbers.next(j));


        Printer.printOutWithSpace("=", String.valueOf(result));

        return result;
    }
}
