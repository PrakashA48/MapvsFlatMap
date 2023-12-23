package com.techjavatech.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GFG {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		 list.add(new Student(1, "Greeks"));
		 list.add(new Student(2, "For"));
		 list.add(new Student(3, "Greeks"));
		 
		 Map<Integer, String> map = new HashMap<Integer, String>();
		 for(Student st : list) {
			 map.put(st.getId()	, st.getName());
		 }
		 
		 //print map
		 System.out.println("map : "+map );
	}
	
	
	

}
