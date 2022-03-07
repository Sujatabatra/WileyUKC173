package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Movie;
import com.sujata.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public Movie getMovieById(String mId) {
		return movieDao.getById(mId);
	}

}
