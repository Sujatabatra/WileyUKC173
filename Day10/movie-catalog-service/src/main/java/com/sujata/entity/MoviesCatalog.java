package com.sujata.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class MoviesCatalog {

	@Setter
	@Getter
	List<MovieCatalog> movieCatalogList;
}
