import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)  //damit @beforeAll nicht static sein muss
class ICalculatorTest {

    private ICalculator calc;

    @BeforeAll
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void add_zero() {
        Integer result = calc.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    void add_negative() {
        Integer result = calc.add(-124, -10);
        assertEquals(-134, result);
    }

    @Test
    void add_positive() {
        Integer result = calc.add(2, 999);
        assertEquals(1001, result);
    }

    @Test
    void add_max_value() {
        Integer halfOfMaxValue =  Integer.MAX_VALUE / 2;
        Integer result = calc.add(halfOfMaxValue, halfOfMaxValue);
        assertEquals(halfOfMaxValue*2, result);
    }

    @Test
    void add_null() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.add(10, null);
        });
    }


    @Test
    void subtract_zero() {
        Integer result = calc.subtract(0, 0);
        assertEquals(0, result);
    }

    @Test
    void subtract_positive() {
        Integer result = calc.subtract(678, 99);
        assertEquals(579, result);
    }

    @Test
    void subtract_negative() {
        Integer result = calc.subtract(-10, -20);
        assertEquals(10, result);
    }

    @Test
    void subtract_max_value() {
        final Integer minuend = Integer.MAX_VALUE;
        final Integer subtrahend = 98765;

        Integer result = calc.subtract(minuend,subtrahend );

        final Integer expected = minuend - subtrahend;
        assertEquals(expected, result);
    }

    @Test
    void subtract_null() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.subtract(10, null);
        });
    }


    @Test
    void multiply_zero() {
        Integer result = calc.multiply(12345, 0);
        assertEquals(0, result);
    }

    @Test
    void multiply_positive() {
        Integer result = calc.multiply(4, 1001);
        assertEquals(4004, result);
    }

    @Test
    void multiply_negative() {
        Integer result = calc.multiply(11, -10);
        assertEquals(-110, result);
    }

    @Test
    void multiply_max_value() {
        Integer result = calc.multiply(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    void multiply_null() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.multiply(null, 11);
        });
    }


    @Test
    void divide_zero() {
        Integer result = calc.divide(0, 35235);
        assertEquals(0, result);
    }

    @Test
    void divide_by_zero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(1111, 0);
        });
    }

    @Test
    void divide_positive() {
        Integer result = calc.divide(150, 30);
        assertEquals(5, result);
    }

    @Test
    void divide_negative() {
        Integer result = calc.divide(999, -3);
        assertEquals(-333, result);
    }

    @Test
    void divide_max_value() {
        final Integer dividend = Integer.MAX_VALUE;
        final Integer divisor = 1000;

        Integer result = calc.divide(dividend, divisor);

        final Integer expected = dividend/divisor;
        assertEquals(expected, result);
    }

    @Test
    void divide_null() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(null, 0);
        });
    }


}