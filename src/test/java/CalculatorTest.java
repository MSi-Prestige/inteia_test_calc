import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    Calculator calculatorDividr = new Calculator();

    @Test
    public void addTest() {
        assertEquals("Error, number is add not corect", 15.5, calculator.add(5.1, 10.4), 0);
    }

    @Test
    public void divisionTest() {
        assertEquals("Error, number is add not corect", 5, calculatorDividr.division(15, 3), 0);
    }

}