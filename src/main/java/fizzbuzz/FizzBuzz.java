package fizzbuzz;


public class FizzBuzz {

	public static String [] getFizzBuzz(int a, int b) {
	
		String [] listExpected= new String [b];
		
		if(b>a) {
			for(int i=a; i<=b; i++) {

				if(i%3==0 && i%5==0) {
					listExpected[i-1]="Fizz Buzz";
				}
				else if(i%5==0) {
					listExpected[i-1]="Buzz";
			
				}
				else if(i%3==0) {
					listExpected[i-1]="Fizz";

				}else {
					listExpected[i-1]=String.valueOf(i);
				}
			}
			
		}		
		return listExpected;
	}
	
}
