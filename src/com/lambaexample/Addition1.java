package com.lambaexample;

public class Addition1 implements Addition{

	@Override
	public int add(int a, int b) {
		System.out.println("Inside two parameter method");
		
		return a+b;
	}

}
