package prac;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "dd MMMM,yyyy";
		SimpleDateFormat sdf= new SimpleDateFormat(p);
		Date date = new Date();
		String strDate = sdf.format(date);
		System.out.println( strDate);
	}


	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Date date= new Date();
		int day  = date.getDate();
		int month = date.getMonth()+1;
		int year = date.getYear()+1900;
		System.out.println(day+"/"+month+"/"+year);
	}

}
