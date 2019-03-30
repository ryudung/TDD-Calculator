package parser.data;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

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

    @Test
    public void isValid_true() {
        //when
        boolean valid = operators.isValid();

        //then
        assertTrue(valid);
    }

    @Test
    public void isValid_false() {

        Operators nonValidOperators = Operators.of(Arrays.asList("+", "-", "*", "&"));

        //when
        boolean valid = nonValidOperators.isValid();

        //then
        assertFalse(valid);
    }
}