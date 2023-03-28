//Read marks of five subjects, calculate percentage and print class.

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double percent;

		System.out.println("Enter marks of subjects.");

		System.out.print("DBMS : ");
		double marks1 = sc.nextDouble();

		System.out.print("Mathematics : ");
		double marks2 = sc.nextDouble();

		System.out.print("DCF : ");
		double marks3 = sc.nextDouble();

		System.out.print("OOPJ : ");
		double marks4 = sc.nextDouble();

		System.out.print("Web Designing : ");
		double marks5 = sc.nextDouble();

		percent = (marks1 + marks2 + marks3 + marks4 + marks5) / 5;

		System.out.print("Result : ");

		if(percent < 35) {
			System.out.println("Fail.");
		}
		else if(percent >= 35 && percent < 45) {
			System.out.println("Pass.");
		}
		else if(percent >= 45 && percent < 60) {
			System.out.println("Second Class.");
		}
		else if(percent >= 60 && percent <= 70) {
			System.out.println("First Class.");
		}
		else if(percent > 70 && percent <= 100) {
			System.out.println("Distinction.");
		}
		else {
			System.out.println("Invalid input.");
		}
	}
}