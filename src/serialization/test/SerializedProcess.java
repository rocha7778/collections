package serialization.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedProcess {

	public static void serialize(Book book) throws Exception {
		FileOutputStream file = new FileOutputStream("rocha.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(book);
		out.close();
		file.close();
	}
	
	public static Book deserialize() throws Exception {
	    FileInputStream file = new FileInputStream("rocha.txt");
	    ObjectInputStream in = new ObjectInputStream(file);
	    Book book = (Book) in.readObject();
	    in.close();
	    file.close();
	    return book;
	}
	
	

}
