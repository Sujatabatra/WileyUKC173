package com.sujata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Wife {

	public Wife(String wifeId, String wifeName) {
		super();
		this.wifeId = wifeId;
		this.wifeName = wifeName;
	}
	
	@Getter
	@Setter
	@Id
	private String wifeId;
	@Getter
	@Setter
	private String wifeName;
	@Setter
	@Getter
	@OneToOne
	private Husband husband;
	
}
