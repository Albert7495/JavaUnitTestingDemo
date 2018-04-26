package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculatorTest {
	 private Calculator calculator;
	 

	 
	@Test
	  @DisplayName("SUMA")
	  void testSuma() {
		calculator = new Calculator();	
		int expected=5;
	    assertEquals(expected, calculator.Suma(2,3));
	  }
	@Test
	  @DisplayName("Multiplicacion")
	  void testMultiplicacion() {
		calculator = new Calculator();	
		int expected=6;
	    assertEquals(expected, calculator.Multiplicacion(2,3));
	  }
	@Test
	  @DisplayName("Division")
	  void testDivison() {
		calculator = new Calculator();	
		int expected=5;
	    assertEquals(expected, calculator.Division(10,2));
	  }
	@Test
	  @DisplayName("Resta")
	  void testResta() {
		calculator = new Calculator();	
		int expected=2;
	    assertEquals(expected, calculator.Resta(5,3));
	  }
	
	@Test
	  @DisplayName("DivisionCero")
	  void testDivisionCero() {
		calculator = new Calculator();	
		int expected=0;
	    assertEquals(expected, calculator.Division(5,0));
	  }
	
	
	
	@Test
	void SumaMock() {
		Calculator cal =mock(Calculator.class);

		when(cal.Suma(10,20)).thenReturn(80);
		int numbers= cal.Suma(10,20);
		assertEquals(80,numbers);
	}
	
	@Test
	void RestaMock() {
		Calculator cal =mock(Calculator.class);	
		when(cal.Resta(10,20)).thenReturn(50);
		int numbers= cal.Resta(10,20);
		
		assertEquals(50,numbers);
	}
	@Test
	void MultiplicacionMock() {
		Calculator cal =mock(Calculator.class);
		
		when(cal.Multiplicacion(10,20)).thenReturn(32);
		
		int numbers= cal.Multiplicacion(10,20);
		
		assertEquals(32,numbers);
	}
	@Test
	void DivisionMock() {
		Calculator cal =mock(Calculator.class);
		
		when(cal.Division(10,20)).thenReturn(67);
		
		int numbers= cal.Division(10,20);
		
		assertEquals(67,numbers);
	}

}