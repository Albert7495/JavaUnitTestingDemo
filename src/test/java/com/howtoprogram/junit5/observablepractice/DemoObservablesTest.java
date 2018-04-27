package com.howtoprogram.junit5.observablepractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.howtoprogram.junit5.observablepractice.DemoObservables;

public class DemoObservablesTest {

	int[] arrNumbers= {1,5,10,20};
	
	@Test
	@DisplayName("should Greather Than Ten")
	  public void shouldGreatherThanTen() {
		
		int [] listExpected= {20};
		
		int [] result= DemoObservables.GreatherThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("should Duplicate")
	public void shouldDuplicateNumbers() {
		
		int [] listExpected= {2,10,20,40};
		int [] result= DemoObservables.DuplicateNumbers(arrNumbers);
		
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("should Validate Empty Duplicate")
	public void shouldValidateEmptyArrayDuplicate() {
		
		int [] listExpected= {};
		int [] testList= {};
	
		int [] result= DemoObservables.DuplicateNumbers(testList);
		
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("should Validate Greather Than Ten")
	public void shouldValidateEmptyGreatherThanTen() {
		
		int [] listExpected= {};
		int [] testList= {};
		
		
		int [] result= DemoObservables.GreatherThanTen(testList);
		assertArrayEquals(listExpected,result);
	}
}
