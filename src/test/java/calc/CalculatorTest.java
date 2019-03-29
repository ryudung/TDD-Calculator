package calc;

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
    public void plus() {

        //when
        int result = calc.plus(1, 2);

        //then
        assertEquals(3, result);
    }

    @Test
    public void minus() {

        //when
        int result = calc.minus(2, 1);

        //then
        assertEquals(1, result);
    }

    @Test
    public void multiple() {

        //when
        int result = calc.multiple(2, 1);

        //then
        assertEquals(2, result);
    }

    @Test
    public void divide() {

        //when
        int result = calc.divide(6, 2);

        //then
        assertEquals(3, result);
    }

    @Test
    public void calc() {
        //given
        ParsedData parsedData = ParsedData.builder()
                .numbers(Arrays.asList(1, 2, 3, 4))
                .operators(Arrays.asList("+", "-", "*"))
                .build();

        //when
        int result = calc.calc(parsedData);

        //then
        assertEquals(0, result);
    }
}