import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositCalculatorTest {

	@Test
	void testDeposit() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(32000.0 , 12.0, 2);
		assertEquals(39680, result);
	}
	
	@Test
	void testDeposit1() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(20000.0 , 7.0, 2);
		assertEquals(22800, result);
	}
	
}
