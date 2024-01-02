package stream.compression;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class StreamCompressionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Original content
		String originalContent = "This is the content to be compressed.";

		// Compress the content
		byte[] compressedData = compress(originalContent);

		// Decompress the content
		String decompressedContent = decompress(compressedData);

		// Print results
		System.out.println("Original Content: " + originalContent);
		System.out.println("Compressed Data: " + new String(compressedData));
		System.out.println("Decompressed Content: " + decompressedContent);

	}

	private static byte[] compress(String data) {
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
				GZIPOutputStream gzipOutputStream = new GZIPOutputStream(baos);
				OutputStreamWriter writer = new OutputStreamWriter(gzipOutputStream)) {

			writer.write(data);
			writer.close();
			return baos.toByteArray();

		} catch (IOException e) {
			e.printStackTrace();
			return new byte[0];
		}
	}

	// Method to decompress data using GZIPInputStream
	private static String decompress(byte[] compressedData) {
		try (ByteArrayInputStream bais = new ByteArrayInputStream(compressedData);
				GZIPInputStream gzipInputStream = new GZIPInputStream(bais);
				InputStreamReader reader = new InputStreamReader(gzipInputStream);
				BufferedReader bufferedReader = new BufferedReader(reader)) {

			StringBuilder decompressedContent = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				decompressedContent.append(line);
			}

			return decompressedContent.toString();

		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
