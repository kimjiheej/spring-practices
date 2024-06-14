package com.poscodx.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.poscodx.container.config.videosystem.DVDPlayerConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {DVDPlayerConfig.class})
public class DVDPlayerJavaConfigTest {

	
	@Autowired 
	private DVDPlayer dvdPlayer;
	
	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}	
	
	public void testPlay() {
		assertEquals("Playing Movie Marvel's Avengers", dvdPlayer.play());
		
	}
}
