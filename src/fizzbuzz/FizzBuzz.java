package fizzbuzz;

public class FizzBuzz {
	
	public static String fizzbuzz(int i) {
		
		StringBuilder fb = new StringBuilder();
		
		if(i % 3 == 0) {
			fb.append("fizz");
		}
		
		if (i % 5 == 0) {
			fb.append("buzz");
		}
		
		
		if (i % 3 != 0 && i % 5 != 0) {
			fb.append(i);
		}
		
		return fb.toString();
	}
}
