import calc.Calculator;
import parser.Parser;
import parser.data.ParsedData;
import printer.Printer;

import java.util.Scanner;

public class Main {

    /**
     * TODO:
     * 요구사항 1단계
     * <p>
     * - input 을 입력 받는다.
     * <p>
     * 1. input 값을 파싱한다.
     * - "1+2-3"
     * -> {"1", "2", "3"}
     * -> {"+", "-"}
     * <p>
     * 2. calc()
     * - 연산자로 계산한다.
     * - 더하기
     * - 빼기
     * - 곱하기
     * - 나누기
     * <p>
     * 3.
     * - 결과값을 가지고 출력한다.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //사용자 input 데이터
        String input = scanner.nextLine();

        //======작성 시작=======//


        //파싱
        Parser parser = new Parser();
        ParsedData parserData = parser.parsing(input);

        //계산
        Calculator calc = new Calculator();
        int result = calc.calc(parserData);


        //프린터
        Printer printer = new Printer();
        printer.print(result);

    }
}
