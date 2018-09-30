package easy;

import java.util.Scanner;

public class GreetForMarks {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Enter Student's marks");
			
			int marks = Integer.parseInt(in.nextLine().trim());
			if(marks == 0){
				System.out.println("Exitting...");
				in.close();
				break;
			}
			switch(marks){
				case 10:
				case 9:
					System.out.println("Excellent");
					break;
				case 8:
					System.out.println("Good");
					break;
				case 7:
					System.out.println("average");
					break;
				case 6:
					System.out.println("work hard");
					break;
				default:
					System.out.println("No criteria matched");
				break;
				
			}
			//in.close();
		
		}while(true);
	}

}
