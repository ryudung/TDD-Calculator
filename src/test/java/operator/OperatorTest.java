package operator;

import error.OperatorNotExist;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorTest {

    @Test
    public void operate_plus() {
        //given
        String operator = "+";

        //when
        int result = Operator.operate(operator, 1, 2);

        //then
        assertEquals(3, result);
    }

    @Test
    public void operate_divide() {
        //given
        String operator = "/";

        //when
        int result = Operator.operate(operator, 6, 2);

        //then
        assertEquals(3, result);
    }

    @Test
    public void operate_multiple() {
        //given
        String operator = "*";

        //when
        int result = Operator.operate(operator, 6, 2);

        //then
        assertEquals(12, result);
    }

    @Test
    public void operate_minus() {
        //given
        String operator = "-";

        //when
        int result = Operator.operate(operator, 1, 2);

        //then
        assertEquals(-1, result);
    }

    @Test(expected = OperatorNotExist.class)
    public void operate_notFound() {
        //given
        String operator = "%";

        //when
        Operator.operate(operator, 1, 2);

    }
}