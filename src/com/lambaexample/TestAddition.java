package com.lambaexample;

public class TestAddition {

	public static void main(String[] args) {
		Addition ar =(int a, int b) -> {
			System.out.println("inside addition method with lamda expression ");
			return (a-b) ;
		};
		System.out.println(ar.add(20, 60));
		
		System.out.println();
		
		Addition aa = new Addition1();
		System.out.println(aa.add(20, 60));

	}

}
