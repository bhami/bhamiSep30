package easy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CurrentTime {

	public static void main(String[] args) {
		System.out.println("Displaying current time and date\n");
		System.out.printf("\nCurrent Date & Time %tc%n \n", System.currentTimeMillis());
		
		//Displaying date in a specific format
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		//Calendar cal = cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("EST")));
		System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
	}

}
