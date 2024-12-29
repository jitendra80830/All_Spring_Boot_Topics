package ashok.in;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest(){

        Calculator calculator = new Calculator();

        int expected = calculator.add(10, 30);
        int actual = 40;
        assertEquals(expected , actual);

    }
    @Test
    public void divTest(){

        Calculator calculator = new Calculator();

        int expected = calculator.div(10, 5);
        int actual = 2;
        assertEquals(expected , actual);

    }

}
