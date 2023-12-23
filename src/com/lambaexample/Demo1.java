package com.lambaexample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(3, "Apple");
		map.put(4, "Orange");
		map.put(4, "Apple");
		
		System.out.println(map);
		
		System.out.println(map.get(3));
		System.out.println("enter the key");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		System.out.println(map.get(key));
		
		
		
	
		
		
		
		

	}

}
