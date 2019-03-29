import org.junit.Test;
import parser.Parser;
import parser.data.ParsedData;

import static org.junit.Assert.assertTrue;

public class ParserTest {

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


        assertTrue("+".equals(parsedData.getOperators().get(0)));
        assertTrue("+".equals(parsedData.getOperators().get(1)));
    }

}