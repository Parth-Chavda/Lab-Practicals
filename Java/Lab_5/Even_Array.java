//Count number of even and odd numbers from an array of n numbers.

import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int flag = 0;
        
        System.out.print("Enter size of array : ");
        int array[] = new int[sc.nextInt()];
        
        System.out.println();
        
        for(int index = 0; index < array.length; index++) {
            System.out.print("Enter number at index "+ index + " : ");   
            array[index] = sc.nextInt(); 
            
            if (array[index] % 2 == 0) {
                flag++;
            }
        }
        
        System.out.println();
        
        System.out.println("Even numbers = "+ flag);
        System.out.println("Odd numbers = "+ (array.length - flag));
    }
}