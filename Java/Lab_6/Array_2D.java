//Read values in two-dimensional array and print them in matrix form.

import java.util.Scanner;

public class Array_2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row, col;

		System.out.print("Enter order of matrix (rows<space>column) : ");
		int array[][] = new int[sc.nextInt()][sc.nextInt()];
				

		for(row = 0; row < array.length; row++) {
			for (col = 0; col < array[0].length; col++) {
				System.out.print("Enter element "+row+col+": ");
				array[row][col] = sc.nextInt();
			}
		}

		for(row = 0; row < array.length; row++) {
			for(col = 0; col < array[0].length; col++) {
				System.out.print(array[row][col]+" ");
			}

			System.out.println();
		}
	}
}