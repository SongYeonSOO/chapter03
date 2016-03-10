package chapter03;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		// since Calendar class is abstract, we can not make objects.
		// Calendar calendar = new Calendar();
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);

		printDate(calendar);

		calendar.set(Calendar.YEAR, 2006);
		printDate(calendar);

		calendar.set(Calendar.MONTH, 0);
		printDate(calendar);
		
//		calendar.set(2016,1,31); 2016.2.30 없음 -> 윤달임
		printDate(calendar);

	}

	public static void printDate(Calendar calendar) {
		String date = "";
		int year = calendar.get(Calendar.YEAR);
		date += (year + "년");

		System.out.println(date);

		int month = calendar.get(Calendar.MONTH); // (0~11)
		date += ((month + 1) + "월"); // caution!!!! month!!!!

		System.out.println(date);

		int d = calendar.get(Calendar.DATE);
		date += (d + "일");

		int day = calendar.get(Calendar.DAY_OF_WEEK); // (1~7) -> not mon,tue...
		date += ("(" + day + ")");
		//
		// final String[] days = {"일","월","화","수","목","금","토"}
		// date += ("("+days[day-1]+")");

		// int isPM = calendar.get(calendar.AM_PM);
		String ampm = calendar.get(Calendar.AM_PM) == 0 ? "오전" : "오후";

		int hour = calendar.get(Calendar.HOUR);
		date += (hour + ":");

		int min = calendar.get(Calendar.MINUTE);
		date += (min + ":");

		int sec = calendar.get(Calendar.SECOND);
		date += (sec);
		System.out.println(date);

	}
}
