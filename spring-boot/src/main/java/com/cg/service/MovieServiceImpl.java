package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Movie;
import com.cg.repo.MovieDao;
import com.cg.repo.MovieRepo;

@Service
@Transactional(rollbackFor = InvalidMovieException.class)
public class MovieServiceImpl implements MovieService {
	
	@Autowired
//	private MovieRepo repo;
	private MovieDao dao;
	
	@Override
	public Movie save(Movie movie) {
//		return repo.save(movie);
		return dao.save(movie);
	}

	@Override
	public Movie fetch(int id) throws InvalidMovieException {
//		return repo.findById(id).orElseThrow(InvalidMovieException::new);
		try {
//			return repo.findById(id).get();
			return dao.fetch(id);
		} catch (Exception e) {
			throw new InvalidMovieException("No record found for Id: "+id);
		}

	}

	@Override
	public List<Movie> getAll() {
//		return repo.findAll();
//		return repo.getAllMovies();
		return dao.getAll();
	}

	@Override
	public Movie update(Movie movie) {
//		return repo.save(movie);
		return dao.update(movie);
	}

	@Override
	public boolean delete(int id) throws InvalidMovieException {
		try {
//			repo.deleteById(id);
			dao.delete(id);
			return true;
		} catch (Exception e) {
			throw new InvalidMovieException("Invalid movie Id provided: "+id);
		}
	}

	@Override
	public List<Movie> byGenre(String gen) {
//		return repo.getByGenre(gen);
		return dao.byGenre(gen);
	}

}
