package com.sujata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "MyUser")
public class User {

	@Getter
	@Setter
	@Id
	private String userName;
	
	@Getter
	@Setter
	private String password;
}
