package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.Movie;
import com.sujata.entity.MovieCatalog;
import com.sujata.entity.MoviesCatalog;
import com.sujata.entity.Rating;
import com.sujata.entity.Ratings;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public MoviesCatalog getMoviesCatalogByUserId(String userId) {
		Ratings ratings=restTemplate.getForObject("http://localhost:8082/ratings/"+userId, Ratings.class);
		
		List<MovieCatalog> movieCatalogList=new ArrayList<MovieCatalog>();
		
		for(Rating rating:ratings.getRatingList()) {
			Movie movie=restTemplate.getForObject("http://localhost:8085/movies/"+rating.getMovieId(), Movie.class);
			MovieCatalog movieCatalog=new MovieCatalog(userId, movie.getMovieName(), rating.getRating());
			movieCatalogList.add(movieCatalog);
		}
		MoviesCatalog moviesCatalog=new MoviesCatalog(movieCatalogList);
		return moviesCatalog;
	}

}
