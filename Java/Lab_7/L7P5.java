import java.util.*;

public class L7P5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.getStudentDetails();
        s1.displayStudentDetails();
    }
}

class Student {
    long enrollment_no;
    String student_name;
    int semester;
    double cpi;
    double spi;
    
    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Enrollment No. : ");
        enrollment_no = sc.nextLong();
        
        System.out.print("Enter Student Name : ");
        student_name = sc.next();
        
        System.out.print("Enter Semester : ");
        semester = sc.nextInt();
        
        System.out.print("Enter CPI : ");
        cpi = sc.nextDouble();
        
        System.out.print("Enter SPI : ");
        spi = sc.nextDouble(); 
    }
    
    public void displayStudentDetails() {
        System.out.println(enrollment_no + " " + student_name + " " + semester + " " + cpi + " " + spi);
    }
}
