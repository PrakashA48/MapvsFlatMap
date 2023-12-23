package com.techjavatech.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List cards = Arrays.asList("Visa", "MasterCard", "American Express", "Prakash");
		System.out.println("list: " + cards);

		Map cards2Length = (Map) cards.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1));
		System.out.println(cards2Length);
		
		//Map<String, Integer> cards2Length = hostingProviders.stream() .collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, LinkedHashMap::new)); System.out.println("map: " + cards2Length);

	
		
	}

}
