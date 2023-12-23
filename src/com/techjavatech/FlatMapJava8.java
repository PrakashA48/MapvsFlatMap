package com.techjavatech;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapJava8 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
		List<Integer> list3 = Arrays.asList(11, 12, 13, 14, 15);
		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		System.out.println(list);

		
		
		List<Integer> flatmap = list.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println(flatmap);
//		flatmap.stream().sorted(Comparator.reverseOrder()).skip(0).collect(Collectors.toList())
//				.forEach(System.out::print);
		
	}

}
