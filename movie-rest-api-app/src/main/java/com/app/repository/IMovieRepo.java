package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Movie;

public interface IMovieRepo extends JpaRepository<Movie, String>{
	
	

}
