

;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:MM:ss");
		Date dt = new Date();
		
		String today=df.format(dt);
		
		System.out.println(" The date today is " + today);
	

	}

}
