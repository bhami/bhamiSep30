package easy;

import java.io.Console;
import java.util.Arrays;

public class ReadPassword {

	public static void main(String[] args) {
		Console con;
		if((con = System.console()) != null) {
			char[] password = null;
			try{
				password = con.readPassword("Input your password");
				System.out.println("Your password was:" + new String(password));
			}finally{
				if (password !=  null){
					Arrays.fill(password, ' ');
				}
			}
		} else {
			throw new RuntimeException("can't get password ... no console");
		}
		

	}

}
