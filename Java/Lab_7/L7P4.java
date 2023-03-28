import java.util.*;

class Employee {
    int employee_id;
    String employee_name;
    String designation;
    int age;
    double salary;
    
    public void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID : ");
        employee_id = sc.nextInt();
        
        System.out.print("Enter Employee Name : ");
        employee_name = sc.next();
        
        System.out.print("Enter  Designation : ");
        designation = sc.next();
        
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        
        System.out.print("Enter Salary : ");
        salary = sc.nextDouble();
    }
    
    public void displayEmployeeDetails() {
        System.out.println(employee_id + " " + employee_name + " " + designation + " " + " " + age + " " + salary);
    }
}

public class L7P4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        
        e1.getEmployeeDetails();
        e1.displayEmployeeDetails();
    }
}
