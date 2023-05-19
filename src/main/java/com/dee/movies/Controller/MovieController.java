package com.dee.movies.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dee.movies.Model.Movie;
import com.dee.movies.Service.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<List<Movie>> allMovies() {
		return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK);
	}
	
	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
		return new ResponseEntity<Optional<Movie>>(movieService.getSingleMovie(imdbId), HttpStatus.OK);
	}
}
