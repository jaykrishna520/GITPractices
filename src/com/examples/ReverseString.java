package com.examples;

public class ReverseString {

	public static String reverseStr(String str) {
		StringBuffer sb = new StringBuffer();
		char ch[] = str.toCharArray();
		int len = ch.length - 1;
		for (int i = len; i >= 0; i--) {

			sb.append(ch[i]);

		}

		return sb.toString();

	}

	public static String reverseStrRecursive(String str1) {
		String reverse = "";
		if (str1.length() < 2) {
			return str1;

		} else {

			reverse += reverseStrRecursive(str1.substring(1)) + str1.charAt(0);
			return reverse;

		}

	}

	public static void main(String args[]) {

		String revStr = reverseStr("Hello");
		String revStr2 = reverseStr("Hello");
		System.out.println(revStr);
		System.out.println(revStr2);
	}

}
