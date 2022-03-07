package com.sujata.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Rating {

	@Setter
	@Getter
	private int ratingId;
	@Setter
	@Getter
	private String userId;
	@Setter
	@Getter
	private String movieId;
	@Setter
	@Getter
	private int rating;

}
