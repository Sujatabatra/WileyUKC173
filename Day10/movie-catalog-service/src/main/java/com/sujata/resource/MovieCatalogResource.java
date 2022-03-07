package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.MoviesCatalog;
import com.sujata.service.MovieCatalogService;

@RestController
public class MovieCatalogResource {

	@Autowired
	private MovieCatalogService movieCatalogService;
	
	@GetMapping(path = "/catalogs/{uid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public MoviesCatalog getMovieCatalogListByUserIdResource(@PathVariable("uid") String userId) {
		return movieCatalogService.getMoviesCatalogByUserId(userId);
	}
}
