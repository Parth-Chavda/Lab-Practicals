import java.util.*;

public class Fibo_Method {
    static void fibo(int n) {
        int num1 = 0, num2 = 1;
        
        System.out.print(num2 + " ");
               
        for(int counter = 1; counter < n; counter++) {
            int num3 = num1 + num2;
            
            System.out.print(" "+ num3+ " ");
            
            num1 = num2;
            num2 = num3;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        
        fibo(n);
    }
}
