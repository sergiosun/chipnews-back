package br.com.chipnews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChipnewsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChipnewsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
