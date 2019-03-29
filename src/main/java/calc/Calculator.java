package calc;

import error.OperatorNotExist;
import parser.data.ParsedData;

import java.util.List;

public class Calculator {


    public int plus(int i, int j) {

        return i + j;
    }

    public int minus(int i, int j) {
        return i - j;
    }

    public int multiple(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        return i / j;
    }

    public int calc(ParsedData parsedData) {

        List<String> operators = parsedData.getOperators();
        List<Integer> numbers = parsedData.getNumbers();

        int result = numbers.get(0);

        for (int i = 0; i < operators.size(); i++) {

            String operator = operators.get(i);

            switch (operator) {
                case ("+"):
                    result = plus(result, numbers.get(i + 1));
                    break;
                case ("-"):
                    result = minus(result, numbers.get(i + 1));
                    break;
                case ("*"):
                    result = multiple(result, numbers.get(i + 1));
                    break;
                case ("/"):
                    result = divide(result, numbers.get(i + 1));
                    break;
                default:
                    throw new OperatorNotExist();
            }

        }


        return result;
    }
}
