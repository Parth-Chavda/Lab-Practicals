import java.util.*;

class Bank_Account {
    int account_no;
    String user_name;
    String email;
    String account_type;
    double account_balance;
    
    public void getAccountDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Account No. : ");
        account_no = sc.nextInt();
        
        System.out.print("Enter Username : ");
        user_name = sc.next();
        
        System.out.print("Enter  E-mail : ");
        email = sc.next();
             
        System.out.print("Enter Account Type : ");
        account_type = sc.next();
        
        System.out.print("Enter Account Balance : ");
        account_balance = sc.nextDouble();
    }
    
    public void displayAccountDetails() {
        System.out.println(account_no + " " + user_name + " " + email + " " + account_type + " " + account_balance);
    }
}

public class L7P3 {
    public static void main(String[] args) {
        Bank_Account b1 = new Bank_Account();
        
        b1.getAccountDetails();
        b1.displayAccountDetails();
    }
}
