package edu.wgu.d387_sample_code;

import il8n.DisplayMessage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class D387SampleCodeApplication {

	private static ArrayList<CompletableFuture<String>> welcomeMessages = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		Locale locale1 = Locale.US;
		Locale locale2 = Locale.FRANCE;

		CompletableFuture<String> welcomeMessageFuture1 = DisplayMessage.getWelcomeMessage(locale1);
		CompletableFuture<String> welcomeMessageFuture2 = DisplayMessage.getWelcomeMessage(locale2);



		welcomeMessages.add(welcomeMessageFuture1);
		welcomeMessages.add(welcomeMessageFuture2);


	}

	public ArrayList<CompletableFuture<String>> getWelcomeMessages() {
		return welcomeMessages;
	}





}
