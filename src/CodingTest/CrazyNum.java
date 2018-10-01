package CodingTest;

import java.util.Arrays;

public class CrazyNum {
	public static String[] crazy_num(int max_num){
		//Bhami testing Sep30 git
		//Bhami did second sechange right at github repo
		int x = 1;
		int y = 0;
		int len = max_num/3 + 1; 
		String[] output_array = new String[len];
		while (x< max_num){
			if((x %3 == 0 ) && (x % 5 !=0)){
				output_array[y] = Integer.toString(x);
				y++;
			}
			else if((x %5 == 0 ) && (x % 3 !=0)){
				output_array[y] = Integer.toString(x);

				y++;
			}
			x++;
		}
		return output_array;
	}
	public static void main(String[] args) {
		System.out.println("Crazy array by Bhami:" + Arrays.toString(crazy_num(20)));
		//Bhami changed only at the branch bhami_test
		//Bhami did pull request at eclipse. and now testing
	}

}
