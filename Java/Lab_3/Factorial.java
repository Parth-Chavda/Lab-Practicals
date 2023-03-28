//Find factorial of given number.

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number : ");
		int fctl = sc.nextInt();

		for (int counter = fctl-1; counter > 0; counter--) {
			
			fctl *= counter; 
		} 

		System.out.println("Factorial of given number is "+fctl+".");
	}
}