package com.hcl.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class ArrayListTest{

	public static void main(String[] args) {
		List<String> arrListRef = new ArrayList<String>();
		arrListRef.add("Aravind");
		arrListRef.add("Ravi");
		arrListRef.add("Bhaskar");
		arrListRef.add("Ravindra");
		arrListRef.add("Varun");
		arrListRef.add("Ravindra");

		// Iterate Elements
		System.out.println("-----Without using Java 8 FOREACH and LAMBDA expressions-----");
		for (String arrList : arrListRef) {
			System.out.println(arrList);
		}

		System.out.println("-----By using Java 8 FOREACH and LAMBDA expressions. Print all Elements-----");
		arrListRef.forEach(arrList -> {
			System.out.println(arrList);
		});

		System.out.println(
				"-----By using Java 8 FOREACH and LAMBDA expressions. Convert each elements to UpperCase-----");
		arrListRef.forEach(upperCaseRef -> {
			System.out.println(upperCaseRef.toUpperCase());
		});

		System.out.println(
				"-----By using Java 8 FOREACH and LAMBDA expressions. Convert each elements to LowerCase-----");
		arrListRef.forEach(lowercaseRef -> {
			System.out.println(lowercaseRef.toLowerCase());
		});

		System.out.println("-----Replace Character-----");
		arrListRef.forEach(lowercaseRef -> {
			System.out.println(lowercaseRef.replace('a', 'd'));
		});

		System.out.println("-----Remove Duplicates-----");
		Set<String> setRef = new HashSet<String>();
		arrListRef.forEach(arrList -> {
			setRef.add(arrList);
		});
		System.out.println(setRef);

		System.out.println("-----FILTER Data by using Java 8 STREAM-----");
		Stream<String> filterData = arrListRef.stream().filter(name -> name.length() > 5);

		System.out.println("-----Iterate Data by using Java 8 FOREACH and LAMBDA expressions-----");
		filterData.forEach(ref -> {
			System.out.println(ref);
		});

		
		System.out.println("-----FILTER Data by using Java 8 STREAM, FOREACH and LAMBDA expressions-----");
		arrListRef.stream().filter(n -> n.length() > 5).forEach(ref -> {
			System.out.println(ref);
		});

	}

}
