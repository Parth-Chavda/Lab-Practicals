//Check whether triangle is isosceles, equilateral, scalene or right-angled.

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first side : ");
		double side1 = sc.nextDouble();

		System.out.print("Enter second side : ");
		double side2 = sc.nextDouble();

		System.out.print("Enter third side : ");
		double side3 = sc.nextDouble();

		if((side1 == side2) && (side1 == side3)) {
			System.out.println("Equilateral.");
		}
		
		else if((side1 == side2) || (side1 == side3) || (side2 == side3)) {
			System.out.println("Isosceles.");
		}
		
		else if((side1 != side2) && (side1 != side3) && (side2 != side3)) {
            if(((side1 * side1) + (side2 * side2) == (side3 * side3)) || ((side3 * side3) + (side2 * side2) == (side1 * side1)) || ((side1 * side1) + (side3 * side3) == (side2 * side2))) {
                System.out.print("Right-angled & ");
		    }
		    
		    System.out.println("Scalene.");
		}
		
		else {
		    System.out.println("Invalid input.");
		}
	}	
}