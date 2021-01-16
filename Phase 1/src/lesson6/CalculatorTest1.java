package lesson6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class CalculatorTest1 {
	Calculator calculate = new Calculator();

	@Test
	public void testAddition() {
		System.out.println("Starting Test: " + new Object() {}.getClass().getEnclosingMethod());
		assertEquals(300, calculate.Addition(100, 200));
		System.out.println("Ending Test: " + new Object() {}.getClass().getEnclosingMethod());
	}
	
	@Test
	public  void testSubstraction() {
		System.out.println("Starting Test: " + new Object() {}.getClass().getEnclosingMethod());
		assertEquals(-100, calculate.Addition(100, 200));
		System.out.println("Ending Test: " + new Object() {}.getClass().getEnclosingMethod());
	}
	
	@Test
	public  void testMultiplication() {
		System.out.println("Starting Test: " + new Object() {}.getClass().getEnclosingMethod());
		assertEquals(100, calculate.Addition(100, 200));
		System.out.println("Ending Test: " + new Object() {}.getClass().getEnclosingMethod());
	}
}
