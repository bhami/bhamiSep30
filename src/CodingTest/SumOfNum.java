package CodingTest;

public class SumOfNum {

	public static void main(String[] args) {
		System.out.println("Finding sum of all integers greter than 100 and less than 200 and divisibl ( by 7");
		int sum = 0;
		for(int i=101; i<200; i++){
			if ((i%7) == 0)
				sum = sum + i;
		}
		System.out.println("Sum: " + sum);
	}

}
