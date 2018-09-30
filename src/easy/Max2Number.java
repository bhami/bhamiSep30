package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Max2Number {
	
	public static void  main(String args[]){
		System.out.println("Enter elements of array to be sorted to find max number\n");
		Scanner in =  new Scanner(System.in);
		int len = Integer.parseInt(in.nextLine().trim());
		
		System.out.println("Program to find maximum of " +  len + " numbers\n");
		
		System.out.println("Enter first number:");
		
		int[] num = new int[len];
		
		/*for(int i=0; i<num.length; i++){
			num[i] = Integer.parseInt(in.nextLine().trim());
			System.out.println("Enter next number:");
			
		}*/
		int i=0;
		while( i < len){
			num[i++] = Integer.parseInt(in.nextLine().trim());
			if (i == len)
				break;
			else	
				System.out.println("Enter next number:");
			
			
		}
		System.out.println("Calling function to find max for numbers:\n" + Arrays.toString(num));
		int maxNum = CalculateMax(num);
		System.out.println("Max number is: " + maxNum);
	}
	public  static  int CalculateMax(int[] inpArr){
		int len = inpArr.length;
		Arrays.sort(inpArr);
		return inpArr[len-1];
	}
}