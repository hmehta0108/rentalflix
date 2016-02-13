package io.egen.rentalflix;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import io.egen.rentalflix.MovieService;

public class MovieServiceTest {
	MovieService movieService = new MovieService();

	public void Create() {
		Movie movie1 = new Movie("1", "Ranjha", 1988, "Hindi");
		movieService.create(movie1);
	
	List<Movie> list = movieService.findAll();
	assertEquals("Ranjha", list.get(0).getTitle());
	
	ArrayList<Movie> list2 = (ArrayList<Movie>) movieService.findByName("Ranjha");
	 		assertEquals("Ranjha", list2.get(0).getTitle());
	
	 		Movie movie = new Movie("1", "tittle change", 1988, "English");
	 		 		movieService.update(movie);
	 		 		assertEquals("tittle change", list2.get(0).getTitle());
	 		 
	 		 		assertEquals("1", list.get(0).getId());
	 		 		movieService.delete(0);
	 		 		
	 		 		boolean boolVal = movieService.rentMovie(Integer.parseInt(list.get(1)
	 		 				 				.getId()), list.get(1).getUser());
	 		 				 		String stringBoolVal = null;
	 		 				 		if (boolVal == true) {
	 		 				 			stringBoolVal = "true";
	 		 				 		} else {
	 		 				 			stringBoolVal = "false";
	 		 				 		}
	 		 				 
	 		 				 		assertEquals("true", stringBoolVal);
	 		 				 
	}
}