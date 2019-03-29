package parser.data;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NumbersTest {

    private Numbers numbers;

    @Before
    public void before() {
        //given
        numbers = Numbers.of(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void findFirst() {


        //when
        int num = numbers.findFirst();

        //then
        assertEquals(1, num);
    }

    @Test
    public void get() {
        //when
        int num1 = numbers.get(0);
        int num2 = numbers.get(1);
        int num3 = numbers.get(2);
        int num4 = numbers.get(3);

        //then
        assertEquals(1, num1);
        assertEquals(2, num2);
        assertEquals(3, num3);
        assertEquals(4, num4);
    }
}