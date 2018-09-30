package easy;

public class CountDiffChar {
	public static void main(String[] args){
		
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		int charCnt = 0;
		int numCnt = 0;
		int spaceCnt = 0;
		int others = 0;
		
		char inpArr[] = test.toCharArray();
		int len = inpArr.length;
		for(int i= 0; i< len; i++){
			if (Character.isDigit(inpArr[i]))
				numCnt++;
			else if (Character.isLetter(inpArr[i]))	
				charCnt++;
			else if (Character.isSpaceChar(inpArr[i]))	
				spaceCnt++;
			else
				others++;
		}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + charCnt);
		System.out.println("space: " + spaceCnt);
		System.out.println("number: " + numCnt);
		System.out.println("other: " + others);
		
	}
}
