//Find whether given number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int counter = 2;
        
        System.out.print("Enter any number greater than 1 : ");
        int num = new Scanner(System.in).nextInt();
        
        for (; counter < num; counter++) {
            if (num % counter == 0) {
                break;
            }
        }
        
        if (counter < num) {
            System.out.println(num + " is not a prime number.");
        }
        else {
            System.out.println(num + " is a prime number.");
        }
    }
}
