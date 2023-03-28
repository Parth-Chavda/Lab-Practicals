/*Print numbers between two given numbers.
  Printed numbers should be divisible by 2 but not by 3.*/

import java.util.Scanner;

public class Div_2 {
	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);

  		System.out.print("Enter first number : ");
  		int input_1 = sc.nextInt();

  		System.out.print("Enter second number : ");
  		int input_2 = sc.nextInt();

  		for(; input_1 <= input_2; input_1++) {
  			if(input_1 % 2 == 0 && input_1 % 3 != 0) {
  				System.out.println(input_1);
  			}
  		}
  	}
}