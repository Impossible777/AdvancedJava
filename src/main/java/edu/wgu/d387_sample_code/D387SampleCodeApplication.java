package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.il8n.DisplayMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class D387SampleCodeApplication {

	private static ArrayList<String> welcomeMessages = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		//Creates two locales, one for English and one for French
		Locale locale1 = Locale.US;
		Locale locale2 = Locale.FRANCE;

		
		//Creates two instances of DisplayMessage.java to get the welcome message in English and French
		CompletableFuture<String> welcomeMessageFuture1 = DisplayMessage.getWelcomeMessage(locale1);
		CompletableFuture<String> welcomeMessageFuture2 = DisplayMessage.getWelcomeMessage(locale2);


		
		//Assigning the values of the welcome messages to a string
		String welcomeMessage1 = welcomeMessageFuture1.join();
		String welcomeMessage2 = welcomeMessageFuture2.join();


		
		//Adding the welcome messages to an array list
		welcomeMessages.add(welcomeMessage1);
		welcomeMessages.add(welcomeMessage2);




	}


	//Getter for the welcome messages
	public ArrayList<String> getWelcomeMessages() {
		return welcomeMessages;
	}









}
