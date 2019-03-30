package calc;

import org.junit.Before;
import org.junit.Test;
import parser.Parser;
import parser.data.Numbers;
import parser.data.Operators;
import parser.data.ParsedData;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before() {
        //given
        calc = Calculator.of(new Parser());
    }

    @Test
    public void calc() {
        //given
        ParsedData parsedData = ParsedData.builder()
                .numbers(Numbers.of(Arrays.asList(1, 2, 3, 4)))
                .operators(Operators.of(Arrays.asList("+", "-", "*")))
                .build();

        //when
        int result = calc.calc(parsedData);

        //then
        assertEquals(0, result);
    }
}