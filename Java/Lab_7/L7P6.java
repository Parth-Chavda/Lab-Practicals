import java.util.*;
import java.lang.Math;

public class L7P6 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        
        c1.getRadius();
        c1.calcArea();
        c1.calcPerimeter();
    }
}

class Circle {
    double radius;
    double area;
    double perimeter;
    
    public void getRadius() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of circle : ");
        radius = sc.nextDouble();
    }
    
    public void calcArea() {
        area = Math.PI * radius * radius;
        
        System.out.println("Area of circle : " + area);
    }
    
    public void calcPerimeter() {
        perimeter = 2 * Math.PI * radius;
        
        System.out.println("Perimeter of circle : " + perimeter);
    }
}
