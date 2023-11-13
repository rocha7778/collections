package trywithresource.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class TestTrywithResource {

	public static void main(String args[]) {
		
		String filename="C:\\Users\\Luis_Rocha1\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Java8\\src\\rocha.zip";
	    Path pathToFile = Paths.get(filename);
	    
	    
	    System.out.println(pathToFile.getFileName());
	    
		
		try {
			TestTrywithResource.writeToFileZipFileContents(filename, "rocha.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static void writeToFileZipFileContents(String zipFileName, String outputFileName) throws IOException {

		Charset charset = StandardCharsets.US_ASCII;
		Path outputFilePath = Paths.get(outputFileName);

		try (ZipFile zf = new ZipFile(zipFileName);
				BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset);) {
			
			for(Enumeration entries = zf.entries(); entries.hasMoreElements();) {
				String newLine = System.getProperty("line.separator");
				String zipEntryName = ((ZipEntry)entries.nextElement()).getName()+newLine;
				
				writer.write(zipEntryName,0,zipEntryName.length());
				
				
			}

		}

	}

}
