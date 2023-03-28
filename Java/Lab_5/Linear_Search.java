/*Accept n numbers in an array.
Search a number in array using linear search.*/

import java.util.Scanner;

public class Linear_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int counter;

		System.out.print("Enter array size : ");
		int array[] = new int[sc.nextInt()];

		for(counter = 0; counter < array.length; counter++) {
			System.out.print("Index "+counter+" = ");
			array[counter] = sc.nextInt();
		}

		System.out.print("Enter number to search : ");
		int num = sc.nextInt();

		for(counter = 0; counter < array.length; counter++) {
			if(array[counter] == num) {
				break;
			}
		}

		if(counter < array.length) {
			System.out.println(num+" is present in array.");
		}
		else {
			System.out.println(num+" is not present in array.");
		}
	}
}
