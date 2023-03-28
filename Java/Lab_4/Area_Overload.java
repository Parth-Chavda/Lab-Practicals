import java.lang.Math;

public class Area_Overload {
    public static void main(String[] args) {
        System.out.print("Area of Circle : ");
        System.out.println(area());
        
        System.out.print("Area of Triangle : ");
        System.out.println(area(5, 10));
        
        System.out.print("Area of Square : ");
        System.out.println(area(5));
    }
    
    static double area() {
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        
        return area;
    }
    
    static double area(double base, double height) {
        double area = (base * height) / 2;
        
        return area;
    }
    
    static double area(double side) {
        double area = side * side;
        
        return area;
    }
}
