import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void canAdd() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add(2, 4));
    }

    @Test
    public void canSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void canMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.multiply(3, 3));
    }

    @Test
    public void canDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.divide(9.9, 3.3), 0.1);
    }
}
