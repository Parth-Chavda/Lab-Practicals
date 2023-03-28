/*Prompt the user to input number of calls.
  Calculate monthly telephone bill as per given rules.*/
  
import java.util.Scanner;

public class TeleBill {
    public static void main(String[] args) {
        double bill;
        
        System.out.print("Input number of calls : ");
        int calls = new Scanner(System.in).nextInt();
        
        if (calls > 100) {
            if (calls <= 150) {
                bill = ((calls - 100) * 0.60) + 200;
            }
            
            else if (calls <= 200 && calls > 150) {
                bill = ((calls - 150) * 0.50) + 230; 
            }
            
            else {
                bill = ((calls - 200) * 0.40) + 255;
            }
        } 
        else {
            bill = 200;        
        }
        
        System.out.println("Your telephone bill for "+ calls +" calls is Rs. "+ bill +".");
    }
}