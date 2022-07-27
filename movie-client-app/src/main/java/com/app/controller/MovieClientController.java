package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Movie;
import com.app.service.MovieAppApiService;

@Controller
public class MovieClientController {
	
	@Autowired
	private MovieAppApiService service;;
	
	@RequestMapping("/")
	public String getHomePage() {
		return "index.jsp";
	}
	
	@PostMapping("/add-movie")
	public String addMovie(@ModelAttribute Movie movie) {
		 service.addMovie(movie);
		return "show.jsp";
	}
	
	@GetMapping("/search-movie")
	public String findMovieByName(@RequestParam("movie-name") String movieName, Model m) {
		Movie findmovie = service.getMovieByName(movieName);
		m.addAttribute("movie", findmovie);
		return "show.jsp";
	}
	
	@GetMapping("/delete-movie")
	public String deleteMovie(@RequestParam String movieName , Model m) {
		 service.deleteMovieByName(movieName);
		 m.addAttribute("movieName", movieName);
		 return "delete.jsp";
	}
	
	@PostMapping("/update-movie")
	public String updateMovie(@ModelAttribute Movie movie) {
		service.updateMovie(movie);
//		m.addAttribute("movie", movie);
		return "show.jsp";
	}
	
	@GetMapping("get-all-movies")
	public String getAll(Model m){
	    List<Movie>	movies = service.getAllMoviesList();
	    m.addAttribute("movies", movies);
	    return "all-list.jsp";
	}

}
