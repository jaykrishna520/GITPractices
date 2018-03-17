package com.examples;

public class MatrixMultiplicationExample {

	public MatrixMultiplicationExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		// creating two matrices
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		// creating another matrix to store the multiplication of two matrices
		int c[][] = new int[3][3]; // 3 rows and 3 columns

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];

				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
