package anagram;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1985, Month.SEPTEMBER, 20);
		LocalDate nextBDay = birthday.withYear(today.getYear());

		// If your birthday has occurred this year already, add 1 to the year.
		System.out.println("Year: " +nextBDay.getYear());
		System.out.println("Month: " +nextBDay.getMonth());
		System.out.println("Day: " +nextBDay.getDayOfMonth());
		
		System.out.println("XXXXX");
		
		
		// If your birthday has occurred this year already, add 1 to the year.
		System.out.println("bYear: " +birthday.getYear());
		System.out.println("bMonth: " +birthday.getMonth());
		System.out.println("bDay: " +birthday.getDayOfMonth());

	}

	static long calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
		// Using java.time.temporal.ChronoUnit to calculate the difference in days
		return ChronoUnit.DAYS.between(startDate, endDate);
	}

}
