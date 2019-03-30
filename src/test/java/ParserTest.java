import org.junit.Test;
import parser.Parser;
import parser.data.ParsedData;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void parsing() {

        //given
        Parser parser = new Parser();

        String input = "1+2+3";


        //when
        Optional<ParsedData> optParsedData = parser.parsing(input);

        ParsedData parsedData = optParsedData.get();

        //then
        assertTrue(1 == parsedData.getNumbers().get(0));
        assertTrue(2 == parsedData.getNumbers().get(1));
        assertTrue(3 == parsedData.getNumbers().get(2));


        assertTrue("+".equals(parsedData.getOperators().get(0)));
        assertTrue("+".equals(parsedData.getOperators().get(1)));
    }

    @Test
    public void splitOperator() {
        //given
        Parser parser = new Parser();
        String input = "10/4*1-2+3";

        //when
        String[] strings = input.split("[-+*/]");

        //then
        for (String str : strings) {
            System.out.println(str);
        }
    }

    @Test
    public void splitNumAndOperator() {
        //given

        //숫자
        List<String> numbers = new LinkedList<>();

        //연산자
        List<String> operators = new LinkedList<>();

        //input
        String input = "10/4*1-2+3";

        //when
        int last = 0;

        Pattern pattern = Pattern.compile("[-+*/]");

        Matcher m = pattern.matcher(input);

        while (m.find()) {

            numbers.add(input.substring(last, m.start()));

            operators.add(m.group());

            last = m.end();
        }

        numbers.add(input.substring(last));

        //then
        assertEquals("10", numbers.get(0));
        assertEquals("4", numbers.get(1));
        assertEquals("1", numbers.get(2));
        assertEquals("2", numbers.get(3));
        assertEquals("3", numbers.get(4));

        assertEquals("/", operators.get(0));
        assertEquals("*", operators.get(1));
        assertEquals("-", operators.get(2));
        assertEquals("+", operators.get(3));

    }
}