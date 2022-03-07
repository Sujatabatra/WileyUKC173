package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.Ratings;
import com.sujata.service.RatingService;

@RestController
public class RatingResource {

	@Autowired
	private RatingService ratingService;
	
	@GetMapping(path = "/ratings/{uId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Ratings getRatingsByUserIdResource(@PathVariable("uId") String userId) {
		return ratingService.getRatingDetailsByUserId(userId);
	}
}
