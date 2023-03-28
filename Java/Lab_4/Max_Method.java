/*Find maximum number from given two numbers using method.*/

public class Max_Method {
    static void max(int num1, int num2) {
        if(num1 >= num2) {
            System.out.println(num1+" is greater.");
        }
        else {
            System.out.println(num2+" is greater.");
        }
    }
    
    public static void main(String[] args) {
        int num1 = 5, num2 = 8;
        
        max(num1, num2);
    }
}
