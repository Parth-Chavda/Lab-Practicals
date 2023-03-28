//Print given number in reverse order.

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int rev = 0;
        
        System.out.print("Enter number : ");
        int num = new Scanner(System.in).nextInt();
        
        while (num >= 1) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        
        System.out.println("Reversed number : "+ rev);
    }
}