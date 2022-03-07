package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Rating;
import com.sujata.persistence.RatingDao;

@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
@SpringBootApplication(scanBasePackages = "com.sujata")
public class RatingServiceProjectApplication/* implements CommandLineRunner*/{

//	@Autowired
//	private RatingDao ratingDao;
	
	public static void main(String[] args) {
		SpringApplication.run(RatingServiceProjectApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Rating r1=new Rating(1, "U001", "M001", 4);
//		Rating r2=new Rating(2, "U001", "M004", 5);
//		Rating r3=new Rating(3, "U001", "M005", 5);
//		Rating r4=new Rating(4, "U002", "M002", 4);
//		Rating r5=new Rating(5, "U002", "M003", 4);
//		Rating r6=new Rating(6, "U003", "M001", 3);
//		Rating r7=new Rating(7, "U003", "M002", 4);
//		Rating r8=new Rating(8, "U003", "M003", 5);
//		Rating r9=new Rating(9, "U004", "M004", 5);
//		Rating r10=new Rating(10, "U004", "M005", 4);
//		
//		ratingDao.save(r1);
//		ratingDao.save(r2);
//		ratingDao.save(r3);
//		ratingDao.save(r4);
//		ratingDao.save(r5);
//		ratingDao.save(r6);
//		ratingDao.save(r7);
//		ratingDao.save(r8);
//		ratingDao.save(r9);
//		ratingDao.save(r10);
//	}

}
