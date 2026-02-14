import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();
	
	@Test
	public void test() {
		assertEquals(4, calculator.add(2, 2));
	}
	@Test
	public void testing() {
		assertEquals(9, calculator.add(7, 2));
	}
	
}
