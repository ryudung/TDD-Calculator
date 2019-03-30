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


    /**
     * 유저 입력을 받아 계산을 과정을 처리하고, 계산에 대한 결과를 출력하는 메서드.
     *
     * @param input 유저입력 데이터
     * */
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


        // 3.출력
        Printer.printOutWithSpace(RESULT, String.valueOf(result));
    }
}
