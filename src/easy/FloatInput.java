package easy;

import java.util.Scanner;

public class FloatInput {

	public static void main(String[] args) {
		System.out.println("Enter float number\n");
		Scanner in = new Scanner(System.in);
		Float fInput = in.nextFloat();
		System.out.println("Number entered is:" + fInput);
		double  nextInt = Math.ceil(fInput);
		System.out.println("Largest Integer is:" + nextInt);
		double smallInt = Math.floor(fInput);
		System.out.println("Smallest Integer is:" + smallInt);

	}

}
