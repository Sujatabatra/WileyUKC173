package com.sujata.service;

import com.sujata.entity.Ratings;

public interface RatingService {

	Ratings getRatingDetailsByUserId(String userId);
}
