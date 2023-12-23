package com.techjavatech.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GFG2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		 list.add(new Student(1, "Greeks"));
		 list.add(new Student(2, "For"));
		 list.add(new Student(3, "Greeks"));
		 
		 LinkedHashMap<Integer, String> map = list.stream()
				 .collect(
						 Collectors
						 .toMap(
				 Student::getId,
				 Student::getName,
				 (x,y)
				 ->x + ", " + y,
				 LinkedHashMap ::new ));
		 System.out.println(map);
		  
		 map.forEach(
				 (X,Y) -> System.out.println(X + " = "+ Y));
				 
		
	}
	
	
	

}
