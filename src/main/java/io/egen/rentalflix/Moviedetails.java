package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Moviedetails {
	 public static void main(String args[]) {
		
	      
	      List<Movie> Data = new ArrayList<Movie>();
	      System.out.println("Initial size of list: " + Data.size());  
	  
	        
	      System.out.println("Size of list after additions: " + Data.size());  
	  
	     
	      System.out.println("Contents of list: " + Data);  
	       
	       System.out.println("Iterating list");  
	       Iterator<Movie> itr = Data.iterator();  
	       while(itr.hasNext()){  
	           System.out.println(itr.next());  
	       }  
	 }


	private ArrayList<Movie> Data;
	

	public ArrayList<Movie> getMovieDeatils() {
		return Data;
	}
	 
}