/*Read two matrices of size n X n.
Perform multiplication operation and store result in third matrix 
and print it.*/

import java.util.Scanner;

public class Array_Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, col, temp, max;

        System.out.print("Enter order of matrix 1 (row<space>column) : ");
		int matrix1[][] = new int[sc.nextInt()][sc.nextInt()];

        for(row = 0; row < matrix1.length; row++) {
			for (col = 0; col < matrix1[0].length; col++) {
				System.out.print("Enter element "+row+col+" : ");
				matrix1[row][col] = sc.nextInt();
			}
		}

        System.out.print("Enter order of matrix  2 (is<space>jumn) : ");
		int matrix2[][] = new int[sc.nextInt()][sc.nextInt()];

        for(row = 0; row < matrix2.length; row++) {
			for (col = 0; col < matrix2[0].length; col++) {
				System.out.print("Enter element "+row+col+" : ");
				System.out.print("Enter element "+row+" "+col);

				matrix2[row][col] = sc.nextInt();
			}
		}

        int matrix3[][] = new int[matrix1.length][matrix2[0].length];

        if(matrix1.length >= matrix2[0].length) {
                    max = matrix1.length;
        }    
        else{
                    max = matrix2[0].length;
        }
// vandho ave che 47 line ma.
        for(row = 0; row < matrix1.length; row++) {
            for(col = 0; col < matrix2[0].length; col++) {
                for(temp = 0; temp < max; temp++) {
                        matrix3[row][col] += matrix1[row][temp]*matrix2[temp][col];
                }
            }
        }

        System.out.println("Multiplication of both matrices is : ");

        for(row = 0; row < matrix3.length; row++) {
			for(col = 0; col < matrix3[0].length; col++) {
				System.out.print(matrix3[row][col]+" ");
			}

			System.out.println();
		}
    }
}