package com.techjavatech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {
	
	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101, "john" ,"john@gamil.com", Arrays.asList("1236455", "6464669")),
				new Customer(102, "smith" ,"smith@gamil.com", Arrays.asList("1646646", "5664669")),
				new Customer(103, "peter" ,"peter@gamil.com", Arrays.asList("1985455", "9864669")),
				new Customer(104, "kely" ,"kely@gamil.com", Arrays.asList("1235685", "6698669"))
				).collect(Collectors.toList());
		
	}

}
