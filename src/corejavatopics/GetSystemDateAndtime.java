package corejavatopics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetSystemDateAndtime {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		//MMMddyyyy_HHmmss : Apr142023_193523
		//convert system date to user defined format
		DateFormat df = new SimpleDateFormat("MMMddyyyy_HHmmss");
		System.out.println(df.format(d));
		
		String timeStamp = df.format(d);
		System.out.println(timeStamp);

		//Fri Apr 14 19:37:31 CDT 2023
		//Apr142023_193731
		
//		Fri Apr 14 19:37:47 CDT 2023
//		Apr142023_193747
		
//		Fri Apr 14 19:38:05 CDT 2023
//		Apr142023_193805


	}

}
