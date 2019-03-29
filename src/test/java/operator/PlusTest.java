package operator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusTest {

    @Test
    public void calc() {
        //given
        Operator operator = new Plus();

        //when
        int result = operator.calc(1, 1);

        //then
        assertEquals(2, result);
    }
}