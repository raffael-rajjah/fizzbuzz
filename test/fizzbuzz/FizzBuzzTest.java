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

}
