package org.btc.first;

public class ThrowingException {

	public static void greet(String name) throws InvalidNameException  {

		if (name.length() <= 2) {
			throw new InvalidNameException("Invalid name : " + name); // generating an exception
		}
		System.out.println("Hello " + name + ", welcome to Coding Classes..");

	}

	public static void main(String[] args) {
		String name = "rajesh";
		try {
			greet(name);
		} catch (InvalidNameException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage() );
			
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Bye");
		}
	}

}
 class InvalidNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String message) {
		super(message);
		System.out.println("hello all");
	}
	
}