//CLi Program

public class CLi
{
    public static void main(String[] args)
    {
       int c=Integer.parse(args[0])+Integer.parse(args[1]);

        System.out.println("Final String : "+c);

        //System.out.println("Combination of "+args[0]+" and "+args[1]+" is "+args[0]+args[1]+".");
    }
}
