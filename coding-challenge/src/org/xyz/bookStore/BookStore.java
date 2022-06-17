package org.xyz.bookStore;
import java.util.Arrays;

public class BookStore {
	private String bookStoreName;
    private String bookStoreId;
    private Book[] books;
    
    public BookStore(String bookStoreName, String bookStoreId, Book[] books) {
        this.bookStoreName = bookStoreName;
        this.bookStoreId = bookStoreId;
        this.books = books;
    }

	public String getBookStoreName() {
		return bookStoreName;
	}
	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}
	public String getBookStoreId() {
		return bookStoreId;
	}
	public void setBookStoreId(String bookStoreId) {
		this.bookStoreId = bookStoreId;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
    
	// Function to calculate the discount for a genre of books
//    public float calculateDiscount(Book book,float discountPercentage)
//    {
//    	String str=book.getGenre();
//    	float f=0.0f;
//       if(str.equals("fiction"))
//       {
//    	    f=(discountPercentage/100)*book.getPrice(); 
//       }
//       return book.getPrice()-f;
//    }

public float calculateDiscount(Book book, float discountPercentage) {
		
		if(book.getGenre().equalsIgnoreCase("fiction")) {
			float discount = book.getPrice()*(discountPercentage)/100F;
			book.setPrice(book.getPrice()-discount);
			
			return discount;
		}
		
		return 0;
	}
	@Override
	public String toString() {
		return "BookStore [bookStoreName=" + bookStoreName + ", bookStoreId=" + bookStoreId + ", books="
				+ Arrays.toString(books) + "]";
	}
	
    

}
