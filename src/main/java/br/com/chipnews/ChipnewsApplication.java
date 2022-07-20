package br.com.chipnews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ChipnewsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChipnewsApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}
	@Override
	public void run(String... args) throws Exception {

	}
}
