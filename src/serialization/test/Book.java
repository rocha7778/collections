package serialization.test;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = -2936687026040726549L;
	private String bookName;
	private transient String description;
	private transient int copies;
	
	

	public Book() {
	}

	public Book(String bookName, String description, int copies) {
		super();
		this.bookName = bookName;
		this.description = description;
		this.copies = copies;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", description=" + description + ", copies=" + copies + "]";
	}
	
	


}
