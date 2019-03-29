package calc;

import operator.Minus;
import operator.Multiple;
import operator.Plus;
import org.junit.Before;
import org.junit.Test;
import parser.data.ParsedData;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before() {
        //given
        calc = new Calculator();
    }

    @Test
    public void calc() {
        //given
        ParsedData parsedData = ParsedData.builder()
                .numbers(Arrays.asList(1, 2, 3, 4))
                .operators(Arrays.asList(new Plus(), new Minus(), new Multiple()))
                .build();

        //when
        int result = calc.calc(parsedData);

        //then
        assertEquals(0, result);
    }
}