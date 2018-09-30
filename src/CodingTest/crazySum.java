package CodingTest;

public class crazySum {
	
	public  static  int sum_array(){
		int sum = 0;
		int pos = 0;
		int[] num_list = {1, 2, 3};
		for (int element : num_list){
			sum  += (element* pos);
			pos++;
		
		}
		System.out.println("Sum : " + sum);
		return sum;
	}
	public static void main(String[] args){
		int crazy_sum = sum_array();
	}
	
}
