package easy;

import java.util.Random;

public class RandomGen {

	public static void main(String[] args) {
		//Random random = new Random(100);
		for(int i= 0; i<5; i++){
			
			//int num = random.nextInt(100);
			int num = (int)(Math.random()*100);
			System.out.println("Number " + i + "generated:" + num);
		}

	}

}
