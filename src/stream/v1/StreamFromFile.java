package stream.v1;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromFile {

	public static void main(String[] args) {

		try (Stream<String> lines = Files.lines(Paths.get("text.txt"), Charset.defaultCharset())) {

			Stream<String> result = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct();

			result.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
