|/*Accept n numbers in an array. 
  Display sum of all numbers divisible by either 3 or 5.*/

import java.util.Scanner;

public class Div_3or5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		System.out.print("Enter array size : ");
		int array[] = new int[sc.nextInt()];

		for(int counter = 0; counter < array.length; counter++) {
			System.out.print("Enter number "+(counter+1)+" : ");
			array[counter] = sc.nextInt();

			if(array[counter] % 3 == 0 || array[counter] % 5 == 0) {
				sum += array[counter];
			}
		}

		System.out.println("Sum of numbers divisible by 3 or 5 = "+sum);		
	}
}
