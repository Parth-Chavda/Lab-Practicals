//Program_6 : Convert Celsius to Fahrenheit

public class Temp
{
    public static void main(String[] args)
    {   
        double c=44.5; //c=celsius
        double f=((9.0/5.0)*c)+32; //f=fahrenheit

        System.out.println("Temperature in Celsius : "+c+"\nTemperature in Fahrenheit : "+f);

        double c2=(f-32)*(5.0/9.0);

        System.out.println("Value of Celsius from Fahrenheit : "+c2);
        System.out.println("Value of Celsius from Fahrenheit : "+(9/5));

        double a=9, b=5;

        System.out.println("Value of Celsius from Fahrenheit : "+(a/b));
    }
}
