package com.dgsspa.techtitans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TechtitansApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechtitansApplication.class, args);
	}

}
