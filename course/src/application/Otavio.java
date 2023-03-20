package application;

import java.util.Calendar;
import java.util.Date;


public class Otavio {
	
	public static void main(String[] args) {
		System.out.print("Hello World");
		
		Date datanow = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(datanow);
		System.out.print("\n\n"+datanow);
		System.out.print("\n"+(cal.getTimeInMillis()-3600));
	}

}
