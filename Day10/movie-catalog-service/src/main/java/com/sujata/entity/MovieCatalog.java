package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class MovieCatalog {

	@Setter
	@Getter
	private String userId;
	@Setter
	@Getter
	private String movieName;
	@Setter
	@Getter
	private int rating;
}
