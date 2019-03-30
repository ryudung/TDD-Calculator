package operator;

import error.OperatorNotExist;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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

    @Test
    public void has() {
        //given
        String operator1 = "+";
        String operator2 = "-";
        String operator3 = "*";
        String operator4 = "/";

        String operator5 = "%";

        //when
        boolean has1 = Operator.has(operator1);
        boolean has2 = Operator.has(operator2);
        boolean has3 = Operator.has(operator3);
        boolean has4 = Operator.has(operator4);
        boolean has5 = Operator.has(operator5);

        //then
        assertTrue(has1);
        assertTrue(has2);
        assertTrue(has3);
        assertTrue(has4);
        assertFalse(has5);
    }
}