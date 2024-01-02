package anagram;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1985, Month.SEPTEMBER, 1);
		LocalDate nextBDay = birthday.withYear(today.getYear());

		// If your birthday has occurred this year already, add 1 to the year.
		if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
			nextBDay = nextBDay.plusYears(1);
		}

		Period p = Period.between(today, nextBDay);
		long p2 = ChronoUnit.DAYS.between(today, nextBDay);
		
		System.out.println("There are " + p.getMonths() + " months, and " + p.getDays()
				+ " days until your next birthday. (" + p2 + " total)");

	}

	static long calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
		// Using java.time.temporal.ChronoUnit to calculate the difference in days
		return ChronoUnit.DAYS.between(startDate, endDate);
	}

}
