package calc;

import parser.Parser;
import parser.data.ParsedData;
import printer.Printer;

public abstract class AbstractCalculator implements CalculatorCore {
    private static final String RESULT = "결과값:";

    public void execute(String input) {

        // 1.파싱
        Parser parser = new Parser();
        ParsedData parserData = parser.parsing(input);


        // 2.계산
        int result = calc(parserData);


        // 3.프린터
        Printer.printOutWithSpace(RESULT, String.valueOf(result));
    }
}
