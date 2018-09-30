package easy;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("Enter the numer");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("Original NUmber:" + num);
		int tmp = 0;
		int reverseNum = 0;
		while(num>0){
			int remainder = num%10;
			reverseNum = reverseNum*10 + remainder;
			num = num/10;
		}
		
		System.out.println("\nReversed Number:" + reverseNum);
		

	}

}
