import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class B1T1_1 {

    @Test
    public void testSumPositiveNumbers() {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(5, 7);
        assertEquals(12, result);
    }

    @Test
    public void testSumNegativeNumbers() {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(-5, -7);
        assertEquals(-12, result);
    }

    @Test
    public void testSumPositiveAndNegativeNumbers() {
        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(5, -7);
        assertEquals(-2, result);
    }
}
