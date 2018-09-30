package easy;

import java.util.Scanner;

public class Penultimate {

	public static void main(String[] args) {
		System.out.println("Enter the string to find penultimate(word before last word)");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		//String str = "Bhami is a good girl\n";
		String[] arr = str.split(" ");
		
		System.out.println("String entered is:" + str);
		System.out.println("\nPenultimate is:" + arr[arr.length-2]);

	}

}
