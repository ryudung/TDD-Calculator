package calc;

import parser.Parser;
import parser.data.ParsedData;
import printer.Printer;

import java.util.Optional;

public abstract class AbstractCalculator implements CalculatorCore {
    private static final String RESULT = "결과값:";
    private static final String NaN = "NaN";

    private Parser parser;

    protected AbstractCalculator(Parser parser) {
        this.parser = parser;
    }

    public void execute(String input) {

        // 1.파싱
        Optional<ParsedData> optParsedData = parser.parsing(input);

        //에러처리.
        if (!optParsedData.isPresent()) {
            Printer.print(NaN);
            return;
        }

        ParsedData parserData = optParsedData.get();


        // 2.계산
        int result = calc(parserData);


        // 3.프린터
        Printer.printOutWithSpace(RESULT, String.valueOf(result));
    }
}
