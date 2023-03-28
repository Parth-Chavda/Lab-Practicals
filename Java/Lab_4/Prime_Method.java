import java.util.*;

public class Prime_Method {
    static int check(int n) {
        for(int counter = 2; counter < n; counter++) {
            if(n % counter == 0) {
                return 0;
            }
        }
        return 1;       
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        
        System.out.println(check(n));
    }
}
