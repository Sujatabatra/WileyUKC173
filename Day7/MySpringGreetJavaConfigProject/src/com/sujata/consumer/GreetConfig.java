package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sujata.producer.GoodEvening;
import com.sujata.producer.GoodMorning;

@Configuration
public class GreetConfig {

	@Bean
	@Scope("prototype")
	public GoodMorning mrng() {
		GoodMorning goodMorning=new GoodMorning();
		goodMorning.setName("Lili");
		return goodMorning;
	}
	
	@Bean
	public GoodEvening eve() {
		return new GoodEvening("Sean");
	}
}
