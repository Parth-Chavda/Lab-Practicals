//Print addition of 2 numbers using command line.

public class CLi_Add {
	public static void main(String[] input) {
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);

		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
}