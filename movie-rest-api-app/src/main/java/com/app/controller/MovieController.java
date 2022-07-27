package com.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Movie;
import com.app.service.IMovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private IMovieService service;
	
	@PostMapping
	public Movie addMovies(@RequestBody Movie movie) {
		return service.addMovie(movie);
		
	}
	
	@DeleteMapping("/{movie-name}")
	public boolean deleteMovieByName(@PathVariable("movie-name") String movieName ) {
		return service.deleteMovie(movieName);
		
	}
	
	@PutMapping
	public Movie updateMovie(@RequestBody Movie movie) {
		return service.updateMovie(movie);
		
	}
	
	@GetMapping("/movie-name/{movie-name}")
	public Movie findMovieByName(@PathVariable("movie-name") String movieName) {
		return service.findItem(movieName);
	}
	
	@GetMapping
	public List<Movie> listAllMovies(){
		return service.getAllMovies();
	}
	
	
	

}
