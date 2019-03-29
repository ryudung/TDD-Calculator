import operator.Plus;
import org.junit.Test;
import parser.Parser;
import parser.data.ParsedData;

import static org.junit.Assert.assertTrue;

public class ParserTest {

    /**
     * TODO:
     * 1. 짝수, 홀수 일 경우로 숫자, 연산자를 나눈다.
     * 2. 숫자, 연산자를 리턴한다.
     */

    @Test
    public void parsing() {

        //given
        Parser parser = new Parser();

        String input = "1+2+3";


        //when
        ParsedData parsedData = parser.parsing(input);


        //then
        assertTrue(1 == parsedData.getNumbers().get(0));
        assertTrue(2 == parsedData.getNumbers().get(1));
        assertTrue(3 == parsedData.getNumbers().get(2));


        assertTrue(parsedData.getOperators().get(0) instanceof Plus);
        assertTrue(parsedData.getOperators().get(1) instanceof Plus);
    }

}