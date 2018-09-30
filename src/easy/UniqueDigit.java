package easy;

import java.util.ArrayList;
import java.util.List;

public class UniqueDigit {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=4; i++){
			int numH = i * 100;
			for(int j=1; j<=4; j++){
				if( i != j){
					int numT = numH + j*10;
					for(int k=1; k<=4; k++){
						if(k != i && k != j && i != j){
							int uniqueNum = numT + k;
							System.out.println("NUmber:" + uniqueNum);
							list.add(uniqueNum);
							//num = 0;
							count++;
						}		
					}
				}
			}
		}
		System.out.println("Unique numbers of 3 digits are: " + list.toString() + " and count is:" + count);
	}
}
	
