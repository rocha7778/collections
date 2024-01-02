package serialization.test;

public class SerializationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		book.setBookName("Java Reference");
		book.setDescription("will not be saved");
		book.setCopies(25);
		
		SerializedProcess.serialize(book);
		Book bookd = SerializedProcess.deserialize();
		
		System.out.println(book);
		System.out.println(bookd);
		
	
		
		

	}

}
