import calc.Calculator;
import parser.Parser;

import java.util.Scanner;

public class Main {

    /**
     * TODO:
     * <p>
     * - 4칙 연산 이외에 다른 연산에 대한 에러 처리
     * - "NaN" 출력
     * <p>
     * - 잘못된 연산에 대한 에러 처리
     * -  예
     * - 1+-2  (x)
     * - +1-2  (x)
     * - 1-2-  (x)
     * - "NaN" 출력
     * <p>
     * - 계산 과정을 printOutWithSpace
     * - 예 :1+2-1*2
     * - 1 + 2 = 3
     * - 3 - 1 = 2
     * - 2 * 2 = 4
     * - 결과 값: 4
     * <p>
     * - OOP(Object orient Programing)로 최적화
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //사용자 input 데이터
        String input = scanner.nextLine();

        //======작성 시작=======//


        //계산
        Calculator calc = Calculator.of(new Parser());

        calc.execute(input);


        //======작성 끝=======//
        scanner.close();
    }
}
