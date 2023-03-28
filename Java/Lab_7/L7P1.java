class Student {
    int enrollment_no;
    String name;
    String gender;
    double marks;
    
    static int count = 0;
    
    Student() {
        enrollment_no = 113;
        this.name = "Parth";
        this.gender = "Male";
        this.marks = 100;
        this.count++;    
    }
    
    void display() {
        System.out.println(count + ". " + enrollment_no + " " + name + " " + gender + " " + marks);
    }
}

public class L7P1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.display();
    }
    
}
