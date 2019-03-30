package parser.data;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class OperatorsTest {

    private Operators operators;

    @Before
    public void before() {
        operators = Operators.of(Arrays.asList("+", "-", "*"));
    }

    @Test
    public void get() {

        //when
        String operator = operators.get(0);

        //then
        assertEquals("+", operator);
    }

    @Test
    public void size() {

        //when
        int size = operators.size();

        //then
        assertEquals(3, size);
    }
}