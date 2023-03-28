/*Calculate simple interest using method.*/

import java.util.*;

public class Si_Method {
    
    static void interest(double amount, double rate, double time) {
        double si;    
    
        si = (amount*rate*time)/100.0;
        
        System.out.println("Simple Interest : "+si);        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Principle Amount : ");
        double amount = sc.nextDouble();
        
        System.out.print("Enter Rate of Interest : ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Number of Years : ");
        double time = sc.nextDouble();
        
        interest(amount, rate, time);              
    }
}
