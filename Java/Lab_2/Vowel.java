//Is given character vowel or consonant.

import java.util.Scanner;

public class Vowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a letter : ");
        char ch=sc.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Entered character \'"+ch+"\' is a vowel.");
        }
        else
        {
            System.out.println("Entered character \'"+ch+"\' is a consonant.");
        }
    }
}
