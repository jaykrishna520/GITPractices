package com.examples;

public class FibonacciExample2 {

	
	static int n1 = 0, n2 = 1, n3 = 0;

	public static void fiboRecursive(int count) {
		
		// TODO Auto-generated method stub
		if (count > 0) {
		
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
				fiboRecursive(count - 1);

		}
	}
	

	public static void main(String args[]) {
		int count = 10;

		System.out.print(n1 + " " + n2);
		fiboRecursive(count - 2);

	}
}
