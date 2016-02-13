package io.egen.rentalflix;

public class Movie {
	String id;
    String title;
    private int year;
    private String language;
    private String user;
	
    
    
    public Movie(String id, String title, int year, String language) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.language = language;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	

}
