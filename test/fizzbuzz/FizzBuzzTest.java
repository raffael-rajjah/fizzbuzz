package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void fizz_1() {
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}
	
	@Test
	void fizz_2() {
		assertEquals(FizzBuzz.fizzbuzz(2), "2");
	}
	
	@Test
	void fizz_3() {
		assertEquals(FizzBuzz.fizzbuzz(3), "fizz");
	}
	
	@Test
	void fizz_5() {
		assertEquals(FizzBuzz.fizzbuzz(5), "buzz");
	}
	
	@Test
	void fizz_multiple() {
		assertEquals(FizzBuzz.fizzbuzz(20), "buzz");
		assertEquals(FizzBuzz.fizzbuzz(40), "buzz");
		assertEquals(FizzBuzz.fizzbuzz(21), "fizz");
		assertEquals(FizzBuzz.fizzbuzz(9), "fizz");
	}
	
	@Test
	void fizz_15() {
		assertEquals(FizzBuzz.fizzbuzz(15), "fizzbuzz");
	}

}
