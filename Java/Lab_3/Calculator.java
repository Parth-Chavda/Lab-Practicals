//Make a simple calculator using switch...case.

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input first number : ");
		double num1 = sc.nextDouble();

		System.out.print("Input operator : ");
		char operator = sc.next().charAt(0);

		System.out.print("Input second number : ");
		double num2 = sc.nextDouble();
		
		switch(operator) {
			case '+' : 
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;

			case '-' : 
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;

			case '*' : 
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;

			case '/' : 
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;

			case '%' : 
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;

			default :
				System.out.println("Invalid input."); 
		}
	}
}