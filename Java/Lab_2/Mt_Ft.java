//Convert meter to feet.

import java.util.Scanner;

public class Mt_Ft
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter distance in meters : ");
        float dt=sc.nextDouble();

        dt=dt*3.28;

        System.out.println((dt/3.28)+" is equal to "+dt+" feet.");
    }
}
