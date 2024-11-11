package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumTest {
    Maximum maximum = new Maximum();
    @Test
    public void arrayWithDuplicates() {
        int[] numbers = {4, 3, 4, 3, 2};
        int result = maximum.calc(numbers);
        assertEquals(result, 4);
    }

    @Test
    public void arrayWithNegatives() {
        int[] numbers = {-1, -7, -5, -10};
        int result = maximum.calc(numbers);
        assertEquals(result, -1);
    }

    @Test
    public void arrayMixetWithNegatives() {
        int[] numbers = {0, 6, 2, -3, 10};
        int result = maximum.calc(numbers);
        assertEquals(result, 10);
    }

    @Test
    public void arrayWithZeros() {
        int[] numbers = {0, 0, 0, 0};
        int result = maximum.calc(numbers);
        assertEquals(result, 0);
    }
                    


}
