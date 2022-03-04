package com.sujata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Husband {

	@Setter
	@Getter
	@Id
	private String husbandId;
	@Setter
	@Getter
	private String husbandName;
}
