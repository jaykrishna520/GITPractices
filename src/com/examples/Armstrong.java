package com.examples;

public class Armstrong {

	public static void main(String args[]) {

		int temp, sum = 0, r;
		int n = 153;
		temp = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + (r * r * r);

		}
		if (temp == sum) {
			System.out.println("is Armstrong");

		} else {
			System.out.println("Not Armstrong");

		}
	}

}
