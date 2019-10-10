package com.cg.repo;

import java.util.List;

import com.cg.entity.Movie;
import com.cg.service.InvalidMovieException;

public interface MovieDao {
	
	Movie save(Movie movie);
	
	Movie fetch(int id) throws InvalidMovieException;
	
	List<Movie> getAll();
	
	Movie update(Movie movie);
	
	boolean delete(int id) throws InvalidMovieException;
	
	List<Movie> byGenre(String gen);
}
