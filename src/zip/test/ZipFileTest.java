package zip.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileTest {

	public void zip() {

		StringBuilder sb = new StringBuilder();
		sb.append("Test String");

		File f = new File("test.zip");

		try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f))) {
			
			ZipEntry e = new ZipEntry("mytext.txt");
			out.putNextEntry(e);

			byte[] data = sb.toString().getBytes();
			out.write(data, 0, data.length);
			out.closeEntry();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	
	public void createZipFile() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Test String");
		File f = new File("test2.zip");
		
		try(ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f))){
			ZipEntry e = new ZipEntry("myText.txt");
			out.putNextEntry(e);
			
			
			ZipEntry e1 = new ZipEntry("myText1.txt");
			out.putNextEntry(e1);
			
			byte[] data =sb.toString().getBytes();
			out.write(data, 0, data.length);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
