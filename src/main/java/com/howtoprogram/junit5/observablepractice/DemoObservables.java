package com.howtoprogram.junit5.observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;
//import io.reactivex.Observable;

public class DemoObservables {

	public static int[] GreatherThanTen(int[] arrNumbers) {

		 Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);

	        List<Integer> resultList = new ArrayList<>();

	        Flowable
	                .fromArray(arrIntNumbers)
	                .filter(x -> x > 10)
	                .toList()
	                .subscribe(x -> {
	                    resultList.addAll(x);
	                });

	        /*Observable
	                .fromArray(arrIntNumbers)
	                .filter(x -> x > 10);*/

	        return resultList.stream().mapToInt(x -> x).toArray();
	}

	public static int[] DuplicateNumbers(int[] arrNumbers) {
	
		 Integer[] arrIntNumbers = Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);

	        List<Integer> resultList = new ArrayList<>();

	        Flowable
	                .fromArray(arrIntNumbers)
	                .map(x -> x*2)
	                .toList()
	                .subscribe(x -> {
	                    resultList.addAll(x);
	                });

	        /*Observable
	                .fromArray(arrIntNumbers)
	                .filter(x -> x > 10);*/

	        return resultList.stream().mapToInt(x -> x).toArray();
	}

	
}
