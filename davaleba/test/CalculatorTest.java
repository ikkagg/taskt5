import ge.edu.btu.CalculatorServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void CalulatorTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

        assertEquals(7,calculatorService.sum(3,4));
        assertEquals(8,calculatorService.prod(4,2));

    }
}
