package CodingTest;

public class PerfectSquare {
	public static int square_num(int max_num){
		int counter = 0;
		for(int x=1; x< max_num; x++){
			int squ_num = x *x;
			if (squ_num < max_num)
				counter++;
			else
				return counter;
				
		}
		return counter;
	}
	public static void main(String[] args) {
		System.out.println("Total perfect square are " + square_num(30));

	}

}
