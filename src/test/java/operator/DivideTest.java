package operator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class DivideTest {
    @Test
    public void calc() {
        //given
        Operator operator = new Divide();

        //when
        int result = operator.calc(6, 2);

        //then
        assertEquals(3, result);
    }
}