import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
//    Calculator calculator = new Calculator();
//    Calculator calculatorMultiply = new Calculator();
//    Calculator calculatorSubtract = new Calculator();

    @Test
    public void addTest() {
        assertEquals("Error, number is add not corect", 14.5, calculator.add(4.1, 10.4), 0);
    }

    // Test calculator.
    @Test
    public void divisionTest() {
        assertEquals("Error, number is add not corect", 5, calculator.division(15, 3), 0);
    }

    // Test calculator.
    @Test
    public void multiply() {
        assertEquals("Error, number is add not corect", 8, calculator.multiply(4, 2), 0);
    }

    @Test
    public void subtract() {
        assertEquals("Error, number is add not corect", 10, calculator.subtract(15, 5), 0);
    }
}