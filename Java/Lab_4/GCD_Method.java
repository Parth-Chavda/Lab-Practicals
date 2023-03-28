import java.util.*;

public class GCD_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        
        System.out.println("GCD : "+gcd(num1, num2)); 
    }
    
    public static int gcd(int num1, int num2) {
        int limit = (num1 > num2) ? num1 : num2;
        int gcd = 1;
        
        for(int counter = 1; counter <= limit; counter++) {
            if(num1 % counter == 0 && num2 % counter == 0) {
                gcd = counter; 
            }
        }
        
        return gcd;
    }
}
