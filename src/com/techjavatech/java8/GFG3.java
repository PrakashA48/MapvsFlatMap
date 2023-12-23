package com.techjavatech.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GFG3 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Greeks"));
		list.add(new Student(2, "For"));
		list.add(new Student(3, "Greeks"));

		Map<Integer, List<String>> multimap = list.stream().collect(
				Collectors.groupingBy(Student::getId, Collectors.mapping(Student::getName, Collectors.toList())));
		System.out.println(multimap);
	}

}
