package com.howtoprogram.junit5;

public class Calculator {

	

	public int Suma(int a,int b) {
		return a + b;
	}
	
	public int Resta(int a,int b) {
		return a-b;
	}
	
	public int Division(int a,int b) {
		
		if(b==0) {
			return 0;
		}
		else {
			return a/b;
		}
		
	}
	public int Multiplicacion(int a, int b) {
		return a*b;
	}
}
