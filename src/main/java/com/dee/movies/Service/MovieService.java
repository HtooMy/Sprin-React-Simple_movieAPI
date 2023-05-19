package com.dee.movies.Service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dee.movies.Model.Movie;
import com.dee.movies.Repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
	}
	
	public Optional<Movie> getSingleMovie(String imdbId) {
		return movieRepository.findMovieByImdbId(imdbId);
	}
}
