package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.List;

public class MovieService implements IFlix {
	 
	int movieId = 0;
	Moviedetails movieDetails = new Moviedetails();

	@Override
	public List<Movie> findAll() {

		return movieDetails.getMovieDeatils();
	}

	@Override
	public List<Movie> findByName(String name) {
		ArrayList<Movie> listByName = new ArrayList<Movie>();
		for (int i = 0; i < movieDetails.getMovieDeatils().size(); i++) {
			if (movieDetails.getMovieDeatils().get(i).getTitle().equals(name)) {
				listByName.add(movieDetails.getMovieDeatils().get(i));
			}
		}
		return listByName;
	}

	@Override
	public Movie create(Movie movie) {
		movieDetails.getMovieDeatils().add(movie);
		return movie;
	}

	@Override
	public Movie update(Movie movie) {
		for (int i = 0; i < movieDetails.getMovieDeatils().size(); i++) {
			 			if (movieDetails.getMovieDeatils().get(i).getId().equals(movie.getId())) {
			 				movieDetails.getMovieDeatils().get(i)
			 						.setLanguage(movie.getLanguage());
			 				movieDetails.getMovieDeatils().get(i).setTitle(movie.getTitle());
			 				movieDetails.getMovieDeatils().get(i).setYear(movie.getYear());
			 			}
			 			else{
			 			throw new IllegalArgumentException();
			 			}
			 		}
			 
		return movie;
	}

	@Override
	public Movie delete(int id) {
		Movie movie = null;
		String stringId = id + "";
		for (int i = 0; i < movieDetails.getMovieDeatils().size(); i++) {
			 			if (movieDetails.getMovieDeatils().get(i).getId().equals(stringId)) {
			 				movie = movieDetails.getMovieDeatils().get(i);
			 				movieDetails.getMovieDeatils().remove(i);
			 
			 			}
			 			else{
				 			throw new IllegalArgumentException();
				 			}
			 		}
		return movie;
	}

	@Override
	public boolean rentMovie(int movieId, String user) {
		Movie movie = null;
		 
		 		for (int i = 0; i < movieDetails.getMovieDeatils().size(); i++) {
		 			if (movieDetails.getMovieDeatils().get(i).getId().equals(movieId + "")) {
		 				movie = movieDetails.getMovieDeatils().get(i);
		 			}
		 		}
		 
		 		if (movie != null && movie.getUser() == null) {
		 			movie.setUser(user);
		 			return true;
		 		} else {
		 			 			try {
		 				 				throw new IllegalArgumentException();
		 				 			} catch (IllegalArgumentException illegal) {
		 				 				illegal.printStackTrace();
		 				 			}
		 				 			return false;
		 				 		}
		 				 	}
		 				 
}