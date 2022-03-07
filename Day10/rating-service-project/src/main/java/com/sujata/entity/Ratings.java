package com.sujata.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Ratings {

	@Getter
	@Setter
	List<Rating> ratingList;
}
