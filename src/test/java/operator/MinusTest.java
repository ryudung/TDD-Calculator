package operator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinusTest {

    @Test
    public void calc() {
        //given
        Operator operator = new Minus();

        //when
        int result = operator.calc(2, 1);

        //then
        assertEquals(1, result);
    }
}