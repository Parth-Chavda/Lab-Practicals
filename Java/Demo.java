public class Demo{
    public static void main(String[] args){
        Student s1=new Student();
        int a=s1.enroll;
        Student s2=new Student(5);
        System.out.println(s1.enroll);
        System.out.println(s2.enroll);
    }
}
class Student{
    int enroll;
    String name;
    Student(){
        this.enroll=15;
        name="JAVA";
    }
    Student(int enroll){
        this.enroll=enroll;
        name="JAVA";
    }
}
