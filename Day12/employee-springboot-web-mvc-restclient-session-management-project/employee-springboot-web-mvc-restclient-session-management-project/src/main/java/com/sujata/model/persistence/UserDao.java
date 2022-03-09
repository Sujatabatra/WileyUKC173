package com.sujata.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {
	
	@Query("from User where userName=:user and password=:pwd")
	public User findUserByUserNameAndPassword(@Param("user") String username,@Param("pwd") String password);

}
