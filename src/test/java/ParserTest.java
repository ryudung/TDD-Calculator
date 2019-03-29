import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ParserTest {
    @Test
    public void parsing() {

        Parser parser = new Parser();

        String input = "1+2+3";

        parser.parsing(input);
        //given
        //when
        //then
    }
}