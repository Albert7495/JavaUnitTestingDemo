package fizzbuzz;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {

	@Test
	@DisplayName("should FizzBuzz")
	  public void shouldFizzBuzz() {
		
		String [] listExpected= {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz"};
		String [] result= FizzBuzz.getFizzBuzz(1,15);
		
		assertArrayEquals(listExpected, result);
	}
	
	@Test
	@DisplayName("should FizzBuzz NUll")
	  public void shouldFizzBuzzNull() {
		
		String [] listExpected= {null};
		String [] result= FizzBuzz.getFizzBuzz(15,1);
		
		assertArrayEquals(listExpected, result);
	}

}
