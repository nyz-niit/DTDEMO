package arrayEx;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows and Columns");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int c[][] = new int[row][col];// For Storing the result of two array

		System.out.println("Enter Values into the First Array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int n = sc.nextInt();
				a[i][j] = n;
			}
		}
		
		System.out.println("Enter Values into the Second Array");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int n = sc.nextInt();
				b[i][j] = n;
			}
		}
		
		
		System.out.println("Going to Add the Matrix");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Priting the Array"); 
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}

	}

}
