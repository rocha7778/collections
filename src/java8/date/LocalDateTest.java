package java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate localDate = LocalDate.of(2024, 3, 28);
		System.out.println(localDate.getYear());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonth());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getMonth().maxLength());
		
		
		//-------------- Local Time---------------------//
		
		LocalTime localTime = LocalTime.of(14, 32,58);
		
		System.out.println(localTime);
		
		LocalDateTime ldt1 = LocalDateTime.of(2024, Month.MARCH,28,14,50,30);
		
		System.out.println(ldt1);
		
		//------------Local Date Time ----------------//
		
		LocalDate date = LocalDate.of(2014, 3, 18);
		date = date.with(ChronoField.MONTH_OF_YEAR,9);
		date = date.plusYears(2).minusDays(10);
		
		System.out.println("Date date.with"+date);
				
				
	}

}
