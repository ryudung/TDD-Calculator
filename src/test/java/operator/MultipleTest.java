package operator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MultipleTest {

    @Test
    public void calc() {
        //given
        Operator operator = new Multiple();

        //when
        int result = operator.calc(3, 4);

        //then
        assertEquals(12, result);
    }
}