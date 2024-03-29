package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadAFileStream {

	public static void main(String[] args) {
		readFile("rocha.txt");
	}

	public static void readFile(String filePath) {

		Path path = Paths.get(filePath);
		if (!Files.exists(path)) {
			System.out.println("The file " + path.toAbsolutePath() + "does not exist");
			return;
		}
		

		try (Stream<String> lines = Files.lines(path)) {
			
			lines.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
