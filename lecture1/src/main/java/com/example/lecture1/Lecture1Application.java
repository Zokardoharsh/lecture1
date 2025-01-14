package com.example.lecture1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lecture1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lecture1Application.class, args);
	}
      @Autowired
	CakeBaker cakeBaker;

	@Override
	public void run (String... args) throws Exception{
		cakeBaker.bakeCake();
	}


}
