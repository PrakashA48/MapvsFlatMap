package com.techjavatech;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class MapvsFlatMap {
	
	public static void main(String[] args) {
		List<Customer> customers = DataBase.getAll();
		//customer -> customer.getEmail() -> one to one mapping
		List<String> email = customers.stream()
			.map(customer -> customer.getEmail())
				.collect(Collectors.toList());
		System.out.println(email);
		
		System.out.println();
		
		List<List<String>> phoneNumbers =customers.stream().map(cust -> cust.getPhoneNumbers())
			.collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
		System.out.println();
		
		List<String> phones =customers.stream().flatMap(cust -> cust.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		
		System.out.println(phones);
		
		List<String> desc = phones.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(desc);
		
		//phones.stream().sorted(Comparator.reverseOrder()).forEach(w->System.out.print(" "+w));
		//phones.stream().sorted().forEach(w->System.out.print(" "+w));
		List<String> phascending = phones.stream().sorted().skip(2).collect(Collectors.toList());
		System.out.println(phascending);
			
		
	}

}
