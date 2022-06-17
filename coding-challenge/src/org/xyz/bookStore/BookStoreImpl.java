package org.xyz.bookStore;public class BookStoreImpl {
	public static void main(String[] args) {
		// Declare and initialize author, book and bookstore objects
		Author a=new Author();
		a.setAuthorName("abc");
		a.setCountry("india");
		Author aa=new Author("bca","Australia");
		 Book b1=new Book(1,"name1",a,"comedy",500);
		 Book b2=new Book(2,"name2",aa,"fiction",1000);
		 Book bbb[]= {b1,b2};
		 BookStore bs=new BookStore("Vinayaka", "54757", bbb);
			System.out.println("Books Avaliable : ");
		 for(Book book:bs.getBooks()) {
				System.out.println(book);
			}
		
		 //Calculate discount on the books by calling the methods
			
			for(Book book:bs.getBooks()) {
				bs.calculateDiscount(book, 25);
			}
			
			System.out.println("-------------------------");
			
			//Display book details after discount is calculated
			System.out.println("Books After Discount : ");
			for(Book book:bs.getBooks()) {
				System.out.println(book);
			}

		 
		

	}

}
