package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Ratings;
import com.sujata.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public Ratings getRatingDetailsByUserId(String userId) {
		
		return new Ratings(ratingDao.getRatingByUserId(userId));
	}

}
