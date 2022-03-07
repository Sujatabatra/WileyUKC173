package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Movie;
import com.sujata.persistence.MovieDao;

@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@SpringBootApplication(scanBasePackages = "com.sujata")
public class MovieServiceProjectApplication/* implements CommandLineRunner*/ {

//	@Autowired
//	private MovieDao movieDao;
	
	public static void main(String[] args) {
		SpringApplication.run(MovieServiceProjectApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Movie m1=new Movie("M001", "Avatar");
//		Movie m2=new Movie("M002", "Titanic");
//		Movie m3=new Movie("M003", "Back to The Future");
//		Movie m4=new Movie("M004", "The Room");
//		Movie m5=new Movie("M005", "The Dark Knight");
//
//		movieDao.save(m1);
//		movieDao.save(m2);
//		movieDao.save(m3);
//		movieDao.save(m4);
//		movieDao.save(m5);
		
//	}

}
