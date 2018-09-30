package easy;

import java.util.Scanner;

public class ConvertSecond {

	public static void main(String[] args) {
		System.out.println("Enter the sceond to be formatted ");
		Scanner in = new Scanner(System.in);
		int sec = in.nextInt();
		int ps = sec%60;
		int pm_tmp = sec/60;
		int pm = pm_tmp%60;
		int ph = sec/3600;
		
		System.out.print( ph+ ":" + pm + ":" + ps);
		System.out.print("\n");
	}

}
