package cis350Testing;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(1, 1), 0);
	}
	@Test
	public void testMul() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mul(3, 5), 15);
	}
	@Test
	public void testDiv() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(8, 2), 4);
	}
	@Test 
	public void testPow() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.pow(2, 3), 8);
	}
	@Test 
	public void testFactorial() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.fact(5), 120);
	}
	@Test
	public void testCubed() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.cube(5), 125);
	}
	@Test
	public void testSqaure() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.square(5), 25);
	}
}
