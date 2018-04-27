package com.howtoprogram.junit5.observablepractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;



public class DemoObservablesTestInt {

	Integer[] arrNumbers= {1,5,10,20};
	
	@Test
	@DisplayName("should Greather Than Ten")
	  public void shouldGreatherThanTen() {
		
		Integer [] listExpected= {20};
		
		Integer [] result= DemoObservablesInt.GreatherThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("should Duplicate")
	public void shouldDuplicateNumbers() {
		
		Integer [] listExpected= {2,10,20,40};
		Integer [] result= DemoObservablesInt.DuplicateNumbers(arrNumbers);
		
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("should Validate Empty Duplicate")
	public void shouldValidateEmptyArrayDuplicate() {
		
		Integer [] listExpected= {};
		Integer [] testList= {};
	
		Integer [] result= DemoObservablesInt.DuplicateNumbers(testList);
		
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("should Validate Greather Than Ten")
	public void shouldValidateEmptyGreatherThanTen() {
		
		Integer [] listExpected= {};
		Integer [] testList= {};
		
		
		Integer [] result= DemoObservablesInt.GreatherThanTen(testList);
		assertArrayEquals(listExpected,result);
	}
}
