package com.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Movie;
import com.app.repository.IMovieRepo;

@Service
public class MovieServiceImpl implements IMovieService {
	
	@Autowired
	private IMovieRepo repo;

	@Override
	@Transactional
	public Movie addMovie(Movie movie) {
		Movie movies= repo.save(movie);
		return movies;
	}

	@Override
	public boolean deleteMovie(String movieName) {
		repo.deleteById(movieName);
		return !repo.existsById(movieName);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		Movie movies = repo.save(movie);
		return movies;
	}

	@Override
	public Movie findItem(String movieName) {
		Movie movies = repo.findById(movieName).get();
		return movies;
	}

	@Override
	public List<Movie> getAllMovies() {
		List<Movie> movieList = repo.findAll();
		return movieList;
	}

}
