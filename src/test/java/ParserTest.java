import org.junit.Assert;
import org.junit.Test;
import parser.Parser;
import parser.data.ParsedData;
import parser.data.SplitedData;

import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

public class ParserTest {

    @Test
    public void parsing1() {

        //given
        Parser parser = new Parser();

        String input = "1+2+3";


        //when
        Optional<ParsedData> optParsedData = parser.parsing(input);

        ParsedData parsedData = optParsedData.get();

        //then
        Assert.assertEquals(1, parsedData.getNumbers().get(0));
        Assert.assertEquals(2, parsedData.getNumbers().get(1));
        Assert.assertEquals(3, parsedData.getNumbers().get(2));


        Assert.assertEquals("+", parsedData.getOperators().get(0));
        Assert.assertEquals("+", parsedData.getOperators().get(1));
    }

    @Test
    public void parsing2() {

        //given
        Parser parser = new Parser();

        String input = "200/10*3000";


        //when
        Optional<ParsedData> optParsedData = parser.parsing(input);

        ParsedData parsedData = optParsedData.get();

        //then
        Assert.assertEquals(200, parsedData.getNumbers().get(0));
        Assert.assertEquals(10, parsedData.getNumbers().get(1));
        Assert.assertEquals(3000, parsedData.getNumbers().get(2));


        Assert.assertEquals("/", parsedData.getOperators().get(0));
        Assert.assertEquals("*", parsedData.getOperators().get(1));
    }

    @Test
    public void parsing_사용하지않는연산자() {

        //given
        Parser parser = new Parser();

        String input = "200=10*3000";


        //when
        Optional<ParsedData> optParsedData = parser.parsing(input);

        //then
        Assert.assertFalse(optParsedData.isPresent());
    }

    @Test
    public void parsing_잘못된연산자수() {

        //given
        Parser parser = new Parser();

        String input = "200+10*3000+";

        //when
        Optional<ParsedData> optParsedData = parser.parsing(input);

        //then
        Assert.assertFalse(optParsedData.isPresent());
    }

    @Test
    public void parsing_잘못된연산자수2() {

        //given
        Parser parser = new Parser();

        String input = "*200+10*3000+";

        //when
        Optional<ParsedData> optParsedData = parser.parsing(input);

        //then
        Assert.assertFalse(optParsedData.isPresent());
    }

    @Test
    public void parsing_잘못된문자() {

        //given
        Parser parser = new Parser();

        String input = "200+10*3000k";

        //when
        Optional<ParsedData> optParsedData = parser.parsing(input);

        //then
        Assert.assertFalse(optParsedData.isPresent());
    }

    @Test
    public void splitNumAndOperator() {
        //given
        Parser parser = new Parser();

        //input
        String input = "10/4*1-2+3";
        String regex = "[-+*/]";

        //when
        SplitedData splitedData = parser.splitNumAndOperator(input, regex);

        List<String> numbers = splitedData.getNumbers();
        List<String> operators = splitedData.getOperators();

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