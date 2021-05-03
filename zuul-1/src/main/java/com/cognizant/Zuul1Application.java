package com.cognizant;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jdk.internal.org.jline.utils.Log;


@Slf4j
@SpringBootApplication
public class Zuul1Application {

	public static void main(String[] args) {
		log.debug("");
		SpringApplication.run(Zuul1Application.class, args);
		
	}

}
