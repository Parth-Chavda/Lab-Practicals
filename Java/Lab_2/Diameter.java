import java.util.Scanner;

public class Diameter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter area of circle : ");
        double area=sc.nextDouble();

        double rad; 
                
        rad=area/3.14; //rad=radius
        
        System.out.println("Radius : "+rad);
    }
}
