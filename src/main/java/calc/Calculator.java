package calc;

import operator.Operator;
import parser.data.ParsedData;

import java.util.List;

public class Calculator {

    public int calc(ParsedData parsedData) {

        List<Operator> operators = parsedData.getOperators();
        List<Integer> numbers = parsedData.getNumbers();

        int result = numbers.get(0);


        for (int i = 0; i < operators.size(); i++) {

            Operator operator = operators.get(i);

            result = operator.calc(result, numbers.get(i + 1));
        }


        return result;
    }
}
