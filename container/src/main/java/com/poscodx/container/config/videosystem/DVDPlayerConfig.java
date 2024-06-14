package com.poscodx.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscodx.container.videosystem.Avengers;
import com.poscodx.container.videosystem.DVDPlayer;
import com.poscodx.container.videosystem.DigitalVideoDisc;


@Configuration
public class DVDPlayerConfig {
   @Bean
   public DigitalVideoDisc avangers() {
      return new Avengers();
   }
   
   // 주입(Injection) 하기 1
   // Bean 생성 메소드를 직접 호출하는 방법
   @Bean
   public DVDPlayer dvdPlayer() {
      return new DVDPlayer(avangers());
   }
   
}
