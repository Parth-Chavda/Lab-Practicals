/*Find BMI.
Note: 1 pound=0.45359237 kg and 1 inch=0.0254 meters*/

import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        double pd=0.45359237;
        double in=0.0254;
        
        System.out.print("Enter weight in pounds : ");
        double wt=sc.nextDouble();

        System.out.print("Enter height in inches : ");
        double ht=sc.nextDouble();

        double bmi=(wt*pd)/((ht*in)*(ht*in));

        System.out.println("BMI : "+bmi);
    }   
}
