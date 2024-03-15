package com.example.demo;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		JDA api = JDABuilder.createDefault("MTIxNzc5ODY3MDI4MDU2MDY5MA.Gfaad-.fetv2-pqITLIk35aZbhM2R7zHxTX8EYPYEcLzg").build();
	}

}
