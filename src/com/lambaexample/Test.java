package com.lambaexample;

public class Test {

	public static void main(String[] args) {
		FunctionalInterface fo = (int x) -> {
			System.out.println(2 * x);
		};

		fo.abstractFun(5);
	}

}
