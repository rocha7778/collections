package local.date.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate localDate = LocalDate.of(2024, 4, 16);
		
		int year = localDate.getYear();
		Month month = localDate.getMonth();
		int day = localDate.getDayOfMonth();
		DayOfWeek dow = localDate.getDayOfWeek();
		int lengthOfMonth = localDate.lengthOfMonth();
		boolean leap = localDate.isLeapYear();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(dow);
		System.out.println(lengthOfMonth);
		System.out.println(leap);
		
		
		LocalTime time = LocalTime.of(19, 7,30);
		
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		
		System.out.println("Times ");
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		LocalDate date = LocalDate.parse("2024-04-17");
		LocalTime timeParse = LocalTime.parse("19:10:30");
		
		System.out.println("Times  parse");
		System.out.println(timeParse.getHour());
		System.out.println(timeParse.getMinute());
		System.out.println(timeParse.getSecond());
		
		
		System.out.println("Manipulation dates adding sustrating etc");
		
		LocalDate date1 = LocalDate.of(2024, 4, 16);
		LocalDate date2 = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		LocalDate date3 = date2.with(TemporalAdjusters.lastDayOfMonth());
		
		System.out.println(date2);
		System.out.println(date3);
		
		NextWorkinDay nwd = new NextWorkinDay();
		
		date1 = date1.with(nwd);
		
		System.out.println("Next working date");
		System.out.println(date1);
		
		
		
		
		
	}

}
