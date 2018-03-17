package com.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Palindrome {

	public static void main(String args[]) {

		int reverse = 0, sum = 0, temp;
		int n = 454;
		temp = n;
		while (n > 0) {

			reverse = n % 10;
			sum = sum * 10 + reverse;
			n = n / 10;

		}

		if (temp == sum) {

			System.out.println(sum  + " is a palindrome");
		}

	}

}
