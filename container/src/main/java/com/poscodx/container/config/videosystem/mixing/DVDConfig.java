package com.poscodx.container.config.videosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscodx.container.videosystem.Avengers;
import com.poscodx.container.videosystem.BlankDisc;
import com.poscodx.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDConfig {

	// bean 을 생성시키면서 등록을 하자 
	@Bean
	public DigitalVideoDisc avengers() {
	return new Avengers();
	}
	
	@Bean
	public DigitalVideoDisc avengersInfinityWar() {
	    BlankDisc dvd = new BlankDisc();
	    dvd.setTitle("Avengers Infinity War");
	    dvd.setStudio("Marvel");
	    return dvd;
	}

}
