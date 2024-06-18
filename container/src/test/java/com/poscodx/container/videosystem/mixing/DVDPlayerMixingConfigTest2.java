package com.poscodx.container.videosystem.mixing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.poscodx.container.config.videosystem.DVDPlayerConfig;
import com.poscodx.container.config.videosystem.mixing.VideoSystemConfig;
import com.poscodx.container.videosystem.DVDPlayer;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {VideoSystemConfig.class})
public class DVDPlayerMixingConfigTest2 {

	
	@Autowired 
	private DVDPlayer dvdPlayer; 
	
	public void testPlay() {
		assertTrue(1-1 ==0)
		assertEquals("Player Movie Marvel's ", dvdPlayer.play());
	}
	
}
