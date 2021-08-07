import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addTest() {
        assertEquals("Error, number is add not corect", 15.5, calculator.add(5.1, 10.4), 0);
    }

}