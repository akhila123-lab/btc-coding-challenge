package org.xyz.bookStore;

public class Author {

	private String authorName,country;
	public Author()
	{
		
	}

	public Author(String authorName, String country) {
		super();
		this.authorName = authorName;
		this.country = country;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", country=" + country + "]";
	}
	
	
}
