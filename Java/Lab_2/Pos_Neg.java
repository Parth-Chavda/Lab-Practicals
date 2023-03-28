//Check if number is positive or negative.

import java.util.Scanner;

public class Pos_Neg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int a=sc.nextInt();

        if(a>=0)
        {
            System.out.println(a+" is a positive integer.");
        }
        else
        {
            System.out.println(a+" is a negative number.");
        }
    }
}
