package com.howtoprogram.junit5.observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;
//import io.reactivex.Observable;

public class DemoObservablesInt {

	public static Integer[] GreatherThanTen(Integer[] arrNumbers) {

//	        List<Integer> resultList = new ArrayList<>();
//	        	     
//	        Flowable
//	                .fromArray(arrNumbers)
//	                .filter(x -> x > 10)
//	                .toList()
//	                .subscribe(x -> {
//	                	resultList.addAll(x);
//	                });
//
//	        Integer[] array = new Integer[resultList.size()];
//	        
//	        for(int i=0;i<array.length;i++) {
//	            array[i] = resultList.get(i);
//	            System.out.println(array[i]);
//	         }
		
//	        return array;
		
		 Integer[] arrIntNumbers = Arrays
				 .stream(arrNumbers)
				 .filter(x -> x > 10)
				 .toArray(Integer[]::new);
		 
		 return arrIntNumbers;
	}

	public static Integer[] DuplicateNumbers(Integer[] arrNumbers) {
	
	        List<Integer> resultList = new ArrayList<>();

	        Flowable
	                .fromArray(arrNumbers)
	                .map(x -> x*2)
	                .toList()
	                .subscribe(x -> {
	                	resultList.addAll(x);
	                });

	        	Integer[] array = new Integer[resultList.size()];
	        	
	        	for(int i=0;i<array.length;i++) {
		            array[i] = resultList.get(i);
		            System.out.println(array[i]);
		         }        	
	        return array;
	        
//	   	 Integer[] arrIntNumbers = Arrays
//				 .stream(arrNumbers)
//				 .map(x -> x*2)
//				 .toArray(Integer[]::new);
//		 
//		 return arrIntNumbers;

	}

	
}
