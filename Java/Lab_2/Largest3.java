//Find out largest number from three numbers without using logical operator.

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double largest;

        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number : ");
        double num3 = sc.nextDouble(); 

        largest = ((num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3));
        System.out.println(largest+" is the largest number.");

        /*if(num1 > num2) {
            if(num1 > num3)
                System.out.println(num1+" is the largest number.");
            else
                System.out.println(num3+" is the largest number.");
        }
        else if(num2 > num3) {
            System.out.println(num2+" is the largest number.");
        }
        else {
            System.out.println(num3+" is the largest number.");
        }*/
    }
}
