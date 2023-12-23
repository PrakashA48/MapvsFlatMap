package com.lambaexample;

public class Demo {

	interface FuncInter1 {
		int operation(int a, int b);
	}

	interface FuncInter2 {
		void sayMessage(String message);
	}

	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a, b);
	}

	public static void main(String[] args) {
		
		FuncInter2 ff = message ->{
			System.out.println("Hellp" +message);
		
		};
		
		FuncInter1 add = (int x, int y)-> {
			
			return x + y;
			
		};
		
		Demo dd = new Demo();
		System.out.println(dd.operate(2, 2, add));
		
		FuncInter1 multifly = (int x, int y) -> {
			return x * y;
		};
		
		System.out.println(dd.operate(2, 3, multifly));
		
		

	}
}