package dates.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a specific date and time
        LocalDateTime localDateTime = LocalDateTime.now();

        // Specify the time zone
        ZoneId zoneId = ZoneId.of("-03:00");

        // Create a ZonedDateTime from the LocalDateTime and ZoneId
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        // Define the formatter with the desired pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mmXXX");

        // Format the ZonedDateTime
        String formattedDate = zonedDateTime.format(formatter);

        // Print the formatted date
        System.out.println(formattedDate);

	}

}
