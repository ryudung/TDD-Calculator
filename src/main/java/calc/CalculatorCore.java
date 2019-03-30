package calc;

import parser.data.ParsedData;

/**
 * 계산에 대한 코어 로직을 정의한 인터페이스
 * */
public interface CalculatorCore {

    /**
     * 계산하는 메서드.
     *
     * @param parsedData 유저입력을 파싱한 데이터
     * */
    int calc(ParsedData parsedData);
}
