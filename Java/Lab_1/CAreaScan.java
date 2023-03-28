//Find area of circle using Scanner.

import java.util.Scanner;

public class CAreaScan
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        double pi=3.14;

        System.out.print("Enter radius of circle : ");
        double rad=sc.nextDouble();

        System.out.println("Area of circle : "+(pi*rad*rad));
    }
}
