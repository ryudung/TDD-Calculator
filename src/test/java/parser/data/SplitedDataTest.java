package parser.data;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SplitedDataTest {

    @Test
    public void isSizeValid_true() {
        //given
        SplitedData splitedData = SplitedData.builder()
                .operators(Arrays.asList("+", "-"))
                .numbers(Arrays.asList("1", "2", "3"))
                .build();
        //when
        boolean isSizeValid = splitedData.isSizeValid();

        //then
        assertTrue(isSizeValid);
    }

    @Test
    public void isSizeValid_false() {
        //given
        SplitedData splitedData = SplitedData.builder()
                .operators(Arrays.asList("+", "-", "-"))
                .numbers(Arrays.asList("1", "2", "3"))
                .build();
        //when
        boolean isSizeValid = splitedData.isSizeValid();

        //then
        assertFalse(isSizeValid);
    }
}