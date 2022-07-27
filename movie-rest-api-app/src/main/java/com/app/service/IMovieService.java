package com.app.service;

import java.util.List;

import com.app.model.Movie;

public interface IMovieService {
	
	public Movie addMovie(Movie movie);
	
	public boolean deleteMovie(String movieName);
	
	public Movie updateMovie(Movie movie);
	
	public Movie findItem(String movieName);
	
	public List<Movie> getAllMovies();
	

}
