package com.examples;

public class PrimeNumber {

	static void checkPrime(int x) {

		int m, flag = 0;
		m = x / 2;

		if (x == 0 || x == 1) {

			System.out.println(x + "is a Not Prime Number");

		} else {
			for (int i = 2; i <= m; i++) {

				if (x % i == 0) {
					flag = 1;
					System.out.println(x + " is a Not Prime Number");
					break;
				}
			}
			if (flag == 0) {
				System.out.println(x + " is a Prime Number");

			}
		}
	}

	public static void main(String args[]) {
		checkPrime(1);
		checkPrime(3);
		checkPrime(17);
		checkPrime(20);
		checkPrime(35);
	}

}
